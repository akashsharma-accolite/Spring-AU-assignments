package com.AdapterPattern;


interface Superhero 
{ 
    
    public void fly(); 
    public void fight(); 
} 

class Ironman implements Superhero  
{ 
    public void fly() 
    { 
        System.out.println("Flying"); 
    } 
    public void fight() 
    { 
        System.out.println("Fighting");
    } 
} 
  
interface ToySuperHero 
{ 
    
    public void punch(); 
} 
  
class PlasticToySuperhero implements ToySuperHero  
{ 
    public void punch() 
    { 
        System.out.println("Squeak"); 
    } 
} 
  
class SuperHeroAdapter implements ToySuperHero 
{ 
    Superhero superhero; 
    public SuperHeroAdapter(Superhero superhero) 
    { 
        this.superhero = superhero; 
    } 
  
    public void punch() 
    { 
        superhero.fight(); 
    } 
} 
  
class AdapterPatternDemo 
{ 
    public static void main(String args[]) 
    { 
        Ironman ironman = new Ironman(); 
        ToySuperHero toySuperHero = new PlasticToySuperhero(); 
  
        ToySuperHero superHeroAdapter = new SuperHeroAdapter(ironman); 
  
        System.out.println("Ironman...");  //Ironman
        ironman.fly(); 
        ironman.fight(); 
  
        System.out.println("Toy Superhero..."); 
        toySuperHero.punch(); 
  
        // toy duck behaving like a bird  
        System.out.println("SuperHeroAdapter..."); 
        superHeroAdapter.punch(); 
    } 
} 

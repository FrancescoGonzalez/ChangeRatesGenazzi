package animals;

class Cat extends Felin {


    public static final String NOISE_A_CAT_DOES="meow";

    private final String name;
    public Cat(String name) {
        this.name = name;

    }
  
    public boolean equals(Cat other){
        return this.name.equals(other.name);
    }
    @Override
    public void makeNoise(){
        System.out.println(this.name + " said: "+NOISE_A_CAT_DOES);
    }

    

}
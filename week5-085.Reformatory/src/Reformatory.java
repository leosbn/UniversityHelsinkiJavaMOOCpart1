public class Reformatory {
    private int i=0;
    public Reformatory() {
        
    }
    
        public int weight(Person person) {
        // return the weight of the person
        
        i++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return i;
    }

}

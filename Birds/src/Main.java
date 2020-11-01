public class Main {
    public static void main(String[] args) {
        Bird [] bird = new Bird[4];
        bird[0] = new Eagle(true, true, "Eagle");
        bird[1] = new Swallow(true, true, "Swallow");
        bird[2] = new Penguin(false, true, "Penguin");
        bird[3] = new Chicken(true, true, "Chicken");

        for(int i = 0; i < bird.length; i++){
            System.out.println(bird[i].name + " : " + bird[i].fly()
                    + " Have feathers? " + bird[i].feathers
                    + " Lay eggs? " + bird[i].layEggs);
        }
    }
}

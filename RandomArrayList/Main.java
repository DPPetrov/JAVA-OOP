package RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<Integer>();

        randomArrayList.add(13);
        randomArrayList.add(23);
        randomArrayList.add(42);
        randomArrayList.add(54);

        System.out.println(randomArrayList.getRandomElement());
    }
}

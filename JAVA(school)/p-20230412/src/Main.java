public class Main {
    public static void main(String[] args) {
        cat cat = new cat();
        cow cow = new cow();
        lion lion = new lion();
        tiger tiger = new tiger();

        System.out.println("호랑이 다리: "+ tiger.leg);
        System.out.println("사자 다리: "+ lion.leg);
        System.out.println("소 다리: "+ cow.leg);
        System.out.println("고양이 다리: "+ cat.leg);

        tiger.sound();
        lion.sound();
        cow.sound();
        cat.sound();
    }
}
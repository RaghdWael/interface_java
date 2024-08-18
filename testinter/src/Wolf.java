public class Wolf implements Animals{


    @Override
    public void eat() {
        System.out.println("متواضع بياكل اى حاجة بتتنفس ...ممكن ياكلك انت شخصيا :Wolf");

    }

    @Override
    public void name() {
        System.out.println("ذئبوب :Wolf");
    }
//
//    @Override
//    public void eat1() {
//
//    }
//
//    @Override
//    public void live1() {
//
//    }
//
//    @Override
//    public void name1() {
//
//    }

    @Override
    public void live() {
        System.out.println("بيعيش ف الغابات وف القصر الجمهورى واى حتة :Wolf");
    }
}
class Animal {
    void sound(){
        System.out.println("con mèo kêu sao");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("gâu gâu");
    }

    void wagTail() {
        System.out.println("Dog is wagging tail");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("mèo méo meo mèo meo");
    }
}
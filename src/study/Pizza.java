package study;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void setTopping(String topping){
        this.topping = topping;
    }

    //Abstract Builder
    abstract class PizzaBuider{
        protected Pizza pizza;
        public Pizza getPizza(){
            return pizza;
        }
        public void createNewPizzaProduct(){
            pizza = new Pizza();
        }
        public abstract void buildDough();
        public abstract void buildSauce();
        public abstract void buildTopping();
    }

    //ConcreteBuilder
    class HawaiianPizzaBuilder extends PizzaBuider{
        @Override
        public void buildDough() {
            pizza.setDough("cross");
        }

        @Override
        public void buildSauce() {
            pizza.setDough("mild");
        }

        @Override
        public void buildTopping() {
            pizza.setTopping("ham+pineapple");
        }
    }

    //ConcreteBuilder
    class SpicyPizzaBuilder extends PizzaBuider{
        @Override
        public void buildDough() {
            pizza.setDough("pan baked");
        }

        @Override
        public void buildSauce() {
            pizza.setSauce("hot");
        }

        @Override
        public void buildTopping() {
            pizza.setTopping("pepperoni+salami");
        }
    }
}


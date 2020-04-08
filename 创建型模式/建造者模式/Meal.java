package 创建型模式.建造者模式;

    public class Meal {
        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        private String food;

        public String getDrink() {
            return drink;
        }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    private String drink;
}

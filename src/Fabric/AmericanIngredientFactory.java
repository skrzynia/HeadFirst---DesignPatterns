package Fabric;

public class ItalianIngredientFactory implements IngredientAbstractFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaDiBuffala();
    }

    @Override
    public Meat createMeat() {
        return new Parma();
    }

    @Override
    public Vegetable createVegetable() {
        return new Basil();
    }
}

package core.basesyntax.service.strategy;

import core.basesyntax.dao.FruitDaoImpl;
import core.basesyntax.exeption.FruitShopExeption;
import core.basesyntax.service.FruitService;

public class AddingToBalanceService extends FruitService {

    public AddingToBalanceService() {
        fruitDao = new FruitDaoImpl();
    }

    @Override
    public void moveFruit(String fruit, Integer amount) {
        if (fruit == null || amount == null) {
            throw new FruitShopExeption("Incorrect input data in adding action");
        }
        fruitDao.add(fruit, amount);
    }
}

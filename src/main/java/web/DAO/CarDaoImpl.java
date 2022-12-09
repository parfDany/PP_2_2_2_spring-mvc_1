package web.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {


    public final List<Car> carList;


    {
        carList = new ArrayList<>();
        carList.add((new Car("Audi", "Green", 150)));
        carList.add((new Car("Aston Martine", "Red", 402)));
        carList.add((new Car("Volkswagen", "Black", 180)));
        carList.add((new Car("BMW", "Yellow", 225)));
        carList.add((new Car("Jeep", "White", 249)));
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

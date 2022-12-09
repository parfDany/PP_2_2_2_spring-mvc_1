package web.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.Model.Car;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao cars;

    @Autowired
    public CarServiceImpl(CarDao cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.getCarList(count);
    }
}

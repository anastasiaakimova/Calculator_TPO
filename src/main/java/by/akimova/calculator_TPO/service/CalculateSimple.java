package by.akimova.calculator_TPO.service;

import by.akimova.calculator_TPO.model.OperationModel;
import org.springframework.stereotype.Service;

/**
 * The business logic for model.
 *
 * @author anastasiyaakimava
 * @version 1.0
 */
@Service
public class CalculateSimple {

    /**
     * The method zeroes components.
     *
     * @param model with not zero components.
     * @return model with zero components.
     */
    public OperationModel clearSimple(OperationModel model) {
        model.setA(0);
        model.setB(0);
        return model;
    }
//    public int add(OperationModel model) {
//        return model.getA() + model.getB();
//    }
//
//    public int subtract(OperationModel model) {
//        return model.getA() - model.getB();
//    }
//
//    public int multiply(OperationModel model) {
//        return model.getA() * model.getB();
//    }
//
//    public double divide(OperationModel model) {
//        if (model.getA() == 0) return 0;
//        if (model.getB() == 0) return 0;
//        return (double) model.getA() / model.getB();
//    }
//
//    public double sqrt(OperationModel model) {
//        return Math.sqrt(model.getB());
//    }
//
//    public int power(OperationModel model) {
//        return model.getB() * model.getB();
//    }


}

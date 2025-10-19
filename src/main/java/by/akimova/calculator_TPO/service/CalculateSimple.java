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
}

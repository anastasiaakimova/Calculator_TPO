package by.akimova.calculator_TPO.controller;

import by.akimova.calculator_TPO.model.OperationModel;
import by.akimova.calculator_TPO.service.CalculateSimple;
import com.epam.tat.module4.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller work with requests.
 *
 * @author anastasiyaakimava
 * @version 1.0
 */
@Controller
public class CalculatorController {

    OperationModel operationModel = new OperationModel();

    private CalculateSimple calculateSimple;
    private Calculator calculator;

    @Autowired
    public void setCalculator(Calculator calculator, CalculateSimple calculateSimple) {
        this.calculator = calculator;
        this.calculateSimple = calculateSimple;
    }

    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model) {
        model.addAttribute("operationModel", operationModel);
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.sum(operationModel.getA(), operationModel.getB()));
        return "calculator";
    }


    @RequestMapping(value = "/calculator", params = "subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.sub(operationModel.getA(), operationModel.getB()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.mult(operationModel.getA(), operationModel.getB()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.div(operationModel.getA(), operationModel.getB()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.sqrt(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.pow(operationModel.getA(), operationModel.getB()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("operationModel", calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "sin", method = RequestMethod.POST)
    public String sin(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.sin(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "cos", method = RequestMethod.POST)
    public String cos(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.cos(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "tg", method = RequestMethod.POST)
    public String tg(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.tg(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "ctg", method = RequestMethod.POST)
    public String ctg(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.ctg(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "isPositive", method = RequestMethod.POST)
    public String isPositive(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.isPositive(operationModel.getA()));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "isNegative", method = RequestMethod.POST)
    public String isNegative(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("result", calculator.isNegative(operationModel.getA()));
        return "calculator";
    }

}

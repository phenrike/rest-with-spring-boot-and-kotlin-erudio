package br.com.erudio.math

import br.com.erudio.converter.NumberConverter
import br.com.erudio.exceptions.UnsupportedMathOperationException

class SimpleMath {
    fun sum(numberOne: String?,numberTwo: String?): Double{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw UnsupportedMathOperationException("Please set a numeric value!")

        return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)
    }

    fun sub(numberOne: String?, numberTwo: String?): Double{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw UnsupportedMathOperationException("Please set a numeric value!")

        return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo)
    }

    fun div(numberOne: String?, numberTwo: String?): Double{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw UnsupportedMathOperationException("Please set a numeric value!")

        return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo)
    }

    fun avg(numberOne: String?,numberTwo: String?): Double{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw UnsupportedMathOperationException("Please set a numeric value!")

        return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2
    }

    fun sqrt(number: String?): Double{
        if(!NumberConverter.isNumeric(number)) throw UnsupportedMathOperationException("Please set a numeric value!")

        return kotlin.math.sqrt(NumberConverter.convertToDouble(number))
    }
}
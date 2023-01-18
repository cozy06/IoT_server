package com.cozy06.GPIO

import com.pi4j.io.gpio.*

class GPIO {
    fun control(pinNum: Int, Power: Boolean) {

        GpioFactory.setDefaultProvider(RaspiGpioProvider(RaspiPinNumberingScheme.BROADCOM_PIN_NUMBERING))
        val gpio = GpioFactory.getInstance()
        val pin = gpio.provisionDigitalOutputPin(getPinByNumber(pinNum))
        when(Power) {
            true -> pin.high()
            false -> pin.low()
        }
        gpio.shutdown()
        gpio.unprovisionPin(pin)
    }

    fun getPinByNumber(number: Int): Pin {
        return when (number) {
            2 -> RaspiPin.GPIO_02
            3 -> RaspiPin.GPIO_03
            4 -> RaspiPin.GPIO_04
            14 -> RaspiPin.GPIO_14
            15 -> RaspiPin.GPIO_15
            17 -> RaspiPin.GPIO_17
            18 -> RaspiPin.GPIO_18
            27 -> RaspiPin.GPIO_27
            22 -> RaspiPin.GPIO_22
            23 -> RaspiPin.GPIO_23
            24 -> RaspiPin.GPIO_24
            10 -> RaspiPin.GPIO_10
            9 -> RaspiPin.GPIO_09
            25 -> RaspiPin.GPIO_25
            11 -> RaspiPin.GPIO_11
            8 -> RaspiPin.GPIO_08
            7 -> RaspiPin.GPIO_07
            else -> throw IllegalArgumentException("Invalid pin number")
        }
    }
}
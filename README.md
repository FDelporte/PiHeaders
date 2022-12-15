# Raspberry Pi headerPins

Java library with headerPins and pins of all Raspberry Pi boards

> **Warning**
> This project is no longer maintained. A newer and extended version is available in https://github.com/Pi4J/pi4j-board-info.

## Info

## Auto-generated info


### Pi models

| Name | Label | Description | 
| :--- | :--- | :--- | 
| MODEL_A | Model A | Without ethernet connector | 
| MODEL_B | Model B | With ethernet connector | 
| COMPUTE | Compute Module | Pi on a 200-pin DDR2-memory-like module for integration in embedded devices | 
| ZERO | Zero | Smaller size and reduced GPIO capabilities | 


### Pi board versions

| Name | Label | Model | Header version | Release date | 
| :--- | :--- | :--- | :--- | :--- | 
| MODEL_1_A | Pi 1 Model A | MODEL_A | TYPE_1 | 2013-02 | 
| MODEL_1_A_PLUS | Pi 1 Model A+ | MODEL_A | TYPE_1 | 2014-11 | 
| MODEL_3_A_PLUS | Pi 3 Model A+ | MODEL_A | TYPE_3 | 2018-11 | 
| MODEL_1_B | Pi 1 Model B | MODEL_B | TYPE_1 | 2012-04 | 
| MODEL_1_B_PLUS | Pi 1 Model B+ | MODEL_B | TYPE_1 | 2014-07 | 
| MODEL_2_B | Pi 2 Model B | MODEL_B | TYPE_2 | 2015-02 | 
| MODEL_2_B_V2 | Pi 2 Model B V1.2 | MODEL_B | TYPE_2 | 2016-10 | 
| MODEL_3_B | Pi 3 Model B | MODEL_B | TYPE_3 | 2016-02 | 
| MODEL_3_B_PLUS | Pi 3 Model B+ | MODEL_B | TYPE_3 | 2018-03 | 
| MODEL_4_B | Pi 4 Model B | MODEL_B | TYPE_3 | 2019-06 | 
| COMPUTE_1 | Compute Module 1 | COMPUTE | COMPUTE | 2014-04 | 
| COMPUTE_3 | Compute Module 3 | COMPUTE | COMPUTE | 2017-01 | 
| COMPUTE_3_LITE | Compute Module 3 Lite | COMPUTE | COMPUTE | 2017-01 | 
| COMPUTE_3_PLUS | Compute Module 3+ | COMPUTE | COMPUTE | 2019-01 | 
| COMPUTE_3_PLUS_LITE | Compute Module 3+ Lite | COMPUTE | COMPUTE | 2019-01 | 
| ZERO_PCB_1_2 | Pi Zero PCB V1.2 | ZERO | TYPE_2 | 2015-11 | 
| ZERO_PCB_1_3 | Pi Zero PCB V1.3 | ZERO | TYPE_3 | 2016-05 | 
| ZERO_W | Pi Zero W | ZERO | TYPE_3 | 2017-02 | 


### Pin types

| Name | Label | Color | 
| :--- | :--- | :--- | 
| POWER | Power | #990000 | 
| GROUND | Ground | #0 | 
| DIGITAL | Digital | #9900 | 
| DIGITAL_AND_PWM | Digital and PWM | #ff7ff00 | 
| DIGITAL_NO_PULL_DOWN | Digital without pulldown | #800080 | 


### Pin functions

| Name | Label | Description | 
| :--- | :--- | :--- | 
| UART | Universal Asynchronous Receiver and Transmitter | Asynchronous serial communication protocol | 
| GPCLK | General Purpose Clock | Output a fixed frequency | 
| I2C | Inter Integrated Circuit | Synchronous serial computer bus | 
| SPI | Serial Peripheral Interface | Four-wire serial bus | 


### Header versions

| Name | Label | Description | Headers | 
| :--- | :--- | :--- | :--- | 
| TYPE_1 | Type 1 | Used on original Model B | 26pin header - type 1 | 
| TYPE_2 | Type 2 | Used on Model A and Model B (revision 2) | 26pin header - type 2 + 8pin header | 
| TYPE_3 | Type 3 | Used on Model A+, B+, Pi Zero, Pi Zero W, Pi2B, Pi3B, Pi4B | 40pin header | 
| COMPUTE | Compute Module | 54 GPIO | Compute J5 + Compute J6 | 


### Header types

#### 8pin header

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | POWER |  |  |  | 5.0 VDC |  | 
| 2 | POWER |  |  |  | 3.3 VDC |  | 
| 3 | DIGITAL |  | 28 | 17 |  |  | 
| 4 | DIGITAL |  | 29 | 18 |  |  | 
| 5 | DIGITAL |  | 30 | 19 |  |  | 
| 6 | DIGITAL |  | 31 | 20 |  |  | 
| 7 | GROUND |  |  |  | Ground |  | 
| 8 | GROUND |  |  |  | Ground |  | 


#### 26pin header - type 1

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | POWER |  |  |  | 3.3 VDC |  | 
| 2 | POWER |  |  |  | 5.0 VDC |  | 
| 3 | DIGITAL_NO_PULL_DOWN | I2C | 0 | 8 | SDA1 (I2C) | SDA.1 pin has a physical pull-up resistor | 
| 4 | POWER |  |  |  | 5.0 VDC |  | 
| 5 | DIGITAL_NO_PULL_DOWN | I2C | 1 | 9 | SCL1 (I2C) | SCL.1 pin has a physical pull-up resistor | 
| 6 | GROUND |  |  |  | Ground |  | 
| 7 | DIGITAL | GPCLK | 4 | 7 | GPCLK0 |  | 
| 8 | DIGITAL | UART | 14 | 15 | UART TxD |  | 
| 9 | GROUND |  |  |  | Ground |  | 
| 10 | DIGITAL | UART | 15 | 16 | UART RxD |  | 
| 11 | DIGITAL | SPI | 17 | 0 |  |  | 
| 12 | DIGITAL_AND_PWM | SPI | 18 | 1 | PCM_CLK/PWM0 | Supports PWM0 [ALT5] | 
| 13 | DIGITAL |  | 21 | 2 |  |  | 
| 14 | GROUND |  |  |  | Ground |  | 
| 15 | DIGITAL |  | 22 | 3 |  |  | 
| 16 | DIGITAL |  | 23 | 4 |  |  | 
| 17 | POWER |  |  |  | 3.3 VDC |  | 
| 18 | DIGITAL |  | 24 | 5 |  |  | 
| 19 | DIGITAL | SPI | 10 | 12 | MOSI (SPI) |  | 
| 20 | GROUND |  |  |  | Ground |  | 
| 21 | DIGITAL | SPI | 9 | 13 | MISO (SPI) |  | 
| 22 | DIGITAL |  | 25 | 6 |  |  | 
| 23 | DIGITAL | SPI | 11 | 14 | SCLK (SPI) |  | 
| 24 | DIGITAL | SPI | 8 | 10 | CE0 (SPI) |  | 
| 25 | GROUND |  |  |  | Ground |  | 
| 26 | DIGITAL | SPI | 7 | 11 | CE1 (SPI) |  | 


#### 26pin header - type 2

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | POWER |  |  |  | 3.3 VDC |  | 
| 2 | POWER |  |  |  | 5.0 VDC |  | 
| 3 | DIGITAL_NO_PULL_DOWN | I2C | 2 | 8 | SDA1 (I2C) | SDA.1 pin has a physical pull-up resistor | 
| 4 | POWER |  |  |  | 5.0 VDC |  | 
| 5 | DIGITAL_NO_PULL_DOWN | I2C | 3 | 9 | SCL1 (I2C) | SCL.1 pin has a physical pull-up resistor | 
| 6 | GROUND |  |  |  | Ground |  | 
| 7 | DIGITAL | GPCLK | 4 | 7 | GPCLK0 |  | 
| 8 | DIGITAL | UART | 14 | 15 | UART TxD |  | 
| 9 | GROUND |  |  |  | Ground |  | 
| 10 | DIGITAL | UART | 15 | 16 | UART RxD |  | 
| 11 | DIGITAL | SPI | 17 | 0 |  |  | 
| 12 | DIGITAL_AND_PWM | SPI | 18 | 1 | PCM_CLK/PWM0 | Supports PWM0 [ALT5] | 
| 13 | DIGITAL |  | 27 | 2 |  |  | 
| 14 | GROUND |  |  |  | Ground |  | 
| 15 | DIGITAL |  | 22 | 3 |  |  | 
| 16 | DIGITAL |  | 23 | 4 |  |  | 
| 17 | POWER |  |  |  | 3.3 VDC |  | 
| 18 | DIGITAL |  | 24 | 5 |  |  | 
| 19 | DIGITAL | SPI | 10 | 12 | MOSI (SPI) |  | 
| 20 | GROUND |  |  |  | Ground |  | 
| 21 | DIGITAL | SPI | 9 | 13 | MISO (SPI) |  | 
| 22 | DIGITAL |  | 25 | 6 |  |  | 
| 23 | DIGITAL | SPI | 11 | 14 | SCLK (SPI) |  | 
| 24 | DIGITAL | SPI | 8 | 10 | CE0 (SPI) |  | 
| 25 | GROUND |  |  |  | Ground |  | 
| 26 | DIGITAL | SPI | 7 | 11 | CE1 (SPI) |  | 


#### 40pin header

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | POWER |  |  |  | 3.3 VDC |  | 
| 2 | POWER |  |  |  | 5.0 VDC |  | 
| 3 | DIGITAL_NO_PULL_DOWN | I2C | 2 | 8 | SDA1 (I2C) | SDA.1 pin has a physical pull-up resistor | 
| 4 | POWER |  |  |  | 5.0 VDC |  | 
| 5 | DIGITAL_NO_PULL_DOWN | I2C | 3 | 9 | SCL1 (I2C) | SCL.1 pin has a physical pull-up resistor | 
| 6 | GROUND |  |  |  | Ground |  | 
| 7 | DIGITAL | GPCLK | 4 | 7 | GPCLK0 |  | 
| 8 | DIGITAL | UART | 14 | 15 | UART TxD |  | 
| 9 | GROUND |  |  |  | Ground |  | 
| 10 | DIGITAL | UART | 15 | 16 | UART RxD |  | 
| 11 | DIGITAL | SPI | 17 | 0 |  |  | 
| 12 | DIGITAL_AND_PWM | SPI | 18 | 1 | PCM_CLK/PWM0 | Supports PWM0 [ALT5] | 
| 13 | DIGITAL |  | 27 | 2 |  |  | 
| 14 | GROUND |  |  |  | Ground |  | 
| 15 | DIGITAL |  | 22 | 3 |  |  | 
| 16 | DIGITAL |  | 23 | 4 |  |  | 
| 17 | POWER |  |  |  | 3.3 VDC |  | 
| 18 | DIGITAL |  | 24 | 5 |  |  | 
| 19 | DIGITAL | SPI | 10 | 12 | MOSI (SPI) |  | 
| 20 | GROUND |  |  |  | Ground |  | 
| 21 | DIGITAL | SPI | 9 | 13 | MISO (SPI) |  | 
| 22 | DIGITAL |  | 25 | 6 |  |  | 
| 23 | DIGITAL | SPI | 11 | 14 | SCLK (SPI) |  | 
| 24 | DIGITAL | SPI | 8 | 10 | CE0 (SPI) |  | 
| 25 | GROUND |  |  |  | Ground |  | 
| 26 | DIGITAL | SPI | 7 | 11 | CE1 (SPI) |  | 
| 27 | DIGITAL_NO_PULL_DOWN | I2C | 0 | 30 | SDA0 I2C ID EEPROM | SDA.0 pin has a physical pull-up resistor | 
| 28 | DIGITAL_NO_PULL_DOWN | I2C | 1 | 31 | SCL0 I2C ID EEPROM | SDC.0 pin has a physical pull-up resistor | 
| 29 | DIGITAL | GPCLK | 5 | 21 | GPCLK1 |  | 
| 30 | GROUND |  |  |  | Ground |  | 
| 31 | DIGITAL | GPCLK | 6 | 22 | GPCL2 |  | 
| 32 | DIGITAL_AND_PWM |  | 12 | 26 | PWM0 | Supports PWM0 [ALT0] | 
| 33 | DIGITAL_AND_PWM |  | 13 | 23 | PWM1 | Supports PWM1 [ALT0] | 
| 34 | GROUND |  |  |  | Ground |  | 
| 35 | DIGITAL_AND_PWM | SPI | 19 | 24 | PCM_FS/PWM1 | Supports PWM1 [ALT5] | 
| 36 | DIGITAL | SPI | 16 | 27 |  |  | 
| 37 | DIGITAL |  | 26 | 25 |  |  | 
| 38 | DIGITAL | SPI | 20 | 28 | PCM_DIN |  | 
| 39 | GROUND |  |  |  | Ground |  | 
| 40 | DIGITAL | SPI | 21 | 29 | PCM_DOUT |  | 


#### Compute J5

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 


#### Compute J6

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 




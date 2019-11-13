# Raspberry Pi headers
Java library with headers and pins of all Raspberry Pi boards 

## Info

## Auto-generated info


### Pi models

| Name | Description | 
| :--- | :--- | 
| Model A | Without ethernet connector | 
| Model B | With ethernet connector | 
| Compute Module | Pi on a 200-pin DDR2-memory-like module for integration in embedded devices | 
| Zero | Smaller size and reduced GPIO capabilities | 


### Pi major versions

| Name | Description | Headers | 
| :--- | :--- | :--- | 
| Version 1 | First generation | 26pin header | 
| Version 2 | Added more RAM | 26pin header + 8pin header | 
| Version 3 | Including WiFi and Bluetooth | 40pin header | 
| Version 4 | Gigabit ethernet, USB 3.0 and dual monitor | 40pin header | 


### Pi board versions

| Name | Model | Version | Release date | 
| :--- | :--- | :--- | :--- | 
| Pi 1 Model A | Model A | Version 1 | 2013-02 | 
| Pi 1 Model A+ | Model A | Version 1 | 2014-11 | 
| Pi 3 Model A+ | Model A | Version 3 | 2018-11 | 
| Pi 1 Model B | Model B | Version 1 | 2012-04 | 
| Pi 1 Model B+ | Model B | Version 1 | 2014-07 | 
| Pi 2 Model B | Model B | Version 2 | 2015-02 | 
| Pi 2 Model B V1.2 | Model B | Version 2 | 2016-10 | 
| Pi 3 Model B | Model B | Version 3 | 2016-02 | 
| Pi 3 Model B+ | Model B | Version 3 | 2018-03 | 
| Pi 4 Model B | Model B | Version 4 | 2019-06 | 
| Compute Module 1 | Compute Module | Version 4 | 2014-04 | 
| Compute Module 3 | Compute Module | Version 4 | 2017-01 | 
| Compute Module 3 Lite | Compute Module | Version 4 | 2017-01 | 
| Compute Module 3+ | Compute Module | Version 4 | 2019-01 | 
| Compute Module 3+ Lite | Compute Module | Version 4 | 2019-01 | 
| Pi Zero PCB V1.2 | Zero | Version 2 | 2015-11 | 
| Pi Zero PCB V1.3 | Zero | Version 3 | 2016-05 | 
| Pi Zero W | Zero | Version 4 | 2017-02 | 


### Pin types

| Name | Color | 
| :--- | :--- | 
| Power | #990000 | 
| Ground | #0 | 
| Digital | #9900 | 
| Digital and PWM | #ff7ff00 | 
| Digital without pulldown | #800080 | 


### Pin functions

| Name | Description | 
| :--- | :--- | 
| Universal Asynchronous Receiver and Transmitter | Asynchronous serial communication protocol | 
| General Purpose Clock | Output a fixed frequency | 
| Inter Integrated Circuit | Synchronous serial computer bus | 
| Serial Peripheral Interface | Four-wire serial bus | 
### Header types

#### 8pin header

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | Power |  |  |  | 5.0 VDC |  | 
| 2 | Power |  |  |  | 3.3 VDC |  | 
| 3 | Digital |  | 28 | 17 |  |  | 
| 4 | Digital |  | 29 | 18 |  |  | 
| 5 | Digital |  | 30 | 19 |  |  | 
| 6 | Digital |  | 31 | 20 |  |  | 
| 7 | Ground |  |  |  | Ground |  | 
| 8 | Ground |  |  |  | Ground |  | 
#### 26pin header

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | Power |  |  |  | 3.3 VDC |  | 
| 2 | Power |  |  |  | 5.0 VDC |  | 
| 3 | Digital without pulldown | Inter Integrated Circuit | 2 | 8 | SDA1 (I2C) | SDA.1 pin has a physical pull-up resistor | 
| 4 | Power |  |  |  | 5.0 VDC |  | 
| 5 | Digital without pulldown | Inter Integrated Circuit | 3 | 9 | SCL1 (I2C) | SCL.1 pin has a physical pull-up resistor | 
| 6 | Ground |  |  |  | Ground |  | 
| 7 | Digital | General Purpose Clock | 4 | 7 | GPCLK0 |  | 
| 8 | Digital | Universal Asynchronous Receiver and Transmitter | 14 | 15 | UART TxD |  | 
| 9 | Ground |  |  |  | Ground |  | 
| 10 | Digital | Universal Asynchronous Receiver and Transmitter | 15 | 16 | UART RxD |  | 
| 11 | Digital | Serial Peripheral Interface | 17 | 0 |  |  | 
| 12 | Digital and PWM | Serial Peripheral Interface | 18 | 1 | PCM_CLK/PWM0 | Supports PWM0 [ALT5] | 
| 13 | Digital |  | 27 | 2 |  |  | 
| 14 | Ground |  |  |  | Ground |  | 
| 15 | Digital |  | 22 | 3 |  |  | 
| 16 | Digital |  | 23 | 4 |  |  | 
| 17 | Power |  |  |  | 3.3 VDC |  | 
| 18 | Digital |  | 24 | 5 |  |  | 
| 19 | Digital | Serial Peripheral Interface | 10 | 12 | MOSI (SPI) |  | 
| 20 | Ground |  |  |  | Ground |  | 
| 21 | Digital | Serial Peripheral Interface | 9 | 13 | MISO (SPI) |  | 
| 22 | Digital |  | 25 | 6 |  |  | 
| 23 | Digital | Serial Peripheral Interface | 11 | 14 | SCLK (SPI) |  | 
| 24 | Digital | Serial Peripheral Interface | 8 | 10 | CE0 (SPI) |  | 
| 25 | Ground |  |  |  | Ground |  | 
| 26 | Digital | Serial Peripheral Interface | 7 | 11 | CE1 (SPI) |  | 
#### 40pin header

| Pin n° | Type | Function | BCM n° | Wiring pi n° | Name | Remark | 
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| 1 | Power |  |  |  | 3.3 VDC |  | 
| 2 | Power |  |  |  | 5.0 VDC |  | 
| 3 | Digital without pulldown | Inter Integrated Circuit | 2 | 8 | SDA1 (I2C) | SDA.1 pin has a physical pull-up resistor | 
| 4 | Power |  |  |  | 5.0 VDC |  | 
| 5 | Digital without pulldown | Inter Integrated Circuit | 3 | 9 | SCL1 (I2C) | SCL.1 pin has a physical pull-up resistor | 
| 6 | Ground |  |  |  | Ground |  | 
| 7 | Digital | General Purpose Clock | 4 | 7 | GPCLK0 |  | 
| 8 | Digital | Universal Asynchronous Receiver and Transmitter | 14 | 15 | UART TxD |  | 
| 9 | Ground |  |  |  | Ground |  | 
| 10 | Digital | Universal Asynchronous Receiver and Transmitter | 15 | 16 | UART RxD |  | 
| 11 | Digital | Serial Peripheral Interface | 17 | 0 |  |  | 
| 12 | Digital and PWM | Serial Peripheral Interface | 18 | 1 | PCM_CLK/PWM0 | Supports PWM0 [ALT5] | 
| 13 | Digital |  | 27 | 2 |  |  | 
| 14 | Ground |  |  |  | Ground |  | 
| 15 | Digital |  | 22 | 3 |  |  | 
| 16 | Digital |  | 23 | 4 |  |  | 
| 17 | Power |  |  |  | 3.3 VDC |  | 
| 18 | Digital |  | 24 | 5 |  |  | 
| 19 | Digital | Serial Peripheral Interface | 10 | 12 | MOSI (SPI) |  | 
| 20 | Ground |  |  |  | Ground |  | 
| 21 | Digital | Serial Peripheral Interface | 9 | 13 | MISO (SPI) |  | 
| 22 | Digital |  | 25 | 6 |  |  | 
| 23 | Digital | Serial Peripheral Interface | 11 | 14 | SCLK (SPI) |  | 
| 24 | Digital | Serial Peripheral Interface | 8 | 10 | CE0 (SPI) |  | 
| 25 | Ground |  |  |  | Ground |  | 
| 26 | Digital | Serial Peripheral Interface | 7 | 11 | CE1 (SPI) |  | 
| 27 | Digital without pulldown | Inter Integrated Circuit | 0 | 30 | SDA0 I2C ID EEPROM | SDA.0 pin has a physical pull-up resistor | 
| 28 | Digital without pulldown | Inter Integrated Circuit | 1 | 31 | SCL0 I2C ID EEPROM | SDC.0 pin has a physical pull-up resistor | 
| 29 | Digital | General Purpose Clock | 5 | 21 | GPCLK1 |  | 
| 30 | Ground |  |  |  | Ground |  | 
| 31 | Digital | General Purpose Clock | 6 | 22 | GPCL2 |  | 
| 32 | Digital and PWM |  | 12 | 26 | PWM0 | Supports PWM0 [ALT0] | 
| 33 | Digital and PWM |  | 13 | 23 | PWM1 | Supports PWM1 [ALT0] | 
| 34 | Ground |  |  |  | Ground |  | 
| 35 | Digital and PWM | Serial Peripheral Interface | 19 | 24 | PCM_FS/PWM1 | Supports PWM1 [ALT5] | 
| 36 | Digital | Serial Peripheral Interface | 16 | 27 |  |  | 
| 37 | Digital |  | 26 | 25 |  |  | 
| 38 | Digital | Serial Peripheral Interface | 20 | 28 | PCM_DIN |  | 
| 39 | Ground |  |  |  | Ground |  | 
| 40 | Digital | Serial Peripheral Interface | 21 | 29 | PCM_DOUT |  | 


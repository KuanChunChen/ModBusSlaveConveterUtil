package com.oring.modbusutil

import com.oring.modbusutil.constants.ModBusSlaveKey
import com.oring.modbusutil.util.ModBusUtil

fun main() {


    val inputBytes = "FFFF"
    println("0.Init hex string :${inputBytes}")
    println("1.To ${ModBusSlaveKey.SIGNED.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SIGNED, inputBytes)} ")
    println("2.To ${ModBusSlaveKey.UNSIGNED.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UNSIGNED, inputBytes)} ")
    println("3.To ${ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN, inputBytes)} ")
    println("4.To ${ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN, inputBytes)} ")
    println("5.To ${ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("6.To ${ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("7.To ${ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN, inputBytes)} ")
    println("8.To ${ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN, inputBytes)} ")
    println("9.To ${ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("10.To ${ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("11.To ${ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN, inputBytes)} ")
    println("12.To ${ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN, inputBytes)} ")
    println("13.To ${ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("14.To ${ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("15.To ${ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN, inputBytes)} ")
    println("16.To ${ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN, inputBytes)} ")
    println("17.To ${ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("18.To ${ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("19.To ${ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN, inputBytes)} ")
    println("20.To ${ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN, inputBytes)} ")
    println("21.To ${ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes)} ")
    println("22.To ${ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.function} : ${ModBusUtil.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes)} ")


}
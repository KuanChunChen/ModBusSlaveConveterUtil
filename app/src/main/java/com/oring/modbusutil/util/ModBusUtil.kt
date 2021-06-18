package com.oring.modbusutil.util

import com.oring.modbusutil.constants.ModBusSlaveKey
import java.lang.Float.intBitsToFloat
import java.math.BigInteger


object ModBusUtil {

    fun modBodSlaveConverter(slaveKey: ModBusSlaveKey, inputHex: String): String {
        var convertValue = ""

        if (inputHex.length != 4) {
            return convertValue
        }
        when (slaveKey) {
            ModBusSlaveKey.SIGNED -> {
                convertValue = hex32ToSinged16Dec(inputHex)

            }
            ModBusSlaveKey.UNSIGNED -> {
                convertValue = hex32ToUnSingedDec(inputHex)

            }
            ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN -> {
                convertValue = hexTo32SingedBigEndian(inputHex)

            }
            ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN -> {
                convertValue = hexTo32SingedLittleEndian(inputHex)

            }
            ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32SingedBigEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32SingedLittleEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN -> {
                convertValue = hexTo32UnSingedBigEndian(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN -> {
                convertValue = hexTo32UnSingedLittleEndian(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32UnSingedBigEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32UnSingedLittleEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN -> {
                convertValue = hexTo64SingedBigEndian(inputHex)

            }
            ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN -> {
                convertValue = hexTo64SingedLittleEndian(inputHex)

            }
            ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo64SingedBigEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo64SingedLittleEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN -> {
                convertValue = hexTo64UnSingedBigEndian(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN -> {
                convertValue = hexTo64UnSingedLittleEndian(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo64UnSingedBigEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo64UnSingedLittleEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN -> {
                convertValue = hexTo32FloatBigEndian(inputHex)

            }
            ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN -> {
                convertValue = hexTo32FloatLittleEndian(inputHex)

            }
            ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32FloatBigEndianByteSwap(inputHex)

            }
            ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP -> {
                convertValue = hexTo32FloatLittleEndianByteSwap(inputHex)

            }


        }
        return convertValue

    }

    private fun hex32ToSinged16Dec(hex: String): String {

        return hex.toInt(16).toShort().toString()
    }

    private fun hex32ToUnSingedDec(hex: String): String {

        return hex.toInt(16).toString()
    }

    private fun hexToBinary(hex: String): String {

        Integer.toBinaryString(hex.toInt(16)).let {
            var returnString = it
            val lostSize = (it.length / 4) % 4
            return if (lostSize == 0) {
                returnString
            } else {
                for (index in 1..lostSize) {
                    returnString = "0$returnString"
                }
                returnString
            }
        }

    }

    fun binaryToDec(binaryString: String): String {

        return binaryString.toInt(2).toString()
    }

    private fun hexTo32SingedBigEndian(hex: String): String {

        val newHex = hex + "0000"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo32SingedBigEndianByteSwap(hex: String): String {

        val newHex = hex + "0000"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo64SingedBigEndian(hex: String): String {
        val newHex = hex + "000000000000"
        val n = BigInteger(newHex, 16).toLong()

        return n.toString()
    }

    private fun hexTo64SingedBigEndianByteSwap(hex: String): String {
        val newHex = hex + "000000000000"
        val n = BigInteger(newHex, 16).toLong()

        return n.toString()
    }



    private fun hexTo32UnSingedBigEndian(hex: String): String {

        val newHex = hex + "0000"
        return newHex.toULong(16).toString()
    }

    private fun hexTo32UnSingedBigEndianByteSwap(hex: String): String {

        val newHex = hex + "0000"
        return newHex.toULong(16).toString()
    }

    private fun hexTo64UnSingedBigEndian(hex: String): String {
        val newHex = hex + "000000000000"
        return newHex.toULong(16).toString()
    }

    private fun hexTo64UnSingedBigEndianByteSwap(hex: String): String {
        val newHex = hex + "000000000000"
        return newHex.toULong(16).toString()
    }


    private fun hexTo32SingedLittleEndian(hex: String): String {

        val newHex = "0000$hex"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo32SingedLittleEndianByteSwap(hex: String): String {

        val newHex = "0000$hex"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo64SingedLittleEndian(hex: String): String {

        val newHex = "0000$hex"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo64SingedLittleEndianByteSwap(hex: String): String {

        val newHex = "0000$hex"
        return newHex.toLong(16).toInt().toString()
    }

    private fun hexTo32UnSingedLittleEndian(hex: String): String {

        val newHex = "000000000000$hex"
        return newHex.toULong(16).toString()
    }

    private fun hexTo32UnSingedLittleEndianByteSwap(hex: String): String {

        val newHex = "000000000000$hex"
        return newHex.toULong(16).toString()
    }

    private fun hexTo64UnSingedLittleEndian(hex: String): String {

        val newHex = "000000000000$hex"
        return newHex.toULong(16).toString()
    }

    private fun hexTo64UnSingedLittleEndianByteSwap(hex: String): String {

        val newHex = "000000000000$hex"
        return newHex.toULong(16).toString()
    }

    private fun hexTo32FloatBigEndian(hex: String): String {
        val newHex = hex + "0000"

        return intBitsToFloat(newHex.toLong(16).toInt()).toString()
    }

    private fun hexTo32FloatLittleEndian(hex: String): String {

        val newHex = "0000$hex"
        return intBitsToFloat(newHex.toLong(16).toInt()).toString()
    }

    private fun hexTo32FloatBigEndianByteSwap(hex: String): String {
        val newHex = hex + "0000"

        return intBitsToFloat(newHex.toLong(16).toInt()).toString()
    }

    private fun hexTo32FloatLittleEndianByteSwap(hex: String): String {

        val newHex = "0000$hex"
        return intBitsToFloat(newHex.toLong(16).toInt()).toString()
    }

    /**
     * @param hexValue input hex
     * @param bitNumber the number that want to check
     * check the hex bits number
     * */
    private fun isBitSet(hexValue: String?, bitNumber: Int): Boolean {
        val `val` = Integer.valueOf(hexValue, 16)
        return `val` and (1 shl bitNumber) != 0
    }
}
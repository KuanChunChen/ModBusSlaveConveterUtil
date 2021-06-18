package com.oring.modbusutil.constants

enum class ModBusSlaveKey(val value: Int, val function: String) {

    SIGNED(0, "Signed"),
    UNSIGNED(1, "Unsigned"),
    SINGED_32_BIT_BIG_ENDIAN(2, "32 Bit singed, Big-endian"),
    SINGED_32_BIT_LITTLE_ENDIAN(3, "32 Bit singed, Little-endian"),
    SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP(4, "32 Bit singed, Big-endian byte swap"),
    SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP(5, "32 Bit singed, Little-endian byte swap"),
    UN_SINGED_32_BIT_BIG_ENDIAN(6, "32 Bit UnSinged, Big-endian"),
    UN_SINGED_32_BIT_LITTLE_ENDIAN(7, "32 Bit UnSinged, Little-endian"),
    UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP(8, "32 Bit UnSinged, Big-endian byte swap"),
    UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP(9, "32 Bit UnSinged, Little-endian byte swap"),
    SINGED_64_BIT_BIG_ENDIAN(10, "64 Bit singed, Big-endian"),
    SINGED_64_BIT_LITTLE_ENDIAN(11, "64 Bit singed, Little-endian"),
    SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP(12, "64 Bit singed, Big-endian byte swap"),
    SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP(13, "64 Bit singed, Little-endian byte swap"),
    UN_SINGED_64_BIT_BIG_ENDIAN(14, "64 Bit UnSinged, Big-endian"),
    UN_SINGED_64_BIT_LITTLE_ENDIAN(15, "64 Bit UnSinged, Little-endian"),
    UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP(16, "64 Bit UnSinged, Big-endian byte swap"),
    UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP(17, "64 Bit UnSinged, Little-endian byte swap"),
    FLOAT_32_BIT_BIG_ENDIAN(18, "32 Bit float, Big-endian"),
    FLOAT_32_BIT_LITTLE_ENDIAN(19, "32 Bit float, Little-endian"),
    FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP(20, "32 Bit float, Big-endian byte swap"),
    FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP(21, "32 Bit float, Little-endian byte swap");
}
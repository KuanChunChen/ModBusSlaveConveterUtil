package com.oring.modbusutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.oring.modbusutil.constants.ModBusSlaveKey;
import com.oring.modbusutil.util.ModBusUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaexample);

        TextView textMessage = findViewById(R.id.textModBus);

        String inputBytes = "FFFF";

        System.out.println(getModBudSlaveCode(inputBytes));
        textMessage.setText(getModBudSlaveCode(inputBytes));
    }

    /**
     *
     * 以下為示範用例 主要就是這一行
     * ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SIGNED, inputBytes)
     * 1.在ModBusSlaveKey enum裡面找你要用的方法對應的key 目前共支援22種
     * 2.然後input輸入hex 如 ： FFFF / ABCD / 1234 / AE1C
     * */

    private String getModBudSlaveCode(String inputBytes) {

        String returnMessage = "";

        returnMessage +=
                "1." + ModBusSlaveKey.SIGNED.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SIGNED, inputBytes) + "\n"
                        + "2." + ModBusSlaveKey.UNSIGNED.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UNSIGNED, inputBytes) + "\n"
                        + "3." + ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN, inputBytes) + "\n"
                        + "4." + ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN, inputBytes) + "\n"
                        + "5." + ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "6." + ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "7." + ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN, inputBytes) + "\n"
                        + "8." + ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN, inputBytes) + "\n"
                        + "9." + ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "10." + ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "11." + ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN, inputBytes) + "\n"
                        + "12." + ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN, inputBytes) + "\n"
                        + "13." + ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "14." + ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "15." + ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN, inputBytes) + "\n"
                        + "16." + ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN, inputBytes) + "\n"
                        + "17." + ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "18." + ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.UN_SINGED_64_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "19." + ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN, inputBytes) + "\n"
                        + "20." + ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN, inputBytes) + "\n"
                        + "21." + ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_BIG_ENDIAN_BYTE_SWAP, inputBytes) + "\n"
                        + "22." + ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP.getFunction() + ":" + ModBusUtil.INSTANCE.modBodSlaveConverter(ModBusSlaveKey.FLOAT_32_BIT_LITTLE_ENDIAN_BYTE_SWAP, inputBytes) + "\n";

        return returnMessage;
    }
}
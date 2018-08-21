import org.junit.Test;

import javax.sound.midi.Soundbank;

public class Test1 {

    @Test
    public void test() {
        String linea = "商户号|终端号|交易类型|交易子类型|宝付订单号|商户订单号|清算日期|订单状态|交易金额|手续费|宝付交易号|支付订单创建时间|商户退款订单号|退款订单创建时间"
                ;
        String[] arr = {linea,
                "100025773|200001173|30311|00|411887121|2018073000000002|2018-07-30|1|5954.00|1.00|201807300110000411887121|2018-07-30 08:00:06||"
                ,
                "100025773|200001173|30311|00|531|1520287.24|531.00|2018-07-30",
                "商户号|终端号|交易类型|交易子类型|总笔数|总金额|总手续费|清算时间"};
        String lineSperator = "\\|";
        for (String line:arr){

            System.out.println(line.split(lineSperator).length);
            if(line.split(lineSperator).length==14&&!line.startsWith("商户号")){
                System.out.println("999999"+line);
            }

        }

        String[] split = "100025773|200001173|30311|00|411887121|2018073000000002|2018-07-30|1|5954.00|1.00|201807300110000411887121|2018-07-30 08:00:06||".split("\\|");

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfp;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class ReadFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = "Seri     Pajak        Invoice     Customer  NPWP                  Langganan                                   Jual         Potongan           D.P.P           P.P.N      Dokumen   Faktur Pajak         Fakt Pajak\n" +
"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
"173/NR/H 11-APR-16    416002295  916295    03.208.337.0-701.000  RS. MITRA MEDIKA                       -6,945,000                0      -6,945,000        -694,500    -7,639,500 010.000-16.89900969     01-APR-16\n" +
"DM/IV/20\n" +
"16\n" +
"                                                                                                   ------------------------------------------------------------------------------\n" +
"** Grand Total **                                                                                       -6,945,000                0      -6,945,000        -694,500    -7,639,500\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"                                                                                                        -6,945,000                0      -6,945,000        -694,500    -7,639,500\n" +
"** Grand Total - Masa Pajak : APR-16 **                                                                 -6,945,000                0      -6,945,000        -694,500    -7,639,500\n" +
"PT. ENSEVAL PUTERA MEGATRADING TBK                                  REGISTER PENJUALAN RUTIN (CREDIT MEMO) APR-2016 *                           USER : PTK_AKS_01\n" +
"BCustome PONTIANAK                                                                Masa Pajak : APR-2016                                         PRINT DATE : 13-MAY-2016 02:01:29\n" +
"                                                                                  Jenis Faktur Pajak :                                          PAGE : 3 OF 38\n" +
"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
"Nomor    Tgl Faktur   No          No                                                               -------------------------------- N   i   l   a   i----------------------------  No. Ex               Tgl. Ex\n" +
"Seri     Pajak        Invoice     Customer  NPWP                  Langganan                                   Jual         Potongan           D.P.P           P.P.N      Dokumen   Faktur Pajak         Fakt Pajak\n" +
"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
"018.16.0 02-APR-2016  416002319  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -132,300                0        -132,300         -13,230      -145,530 010.000-16.89719194   17-MAR-2016\n" +
"0005427\n" +
"018.16.0 02-APR-2016  416002323  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -194,178                0        -194,178         -19,417      -213,595 010.000-16.89808916   24-MAR-2016\n" +
"0005428\n" +
"018.16.0 02-APR-2016  416002312  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                  -74,783                0         -74,783          -7,478       -82,261 010.000-16.89362851   16-FEB-2016\n" +
"0005429\n" +
"018.16.0 04-APR-2016  416002280  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -237,818           -2,378        -235,440         -23,543      -258,983 010.000-16.89514536   29-FEB-2016\n" +
"0005439\n" +
"018.16.0 04-APR-2016  416002283  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -273,454           -2,735        -270,719         -27,071      -297,790 010.000-16.89785347   23-MAR-2016\n" +
"0005440\n" +
"018.16.0 04-APR-2016  416002281  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -237,818           -2,378        -235,440         -23,543      -258,983 010.000-16.89785350   23-MAR-2016\n" +
"0005441\n" +
"018.16.0 04-APR-2016  416002352  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -127,818           -1,278        -126,540         -12,653      -139,193 010.000-16.89514543   29-FEB-2016\n" +
"0005442\n" +
"018.16.0 05-APR-2016  416002542  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -189,076                0        -189,076         -18,907      -207,983 010.000-16.89656994   12-MAR-2016\n" +
"0005471\n" +
"018.16.0 05-APR-2016  416002282  947693    01.781.214.0.046.000  PT. INTI CAKRAWALA CITRA                 -118,909           -1,189        -117,720         -11,771      -129,491 010.000-16.89514536   29-FEB-2016";
        //String line = "010.000-16.89533724     01-MAR-2016  116007514   389824                                 TK. LIAK CUA (JAYA)                         11,321,520                0                 0       11,321,520         1,132,152       12,453,672";
//        String[] split = line.split("                 0");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(i + " - " + split[i].split(" ")[4]);
//        }

        for (String s : line.split("\\n")) {
            
            try {
                System.out.println(s.substring(9, 11));
            } catch (Exception e) {
            }
        }

    }

}

package com.android.i18n.phonenumbers;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class CountryCodeToRegionCodeMap {
  // A mapping from a country code to the region codes which denote the
  // country/region represented by that country code. In the case of multiple
  // countries sharing a calling code, such as the NANPA countries, the one
  // indicated with "isMainCountryForCode" in the metadata should be first.
  @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:46:45.600 -0500", hash_original_method = "BE431864601EAE48B892825B63E491FC", hash_generated_method = "7A66F935D67A11285242FE8DC006719D")
    static Map<Integer, List<String>> getCountryCodeToRegionCodeMap() {
    // The capacity is set to 273 as there are 205 different country codes,
    // and this offers a load factor of roughly 0.75.
    Map<Integer, List<String>> countryCodeToRegionCodeMap =
        new HashMap<Integer, List<String>>(273);

    ArrayList<String> listWithRegionCode;

    listWithRegionCode = new ArrayList<String>(24);
    listWithRegionCode.add("US");
    listWithRegionCode.add("AG");
    listWithRegionCode.add("AI");
    listWithRegionCode.add("AS");
    listWithRegionCode.add("BB");
    listWithRegionCode.add("BM");
    listWithRegionCode.add("BS");
    listWithRegionCode.add("CA");
    listWithRegionCode.add("DM");
    listWithRegionCode.add("DO");
    listWithRegionCode.add("GD");
    listWithRegionCode.add("GU");
    listWithRegionCode.add("JM");
    listWithRegionCode.add("KN");
    listWithRegionCode.add("KY");
    listWithRegionCode.add("LC");
    listWithRegionCode.add("MP");
    listWithRegionCode.add("MS");
    listWithRegionCode.add("PR");
    listWithRegionCode.add("TC");
    listWithRegionCode.add("TT");
    listWithRegionCode.add("VC");
    listWithRegionCode.add("VG");
    listWithRegionCode.add("VI");
    countryCodeToRegionCodeMap.put(1, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("RU");
    listWithRegionCode.add("KZ");
    countryCodeToRegionCodeMap.put(7, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("EG");
    countryCodeToRegionCodeMap.put(20, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ZA");
    countryCodeToRegionCodeMap.put(27, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GR");
    countryCodeToRegionCodeMap.put(30, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NL");
    countryCodeToRegionCodeMap.put(31, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BE");
    countryCodeToRegionCodeMap.put(32, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FR");
    countryCodeToRegionCodeMap.put(33, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ES");
    countryCodeToRegionCodeMap.put(34, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("HU");
    countryCodeToRegionCodeMap.put(36, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IT");
    countryCodeToRegionCodeMap.put(39, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("RO");
    countryCodeToRegionCodeMap.put(40, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CH");
    countryCodeToRegionCodeMap.put(41, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AT");
    countryCodeToRegionCodeMap.put(43, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(4);
    listWithRegionCode.add("GB");
    listWithRegionCode.add("GG");
    listWithRegionCode.add("IM");
    listWithRegionCode.add("JE");
    countryCodeToRegionCodeMap.put(44, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("DK");
    countryCodeToRegionCodeMap.put(45, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SE");
    countryCodeToRegionCodeMap.put(46, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("NO");
    listWithRegionCode.add("SJ");
    countryCodeToRegionCodeMap.put(47, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PL");
    countryCodeToRegionCodeMap.put(48, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("DE");
    countryCodeToRegionCodeMap.put(49, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PE");
    countryCodeToRegionCodeMap.put(51, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MX");
    countryCodeToRegionCodeMap.put(52, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CU");
    countryCodeToRegionCodeMap.put(53, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AR");
    countryCodeToRegionCodeMap.put(54, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BR");
    countryCodeToRegionCodeMap.put(55, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CL");
    countryCodeToRegionCodeMap.put(56, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CO");
    countryCodeToRegionCodeMap.put(57, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("VE");
    countryCodeToRegionCodeMap.put(58, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MY");
    countryCodeToRegionCodeMap.put(60, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(3);
    listWithRegionCode.add("AU");
    listWithRegionCode.add("CC");
    listWithRegionCode.add("CX");
    countryCodeToRegionCodeMap.put(61, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ID");
    countryCodeToRegionCodeMap.put(62, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PH");
    countryCodeToRegionCodeMap.put(63, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NZ");
    countryCodeToRegionCodeMap.put(64, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SG");
    countryCodeToRegionCodeMap.put(65, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TH");
    countryCodeToRegionCodeMap.put(66, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("JP");
    countryCodeToRegionCodeMap.put(81, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KR");
    countryCodeToRegionCodeMap.put(82, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("VN");
    countryCodeToRegionCodeMap.put(84, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CN");
    countryCodeToRegionCodeMap.put(86, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TR");
    countryCodeToRegionCodeMap.put(90, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IN");
    countryCodeToRegionCodeMap.put(91, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PK");
    countryCodeToRegionCodeMap.put(92, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AF");
    countryCodeToRegionCodeMap.put(93, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LK");
    countryCodeToRegionCodeMap.put(94, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MM");
    countryCodeToRegionCodeMap.put(95, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IR");
    countryCodeToRegionCodeMap.put(98, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MA");
    countryCodeToRegionCodeMap.put(212, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("DZ");
    countryCodeToRegionCodeMap.put(213, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TN");
    countryCodeToRegionCodeMap.put(216, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LY");
    countryCodeToRegionCodeMap.put(218, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GM");
    countryCodeToRegionCodeMap.put(220, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SN");
    countryCodeToRegionCodeMap.put(221, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MR");
    countryCodeToRegionCodeMap.put(222, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ML");
    countryCodeToRegionCodeMap.put(223, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GN");
    countryCodeToRegionCodeMap.put(224, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CI");
    countryCodeToRegionCodeMap.put(225, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BF");
    countryCodeToRegionCodeMap.put(226, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NE");
    countryCodeToRegionCodeMap.put(227, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TG");
    countryCodeToRegionCodeMap.put(228, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BJ");
    countryCodeToRegionCodeMap.put(229, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MU");
    countryCodeToRegionCodeMap.put(230, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LR");
    countryCodeToRegionCodeMap.put(231, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SL");
    countryCodeToRegionCodeMap.put(232, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GH");
    countryCodeToRegionCodeMap.put(233, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NG");
    countryCodeToRegionCodeMap.put(234, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TD");
    countryCodeToRegionCodeMap.put(235, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CF");
    countryCodeToRegionCodeMap.put(236, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CM");
    countryCodeToRegionCodeMap.put(237, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CV");
    countryCodeToRegionCodeMap.put(238, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ST");
    countryCodeToRegionCodeMap.put(239, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GQ");
    countryCodeToRegionCodeMap.put(240, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GA");
    countryCodeToRegionCodeMap.put(241, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CG");
    countryCodeToRegionCodeMap.put(242, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CD");
    countryCodeToRegionCodeMap.put(243, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AO");
    countryCodeToRegionCodeMap.put(244, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GW");
    countryCodeToRegionCodeMap.put(245, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IO");
    countryCodeToRegionCodeMap.put(246, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AC");
    countryCodeToRegionCodeMap.put(247, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SC");
    countryCodeToRegionCodeMap.put(248, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SD");
    countryCodeToRegionCodeMap.put(249, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("RW");
    countryCodeToRegionCodeMap.put(250, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ET");
    countryCodeToRegionCodeMap.put(251, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SO");
    countryCodeToRegionCodeMap.put(252, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("DJ");
    countryCodeToRegionCodeMap.put(253, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KE");
    countryCodeToRegionCodeMap.put(254, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TZ");
    countryCodeToRegionCodeMap.put(255, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("UG");
    countryCodeToRegionCodeMap.put(256, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BI");
    countryCodeToRegionCodeMap.put(257, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MZ");
    countryCodeToRegionCodeMap.put(258, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ZM");
    countryCodeToRegionCodeMap.put(260, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MG");
    countryCodeToRegionCodeMap.put(261, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("RE");
    listWithRegionCode.add("YT");
    countryCodeToRegionCodeMap.put(262, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ZW");
    countryCodeToRegionCodeMap.put(263, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NA");
    countryCodeToRegionCodeMap.put(264, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MW");
    countryCodeToRegionCodeMap.put(265, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LS");
    countryCodeToRegionCodeMap.put(266, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BW");
    countryCodeToRegionCodeMap.put(267, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SZ");
    countryCodeToRegionCodeMap.put(268, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KM");
    countryCodeToRegionCodeMap.put(269, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SH");
    countryCodeToRegionCodeMap.put(290, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ER");
    countryCodeToRegionCodeMap.put(291, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AW");
    countryCodeToRegionCodeMap.put(297, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FO");
    countryCodeToRegionCodeMap.put(298, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GL");
    countryCodeToRegionCodeMap.put(299, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GI");
    countryCodeToRegionCodeMap.put(350, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PT");
    countryCodeToRegionCodeMap.put(351, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LU");
    countryCodeToRegionCodeMap.put(352, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IE");
    countryCodeToRegionCodeMap.put(353, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IS");
    countryCodeToRegionCodeMap.put(354, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AL");
    countryCodeToRegionCodeMap.put(355, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MT");
    countryCodeToRegionCodeMap.put(356, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CY");
    countryCodeToRegionCodeMap.put(357, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(2);
    listWithRegionCode.add("FI");
    listWithRegionCode.add("AX");
    countryCodeToRegionCodeMap.put(358, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BG");
    countryCodeToRegionCodeMap.put(359, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LT");
    countryCodeToRegionCodeMap.put(370, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LV");
    countryCodeToRegionCodeMap.put(371, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("EE");
    countryCodeToRegionCodeMap.put(372, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MD");
    countryCodeToRegionCodeMap.put(373, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AM");
    countryCodeToRegionCodeMap.put(374, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BY");
    countryCodeToRegionCodeMap.put(375, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AD");
    countryCodeToRegionCodeMap.put(376, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MC");
    countryCodeToRegionCodeMap.put(377, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SM");
    countryCodeToRegionCodeMap.put(378, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("VA");
    countryCodeToRegionCodeMap.put(379, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("UA");
    countryCodeToRegionCodeMap.put(380, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("RS");
    countryCodeToRegionCodeMap.put(381, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("ME");
    countryCodeToRegionCodeMap.put(382, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("HR");
    countryCodeToRegionCodeMap.put(385, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SI");
    countryCodeToRegionCodeMap.put(386, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BA");
    countryCodeToRegionCodeMap.put(387, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MK");
    countryCodeToRegionCodeMap.put(389, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CZ");
    countryCodeToRegionCodeMap.put(420, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SK");
    countryCodeToRegionCodeMap.put(421, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LI");
    countryCodeToRegionCodeMap.put(423, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FK");
    countryCodeToRegionCodeMap.put(500, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BZ");
    countryCodeToRegionCodeMap.put(501, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GT");
    countryCodeToRegionCodeMap.put(502, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SV");
    countryCodeToRegionCodeMap.put(503, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("HN");
    countryCodeToRegionCodeMap.put(504, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NI");
    countryCodeToRegionCodeMap.put(505, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CR");
    countryCodeToRegionCodeMap.put(506, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PA");
    countryCodeToRegionCodeMap.put(507, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PM");
    countryCodeToRegionCodeMap.put(508, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("HT");
    countryCodeToRegionCodeMap.put(509, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(3);
    listWithRegionCode.add("GP");
    listWithRegionCode.add("BL");
    listWithRegionCode.add("MF");
    countryCodeToRegionCodeMap.put(590, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BO");
    countryCodeToRegionCodeMap.put(591, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GY");
    countryCodeToRegionCodeMap.put(592, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("EC");
    countryCodeToRegionCodeMap.put(593, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GF");
    countryCodeToRegionCodeMap.put(594, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PY");
    countryCodeToRegionCodeMap.put(595, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MQ");
    countryCodeToRegionCodeMap.put(596, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SR");
    countryCodeToRegionCodeMap.put(597, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("UY");
    countryCodeToRegionCodeMap.put(598, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AN");
    countryCodeToRegionCodeMap.put(599, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TL");
    countryCodeToRegionCodeMap.put(670, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NF");
    countryCodeToRegionCodeMap.put(672, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BN");
    countryCodeToRegionCodeMap.put(673, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NR");
    countryCodeToRegionCodeMap.put(674, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PG");
    countryCodeToRegionCodeMap.put(675, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TO");
    countryCodeToRegionCodeMap.put(676, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SB");
    countryCodeToRegionCodeMap.put(677, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("VU");
    countryCodeToRegionCodeMap.put(678, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FJ");
    countryCodeToRegionCodeMap.put(679, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PW");
    countryCodeToRegionCodeMap.put(680, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("WF");
    countryCodeToRegionCodeMap.put(681, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("CK");
    countryCodeToRegionCodeMap.put(682, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NU");
    countryCodeToRegionCodeMap.put(683, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("WS");
    countryCodeToRegionCodeMap.put(685, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KI");
    countryCodeToRegionCodeMap.put(686, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NC");
    countryCodeToRegionCodeMap.put(687, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TV");
    countryCodeToRegionCodeMap.put(688, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PF");
    countryCodeToRegionCodeMap.put(689, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TK");
    countryCodeToRegionCodeMap.put(690, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("FM");
    countryCodeToRegionCodeMap.put(691, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MH");
    countryCodeToRegionCodeMap.put(692, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KP");
    countryCodeToRegionCodeMap.put(850, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("HK");
    countryCodeToRegionCodeMap.put(852, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MO");
    countryCodeToRegionCodeMap.put(853, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KH");
    countryCodeToRegionCodeMap.put(855, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LA");
    countryCodeToRegionCodeMap.put(856, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BD");
    countryCodeToRegionCodeMap.put(880, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TW");
    countryCodeToRegionCodeMap.put(886, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MV");
    countryCodeToRegionCodeMap.put(960, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("LB");
    countryCodeToRegionCodeMap.put(961, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("JO");
    countryCodeToRegionCodeMap.put(962, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SY");
    countryCodeToRegionCodeMap.put(963, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IQ");
    countryCodeToRegionCodeMap.put(964, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KW");
    countryCodeToRegionCodeMap.put(965, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("SA");
    countryCodeToRegionCodeMap.put(966, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("YE");
    countryCodeToRegionCodeMap.put(967, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("OM");
    countryCodeToRegionCodeMap.put(968, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("PS");
    countryCodeToRegionCodeMap.put(970, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AE");
    countryCodeToRegionCodeMap.put(971, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("IL");
    countryCodeToRegionCodeMap.put(972, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BH");
    countryCodeToRegionCodeMap.put(973, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("QA");
    countryCodeToRegionCodeMap.put(974, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("BT");
    countryCodeToRegionCodeMap.put(975, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("MN");
    countryCodeToRegionCodeMap.put(976, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("NP");
    countryCodeToRegionCodeMap.put(977, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TJ");
    countryCodeToRegionCodeMap.put(992, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("TM");
    countryCodeToRegionCodeMap.put(993, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("AZ");
    countryCodeToRegionCodeMap.put(994, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("GE");
    countryCodeToRegionCodeMap.put(995, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("KG");
    countryCodeToRegionCodeMap.put(996, listWithRegionCode);

    listWithRegionCode = new ArrayList<String>(1);
    listWithRegionCode.add("UZ");
    countryCodeToRegionCodeMap.put(998, listWithRegionCode);

    return countryCodeToRegionCodeMap;
  }
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:08.582 -0400", hash_original_method = "63FC822C4B5F1AC648A20B30DF86BC44", hash_generated_method = "63FC822C4B5F1AC648A20B30DF86BC44")
    public CountryCodeToRegionCodeMap ()
    {
        //Synthesized constructor
    }

    
}


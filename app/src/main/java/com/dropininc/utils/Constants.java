package com.dropininc.utils;

public class Constants {
    public final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    public static final String SENDER_ID = "153142172478";

    public static final String TOS_URL = "http://d1w2gqb9dj7k4r.cloudfront.net/TOS.html";
    public static final String POLICY_URL = "https://s3.amazonaws.com/dropininc.com/tos.html";

    public static final String NOTIFICATION_FILTER = "NOTIFICATION_FILTER";
    public static final String NOTIFICATION_STREAM = "NOTIFICATION_STREAM";

    public static final String GPS_PERMISSION_FILTER = "GPS_PERMISSION_FILTER";
    public static final int REQUEST_CODE_ASK_GPS_PERMISSIONS = 100;
    public static final String PHOTO_PERMISSION_FILTER = "PHOTO_PERMISSION_FILTER";
    public static final int REQUEST_CODE_ASK_PHOTO_PERMISSIONS = 101;
    public static final String MIC_PERMISSION_FILTER = "MIC_PERMISSION_FILTER";
    public static final int REQUEST_CODE_ASK_MIC_PERMISSIONS = 102;
    public static final String STORE_PERMISSION_FILTER = "STORE_PERMISSION_FILTER";
    public static final int REQUEST_CODE_ASK_STORE_PERMISSIONS = 103;

    public static final String[] countryNames = {"Afghanistan", "Albania",
            "Algeria", "Andorra", "Angola", "Antarctica", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
            "Bahrain", "Bangladesh", "Belarus", "Belgium", "Belize", "Benin",
            "Bhutan", "Bolivia", "Bosnia And Herzegovina", "Botswana",
            "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso",
            "Myanmar", "Burundi", "Cambodia", "Cameroon", "Canada",
            "Cape Verde", "Central African Republic", "Chad", "Chile", "China",
            "Christmas Island", "Cocos (keeling) Islands", "Colombia",
            "Comoros", "Congo", "Cook Islands", "Costa Rica", "Croatia",
            "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti",
            "Timor-leste", "Ecuador", "Egypt", "El Salvador",
            "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia",
            "Falkland Islands (malvinas)", "Faroe Islands", "Fiji", "Finland",
            "France", "French Polynesia", "Gabon", "Gambia", "Georgia",
            "Germany", "Ghana", "Gibraltar", "Greece", "Greenland",
            "Guatemala", "Guinea", "Guinea-bissau", "Guyana", "Haiti",
            "Honduras", "Hong Kong", "Hungary", "India", "Indonesia", "Iran",
            "Iraq", "Ireland", "Isle Of Man", "Israel", "Italy", "Ivory Coast",
            "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
            "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho",
            "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
            "Macao", "Macedonia", "Madagascar", "Malawi", "Malaysia",
            "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania",
            "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova",
            "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique",
            "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia",
            "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Korea",
            "Norway", "Oman", "Pakistan", "Palau", "Panama",
            "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn",
            "Poland", "Portugal", "Puerto Rico", "Qatar", "Romania",
            "Russian Federation", "Rwanda", "Saint Barthélemy", "Samoa",
            "San Marino", "Sao Tome And Principe", "Saudi Arabia", "Senegal",
            "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia",
            "Slovenia", "Solomon Islands", "Somalia", "South Africa",
            "Korea, Republic Of", "Spain", "Sri Lanka", "Saint Helena",
            "Saint Pierre And Miquelon", "Sudan", "Suriname", "Swaziland",
            "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan",
            "Tajikistan", "Tanzania", "Thailand", "Togo", "Tokelau", "Tonga",
            "Tunisia", "Turkey", "Turkmenistan", "Tuvalu",
            "United Arab Emirates", "Uganda", "United Kingdom", "Ukraine",
            "Uruguay", "United States", "Uzbekistan", "Vanuatu",
            "Holy See (vatican City State)", "Venezuela", "Viet Nam",
            "Wallis And Futuna", "Yemen", "Zambia", "Zimbabwe"};

    public static final String[] countryAreaCodes = {"93", "355", "213",
            "376", "244", "672", "54", "374", "297", "61", "43", "994", "973",
            "880", "375", "32", "501", "229", "975", "591", "387", "267", "55",
            "673", "359", "226", "95", "257", "855", "237", "1", "238", "236",
            "235", "56", "86", "61", "61", "57", "269", "242", "682", "506",
            "385", "53", "357", "420", "45", "253", "670", "593", "20", "503",
            "240", "291", "372", "251", "500", "298", "679", "358", "33",
            "689", "241", "220", "995", "49", "233", "350", "30", "299", "502",
            "224", "245", "592", "509", "504", "852", "36", "91", "62", "98",
            "964", "353", "44", "972", "39", "225", "1876", "81", "962", "7",
            "254", "686", "965", "996", "856", "371", "961", "266", "231",
            "218", "423", "370", "352", "853", "389", "261", "265", "60",
            "960", "223", "356", "692", "222", "230", "262", "52", "691",
            "373", "377", "976", "382", "212", "258", "264", "674", "977",
            "31", "687", "64", "505", "227", "234", "683", "850", "47", "968",
            "92", "680", "507", "675", "595", "51", "63", "870", "48", "351",
            "1", "974", "40", "7", "250", "590", "685", "378", "239", "966",
            "221", "381", "248", "232", "65", "421", "386", "677", "252", "27",
            "82", "34", "94", "290", "508", "249", "597", "268", "46", "41",
            "963", "886", "992", "255", "66", "228", "690", "676", "216", "90",
            "993", "688", "971", "256", "44", "380", "598", "1", "998", "678",
            "39", "58", "84", "681", "967", "260", "263"};

    public static final String[] countryCodes = {"AF", "AL", "DZ", "AD", "AO",
            "AQ", "AR", "AM", "AW", "AU", "AT", "AZ", "BH", "BD", "BY", "BE",
            "BZ", "BJ", "BT", "BO", "BA", "BW", "BR", "BN", "BG", "BF", "MM",
            "BI", "KH", "CM", "CA", "CV", "CF", "TD", "CL", "CN", "CX", "CC",
            "CO", "KM", "CG", "CK", "CR", "HR", "CU", "CY", "CZ", "DK", "DJ",
            "TL", "EC", "EG", "SV", "GQ", "ER", "EE", "ET", "FK", "FO", "FJ",
            "FI", "FR", "PF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL",
            "GT", "GN", "GW", "GY", "HT", "HN", "HK", "HU", "IN", "ID", "IR",
            "IQ", "IE", "IM", "IL", "IT", "CI", "JM", "JP", "JO", "KZ", "KE",
            "KI", "KW", "KG", "LA", "LV", "LB", "LS", "LR", "LY", "LI", "LT",
            "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MR",
            "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MA", "MZ", "NA",
            "NR", "NP", "NL", "NC", "NZ", "NI", "NE", "NG", "NU", "KP", "NO",
            "OM", "PK", "PW", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT",
            "PR", "QA", "RO", "RU", "RW", "BL", "WS", "SM", "ST", "SA", "SN",
            "RS", "SC", "SL", "SG", "SK", "SI", "SB", "SO", "ZA", "KR", "ES",
            "LK", "SH", "PM", "SD", "SR", "SZ", "SE", "CH", "SY", "TW", "TJ",
            "TZ", "TH", "TG", "TK", "TO", "TN", "TR", "TM", "TV", "AE", "UG",
            "GB", "UA", "UY", "US", "UZ", "VU", "VA", "VE", "VN", "WF", "YE",
            "ZM", "ZW",

    };

}

package io.sesgoe.advent2019.day1

//comes from https://adventofcode.com/2019/day/1/input

const val day1InputRaw = "103450\n" +
        "107815\n" +
        "53774\n" +
        "124794\n" +
        "90372\n" +
        "98169\n" +
        "106910\n" +
        "50087\n" +
        "104958\n" +
        "71936\n" +
        "118379\n" +
        "122284\n" +
        "55871\n" +
        "91714\n" +
        "120685\n" +
        "117684\n" +
        "146047\n" +
        "60332\n" +
        "72034\n" +
        "127689\n" +
        "117575\n" +
        "101714\n" +
        "121018\n" +
        "86073\n" +
        "73764\n" +
        "100533\n" +
        "104443\n" +
        "113037\n" +
        "79474\n" +
        "123364\n" +
        "128367\n" +
        "63620\n" +
        "54004\n" +
        "124093\n" +
        "133256\n" +
        "95915\n" +
        "97442\n" +
        "64267\n" +
        "70823\n" +
        "143108\n" +
        "86422\n" +
        "118962\n" +
        "66129\n" +
        "69445\n" +
        "51804\n" +
        "56436\n" +
        "117587\n" +
        "64632\n" +
        "104564\n" +
        "67514\n" +
        "108782\n" +
        "123991\n" +
        "110932\n" +
        "122201\n" +
        "98816\n" +
        "126708\n" +
        "69821\n" +
        "66902\n" +
        "96993\n" +
        "55032\n" +
        "109143\n" +
        "67678\n" +
        "58009\n" +
        "50232\n" +
        "69841\n" +
        "101922\n" +
        "95832\n" +
        "122820\n" +
        "72056\n" +
        "102557\n" +
        "68727\n" +
        "85192\n" +
        "74694\n" +
        "142252\n" +
        "140332\n" +
        "53783\n" +
        "123036\n" +
        "88197\n" +
        "148727\n" +
        "138393\n" +
        "87427\n" +
        "65693\n" +
        "88448\n" +
        "51044\n" +
        "95470\n" +
        "97336\n" +
        "121463\n" +
        "91997\n" +
        "149518\n" +
        "66967\n" +
        "119301\n" +
        "112022\n" +
        "57363\n" +
        "128247\n" +
        "107454\n" +
        "77260\n" +
        "126346\n" +
        "97658\n" +
        "137578\n" +
        "134743"

val day1InputAsList = day1InputRaw.split("\n").map { mass -> mass.toInt() }
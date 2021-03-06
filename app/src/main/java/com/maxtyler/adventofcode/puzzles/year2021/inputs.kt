package com.maxtyler.adventofcode.puzzles.year2021

val INPUTS2021 = mapOf(
    "day01" to """
        195
        197
        201
        204
        203
        216
        213
        215
        216
        185
        188
        190
        205
        218
        237
        243
        248
        278
        289
        292
        304
        313
        314
        317
        329
        328
        329
        328
        329
        330
        331
        329
        333
        337
        338
        345
        352
        354
        355
        359
        360
        363
        365
        364
        370
        371
        367
        387
        403
        407
        409
        411
        416
        425
        435
        444
        445
        446
        460
        449
        454
        458
        459
        463
        464
        445
        447
        448
        450
        452
        463
        464
        475
        459
        460
        465
        477
        484
        485
        486
        498
        500
        501
        502
        516
        515
        531
        534
        560
        576
        583
        586
        587
        575
        588
        587
        591
        595
        599
        607
        608
        609
        610
        616
        612
        601
        603
        621
        624
        623
        630
        639
        633
        628
        629
        630
        631
        632
        646
        650
        654
        650
        654
        659
        660
        663
        669
        670
        673
        702
        709
        715
        739
        734
        750
        756
        762
        775
        773
        784
        785
        784
        789
        790
        785
        784
        798
        814
        815
        816
        817
        818
        826
        827
        841
        835
        836
        839
        841
        843
        835
        839
        819
        838
        837
        831
        847
        845
        847
        848
        853
        854
        883
        884
        883
        884
        885
        887
        888
        889
        896
        902
        920
        922
        923
        924
        928
        930
        962
        958
        985
        979
        980
        979
        986
        1019
        1016
        1017
        1022
        1032
        1035
        1037
        1040
        1038
        1045
        1056
        1065
        1090
        1104
        1084
        1082
        1084
        1097
        1115
        1118
        1128
        1123
        1133
        1143
        1144
        1133
        1134
        1135
        1136
        1144
        1135
        1136
        1145
        1157
        1168
        1172
        1173
        1176
        1194
        1213
        1191
        1192
        1194
        1197
        1200
        1193
        1196
        1198
        1201
        1194
        1196
        1225
        1224
        1230
        1232
        1239
        1240
        1243
        1239
        1217
        1218
        1220
        1224
        1232
        1225
        1223
        1224
        1227
        1219
        1220
        1219
        1227
        1237
        1250
        1259
        1263
        1264
        1274
        1275
        1280
        1300
        1288
        1291
        1293
        1278
        1279
        1280
        1277
        1293
        1297
        1309
        1308
        1315
        1339
        1345
        1343
        1341
        1344
        1348
        1360
        1366
        1369
        1386
        1389
        1419
        1418
        1419
        1414
        1420
        1447
        1453
        1460
        1454
        1477
        1485
        1492
        1500
        1501
        1494
        1484
        1487
        1496
        1497
        1499
        1503
        1505
        1507
        1515
        1522
        1525
        1527
        1539
        1541
        1569
        1571
        1562
        1568
        1556
        1563
        1542
        1547
        1548
        1542
        1551
        1549
        1559
        1562
        1564
        1560
        1562
        1563
        1564
        1563
        1564
        1565
        1595
        1607
        1613
        1616
        1618
        1617
        1619
        1621
        1622
        1624
        1637
        1631
        1627
        1630
        1635
        1639
        1675
        1677
        1681
        1683
        1685
        1684
        1689
        1700
        1701
        1699
        1702
        1704
        1718
        1713
        1689
        1690
        1689
        1667
        1668
        1697
        1700
        1694
        1697
        1715
        1719
        1725
        1726
        1713
        1714
        1720
        1723
        1725
        1728
        1731
        1749
        1746
        1748
        1766
        1767
        1771
        1770
        1779
        1783
        1801
        1790
        1773
        1775
        1777
        1791
        1794
        1795
        1804
        1787
        1792
        1793
        1798
        1816
        1818
        1820
        1812
        1816
        1817
        1818
        1820
        1833
        1850
        1847
        1851
        1866
        1868
        1871
        1875
        1883
        1884
        1886
        1895
        1899
        1901
        1902
        1940
        1944
        1966
        1969
        1979
        1974
        1977
        1982
        1983
        2012
        2027
        2031
        2044
        2040
        2058
        2062
        2060
        2061
        2063
        2067
        2068
        2091
        2093
        2069
        2083
        2084
        2083
        2085
        2083
        2087
        2095
        2088
        2090
        2093
        2097
        2096
        2097
        2099
        2098
        2108
        2112
        2115
        2116
        2117
        2121
        2123
        2158
        2140
        2143
        2134
        2159
        2161
        2162
        2177
        2179
        2186
        2190
        2189
        2171
        2174
        2178
        2174
        2176
        2178
        2166
        2168
        2169
        2170
        2177
        2203
        2212
        2213
        2214
        2223
        2227
        2228
        2237
        2232
        2239
        2269
        2268
        2271
        2283
        2290
        2294
        2296
        2301
        2303
        2307
        2304
        2315
        2317
        2325
        2326
        2328
        2329
        2351
        2361
        2330
        2342
        2343
        2346
        2354
        2357
        2375
        2364
        2365
        2361
        2365
        2364
        2367
        2368
        2370
        2366
        2367
        2371
        2376
        2382
        2383
        2394
        2398
        2389
        2393
        2400
        2402
        2413
        2429
        2431
        2447
        2449
        2481
        2487
        2488
        2507
        2496
        2495
        2511
        2526
        2544
        2545
        2534
        2549
        2550
        2540
        2542
        2555
        2558
        2546
        2559
        2577
        2578
        2582
        2585
        2605
        2620
        2625
        2630
        2633
        2639
        2647
        2654
        2658
        2662
        2661
        2682
        2708
        2746
        2733
        2738
        2756
        2763
        2766
        2769
        2770
        2773
        2770
        2781
        2782
        2784
        2785
        2783
        2781
        2778
        2804
        2793
        2795
        2796
        2797
        2798
        2797
        2798
        2797
        2798
        2799
        2807
        2808
        2814
        2816
        2817
        2795
        2798
        2799
        2801
        2807
        2808
        2807
        2826
        2817
        2818
        2820
        2824
        2841
        2840
        2846
        2847
        2836
        2839
        2842
        2845
        2849
        2853
        2857
        2856
        2875
        2893
        2913
        2921
        2927
        2911
        2912
        2914
        2919
        2923
        2921
        2934
        2932
        2935
        2941
        2951
        2952
        2959
        2965
        2970
        2975
        2991
        2993
        2994
        3000
        3002
        3004
        3019
        3024
        3029
        3030
        3031
        3032
        3031
        3034
        3039
        3042
        3052
        3053
        3055
        3056
        3089
        3107
        3112
        3113
        3111
        3112
        3113
        3117
        3116
        3108
        3112
        3110
        3111
        3117
        3120
        3112
        3113
        3118
        3106
        3107
        3105
        3108
        3107
        3108
        3118
        3127
        3125
        3134
        3137
        3138
        3144
        3159
        3172
        3178
        3185
        3191
        3197
        3193
        3192
        3203
        3209
        3216
        3213
        3215
        3226
        3228
        3225
        3227
        3214
        3217
        3226
        3264
        3265
        3270
        3273
        3271
        3265
        3262
        3284
        3287
        3289
        3297
        3315
        3324
        3279
        3285
        3289
        3298
        3299
        3313
        3314
        3315
        3353
        3340
        3338
        3339
        3340
        3342
        3356
        3355
        3356
        3362
        3377
        3385
        3391
        3394
        3401
        3411
        3409
        3425
        3426
        3427
        3436
        3442
        3443
        3447
        3448
        3449
        3450
        3456
        3463
        3471
        3489
        3502
        3485
        3490
        3469
        3471
        3474
        3481
        3488
        3495
        3490
        3497
        3518
        3530
        3531
        3533
        3535
        3540
        3552
        3555
        3558
        3566
        3571
        3587
        3604
        3605
        3608
        3632
        3638
        3650
        3643
        3634
        3635
        3666
        3667
        3670
        3668
        3674
        3678
        3688
        3687
        3685
        3686
        3704
        3709
        3710
        3717
        3719
        3730
        3735
        3733
        3756
        3757
        3783
        3784
        3786
        3788
        3789
        3794
        3799
        3803
        3824
        3827
        3793
        3794
        3796
        3786
        3787
        3788
        3791
        3789
        3804
        3805
        3823
        3833
        3816
        3814
        3815
        3821
        3820
        3823
        3824
        3826
        3825
        3836
        3839
        3843
        3844
        3845
        3846
        3867
        3887
        3891
        3898
        3915
        3917
        3915
        3919
        3926
        3924
        3926
        3928
        3938
        3947
        3952
        3953
        3960
        3961
        3970
        3971
        3977
        4002
        4008
        4034
        4035
        4044
        4054
        4078
        4079
        4081
        4086
        4083
        4086
        4088
        4081
        4091
        4094
        4090
        4091
        4100
        4115
        4117
        4120
        4108
        4150
        4151
        4132
        4134
        4138
        4145
        4153
        4155
        4156
        4135
        4146
        4128
        4155
        4170
        4172
        4171
        4183
        4184
        4191
        4214
        4221
        4228
        4238
        4240
        4241
        4210
        4214
        4217
        4221
        4210
        4229
        4235
        4243
        4247
        4263
        4264
        4263
        4277
        4281
        4285
        4288
        4304
        4310
        4312
        4323
        4326
        4331
        4329
        4351
        4348
        4350
        4354
        4357
        4359
        4360
        4368
        4380
        4364
        4348
        4352
        4353
        4368
        4379
        4383
        4386
        4372
        4373
        4380
        4379
        4381
        4382
        4412
        4419
        4402
        4403
        4404
        4423
        4415
        4416
        4418
        4419
        4425
        4437
        4439
        4438
        4439
        4451
        4459
        4460
        4461
        4462
        4465
        4479
        4508
        4504
        4506
        4508
        4516
        4510
        4498
        4511
        4506
        4523
        4528
        4542
        4563
        4574
        4588
        4587
        4588
        4590
        4591
        4592
        4594
        4599
        4592
        4594
        4615
        4613
        4615
        4616
        4625
        4619
        4620
        4623
        4628
        4629
        4630
        4633
        4639
        4638
        4640
        4655
        4656
        4657
        4679
        4681
        4680
        4681
        4696
        4692
        4700
        4704
        4706
        4715
        4721
        4722
        4734
        4712
        4716
        4715
        4721
        4722
        4724
        4736
        4741
        4755
        4756
        4754
        4747
        4759
        4768
        4772
        4778
        4782
        4812
        4806
        4808
        4809
        4806
        4811
        4806
        4807
        4818
        4826
        4827
        4828
        4830
        4836
        4837
        4855
        4856
        4863
        4851
        4852
        4853
        4854
        4860
        4861
        4862
        4865
        4868
        4854
        4857
        4856
        4875
        4876
        4882
        4883
        4884
        4883
        4896
        4901
        4912
        4922
        4930
        4912
        4920
        4921
        4930
        4935
        4934
        4936
        4939
        4941
        4950
        4953
        4958
        4972
        4975
        4976
        4994
        4995
        4998
        5001
        5008
        5013
        5014
        5016
        5026
        5025
        5031
        5039
        5052
        5053
        5059
        5064
        5065
        5082
        5083
        5084
        5085
        5090
        5092
        5099
        5136
        5145
        5167
        5160
        5133
        5135
        5113
        5117
        5140
        5129
        5131
        5124
        5123
        5124
        5137
        5148
        5153
        5157
        5171
        5179
        5204
        5206
        5210
        5212
        5215
        5225
        5229
        5232
        5229
        5220
        5224
        5235
        5250
        5249
        5257
        5258
        5260
        5265
        5289
        5288
        5290
        5292
        5293
        5262
        5264
        5265
        5263
        5265
        5270
        5279
        5284
        5285
        5291
        5290
        5295
        5299
        5318
        5331
        5345
        5347
        5341
        5347
        5348
        5349
        5355
        5345
        5350
        5357
        5358
        5364
        5365
        5377
        5378
        5405
        5408
        5407
        5417
        5425
        5428
        5432
        5431
        5438
        5439
        5445
        5451
        5453
        5446
        5449
        5451
        5461
        5467
        5475
        5497
        5513
        5514
        5535
        5536
        5537
        5565
        5575
        5579
        5580
        5600
        5609
        5592
        5610
        5609
        5614
        5622
        5621
        5622
        5647
        5649
        5660
        5661
        5668
        5665
        5666
        5684
        5687
        5688
        5692
        5691
        5697
        5698
        5678
        5686
        5687
        5686
        5687
        5688
        5681
        5690
        5691
        5696
        5701
        5702
        5693
        5686
        5690
        5693
        5697
        5694
        5699
        5700
        5713
        5700
        5709
        5711
        5719
        5720
        5721
        5723
        5726
        5727
        5728
        5723
        5728
        5735
        5741
        5728
        5733
        5741
        5747
        5751
        5747
        5756
        5757
        5758
        5753
        5752
        5753
        5756
        5754
        5755
        5766
        5768
        5780
        5778
        5777
        5778
        5784
        5788
        5790
        5801
        5802
        5816
        5832
        5833
        5821
        5824
        5837
        5830
        5804
        5830
        5831
        5840
        5850
        5862
        5863
        5864
        5869
        5862
        5861
        5862
        5866
        5865
        5866
        5906
        5907
        5908
        5909
        5918
        5917
        5921
        5920
        5921
        5919
        5938
        5939
        5915
        5936
        5938
        5943
        5961
        5972
        5982
        5987
        5991
        5994
        6010
        6013
        6017
        6018
        6021
        6017
        6022
        6023
        6013
        6014
        6027
        6056
        6061
        6067
        6056
        6057
        6071
        6074
        6077
        6068
        6092
        6098
        6106
        6118
        6133
        6140
        6141
        6179
        6185
        6186
        6201
        6203
        6204
        6214
        6215
        6221
        6230
        6240
        6241
        6252
        6253
        6268
        6270
        6277
        6280
        6282
        6281
        6282
        6293
        6263
        6248
        6249
        6250
        6270
        6280
        6276
        6278
        6291
        6292
        6294
        6295
        6302
        6311
        6341
        6335
        6336
        6337
        6336
        6337
        6339
        6342
        6347
        6341
        6342
        6343
        6353
        6355
        6379
        6366
        6370
        6371
        6378
        6379
        6384
        6404
        6402
        6415
        6414
        6417
        6416
        6417
        6410
        6428
        6443
        6445
        6450
        6448
        6456
        6477
        6479
        6486
        6493
        6495
        6496
        6522
        6523
        6524
        6525
        6526
        6527
        6529
        6537
        6532
        6550
        6565
        6566
        6571
        6598
        6614
        6620
        6621
        6622
        6620
        6586
        6592
        6596
        6624
        6619
        6618
        6610
        6611
        6618
        6619
        6622
        6630
        6627
        6633
        6611
        6614
        6617
        6612
        6622
        6623
        6626
        6645
        6646
        6645
        6658
        6661
        6664
        6666
        6673
        6683
        6686
        6688
        6685
        6718
        6719
        6720
        6721
        6718
        6720
        6749
        6755
        6752
        6755
        6756
        6768
        6771
        6773
        6776
        6816
        6830
        6831
        6843
        6844
        6845
        6851
        6873
        6875
        6876
        6878
        6879
        6880
        6873
        6874
        6857
        6856
        6857
        6856
        6858
        6855
        6856
        6857
        6855
        6859
        6860
        6862
        6864
        6874
        6876
        6862
        6865
        6874
        6893
        6899
        6900
        6903
        6908
        6909
        6937
        6939
        6942
        6954
        6958
        6962
        6972
        6968
        6979
        6983
        6982
        6983
        6989
        6988
        6999
        6992
        6996
        7000
        6998
        6974
        6977
        6996
        6997
        6998
        6999
        7005
        6990
        6992
        6993
        7016
        7023
        7000
        7002
        7022
        7035
        7042
        7052
        7065
        7069
        7076
        7066
        7080
        7084
        7083
        7082
        7083
        7084
        7089
        7094
        7093
        7102
        7105
        7106
        7107
        7110
        7111
        7112
        7119
        7120
        7107
        7106
        7105
        7094
        7105
        7106
        7107
        7109
        7116
        7117
        7121
        7143
        7145
        7161
        7170
        7171
        7178
        7149
        7145
        7146
        7147
        7148
        7149
        7162
        7163
        7168
        7175
        7176
        7189
        7187
        7172
        7183
        7190
        7191
        7201
        7209
        7211
        7212
        7254
        7255
        7261
        7269
        7278
        7298
        7307
        7304
        7305
        7327
        7329
        7339
        7335
        7331
        7335
        7336
        7338
        7351
        7349
        7355
        7360
        7370
        7371
        7402
        7415
        7414
        7413
        7426
        7429
        7430
        7432
        7433
        7419
        7420
        7421
        7424
        7427
        7432
        7424
        7433
        7440
        7441
        7464
        7468
        7469
        7482
        7487
        7492
        7494
        7495
        7498
        7504
        7505
        7506
        7513
        7517
        7520
        7526
        7543
        7531
        7537
        7538
        7543
        7534
        7539
        7544
        7551
        7555
        7554
        7559
        7567
        7572
        7580
        7600
        7602
        7592
        7597
        7601
        7602
        7604
        7607
        7630
        7633
        7640
        7641
        7642
        7631
        7640
        7642
        7626
        7609
        7615
        7623
        7625
        7602
        7600
        7604
        7606
        7617
        7620
        7621
        7632
        7628
        7650
        7652
        7654
        7657
        7666
        7667
        7678
        7679
        7674
        7678
        7679
        7678
        7679
        7681
        7675
        7673
        7664
        7686
        7684
        7680
        7681
        7682
        7681
        7687
        7693
        7690
        7694
        7710
        7711
        7710
        7712
        7720
        7710
        7711
        7718
        7730
        7732
        7734
        7735
        7736
        7737
        7756
        7766
        7768
        7769
        7776
        7788
        7792
        7793
        7807
        7808
        7826
        7831
        7838
        7839
        7872
        7875
        7877
        7879
        7890
        7895
        7893
        7896
        7903
        7908
        7904
        7917
        7918
        7930
        7961
        7957
        7960
        7950
        7968
        7969
        7973
        7996
        7999
        7993
        8001
        8005
        8006
        8045
        8058
        8064
        8063
        8077
        8080
        8081
        8098
        8102
        8109
        8110
        8121
        8123
        8122
        8129
        8132
        8154
        8159
        8171
        8190
        8192
        8199
        8202
        8240
        8241
        8243
        8261
        8262
        8256
        8260
        8257
        8258
        8270
        8274
        8276
        8260
        8257
        8258
        8261
        8297
        8305
        8308
        8309
        8310
        8335
        8338
        8352
        8362
        8363
        8348
        8346
        8349
        8343
        8333
        8335
        8336
        8337
        8346
        8338
        8366
        8391
        8388
        8402
        8413
        8439
        8440
        8443
        8444
        8451
        8459
        8460
        8472
        8468
        8469
        8474
        8478
        8487
        8511
        8530
        8531
        8537
        8536
        8537
        8544
        8549
        8562
        8563
        8562
    """.trimIndent(),

    "day02" to """
        forward 6
        down 2
        forward 2
        down 8
        forward 3
        down 6
        down 8
        down 9
        forward 7
        forward 8
        down 9
        down 8
        down 9
        up 8
        forward 1
        down 7
        down 3
        forward 3
        forward 1
        down 3
        forward 3
        forward 1
        up 8
        down 5
        down 1
        forward 6
        forward 2
        up 9
        down 3
        down 8
        down 3
        down 3
        up 2
        down 7
        down 3
        up 5
        forward 4
        down 9
        forward 6
        forward 3
        forward 1
        forward 3
        down 2
        up 9
        down 4
        forward 6
        down 3
        forward 2
        down 2
        up 5
        up 1
        forward 3
        forward 6
        down 6
        forward 7
        forward 1
        down 3
        down 8
        forward 2
        down 7
        up 1
        up 2
        forward 5
        down 8
        down 8
        forward 9
        forward 7
        forward 2
        forward 7
        up 6
        up 9
        down 4
        forward 4
        forward 4
        up 1
        down 7
        forward 9
        forward 3
        down 6
        down 9
        forward 7
        forward 4
        up 7
        up 6
        up 8
        down 9
        forward 1
        down 1
        forward 8
        down 7
        forward 5
        down 3
        down 3
        down 8
        down 8
        down 4
        up 4
        forward 3
        down 8
        down 9
        up 3
        up 8
        down 9
        up 5
        forward 2
        forward 5
        forward 5
        down 8
        forward 9
        forward 8
        down 5
        down 9
        forward 6
        forward 2
        forward 3
        up 1
        forward 1
        up 2
        up 2
        forward 4
        forward 8
        forward 5
        down 1
        up 4
        forward 5
        up 7
        down 5
        down 5
        forward 8
        up 2
        down 7
        down 6
        down 5
        down 5
        down 1
        down 8
        forward 9
        forward 2
        up 6
        up 4
        down 8
        forward 1
        forward 2
        down 2
        forward 7
        forward 7
        forward 3
        forward 6
        forward 8
        down 3
        forward 6
        up 5
        down 3
        down 8
        up 1
        forward 1
        down 7
        down 3
        up 5
        forward 6
        forward 8
        forward 9
        up 5
        up 5
        up 5
        forward 8
        up 5
        down 6
        down 7
        down 5
        up 7
        up 1
        up 3
        forward 8
        up 9
        down 7
        down 4
        up 6
        up 8
        up 9
        up 9
        forward 5
        up 5
        forward 2
        forward 2
        forward 6
        up 2
        down 8
        up 2
        forward 5
        down 9
        up 7
        down 9
        forward 1
        forward 8
        up 1
        forward 7
        forward 2
        down 3
        forward 3
        forward 2
        up 9
        forward 4
        forward 9
        down 9
        forward 5
        forward 1
        forward 5
        forward 8
        up 5
        forward 1
        down 4
        up 8
        up 4
        up 7
        forward 4
        down 1
        up 6
        forward 6
        down 2
        down 7
        forward 4
        up 7
        forward 7
        forward 9
        down 5
        up 5
        forward 4
        down 6
        forward 1
        up 8
        up 8
        down 8
        down 7
        forward 7
        down 3
        forward 7
        down 3
        down 5
        down 4
        up 8
        down 2
        down 2
        up 5
        forward 9
        up 9
        forward 2
        up 4
        forward 4
        down 2
        down 7
        forward 7
        down 1
        down 6
        down 4
        forward 6
        up 4
        forward 4
        down 6
        down 8
        down 3
        forward 7
        down 3
        forward 7
        down 7
        forward 4
        up 9
        down 5
        forward 7
        forward 7
        up 6
        down 3
        forward 9
        down 1
        forward 4
        up 9
        down 3
        up 9
        down 5
        up 6
        forward 1
        forward 9
        up 4
        down 3
        forward 1
        down 7
        down 2
        forward 2
        down 6
        up 4
        down 4
        up 9
        down 3
        down 9
        down 4
        down 1
        up 8
        down 2
        up 1
        forward 5
        forward 9
        forward 1
        up 4
        forward 5
        down 7
        up 6
        down 3
        forward 8
        down 1
        down 5
        forward 5
        down 5
        down 7
        down 8
        down 7
        up 6
        forward 8
        down 8
        forward 6
        down 6
        down 7
        down 3
        forward 2
        down 6
        down 8
        down 7
        down 3
        up 1
        down 7
        forward 8
        forward 2
        forward 5
        down 4
        up 4
        forward 9
        down 9
        forward 6
        down 7
        down 4
        down 8
        up 9
        forward 7
        down 4
        forward 7
        forward 1
        forward 7
        down 9
        down 7
        forward 3
        forward 3
        forward 2
        down 5
        up 5
        forward 5
        down 2
        forward 7
        forward 9
        forward 7
        down 7
        down 9
        down 5
        forward 2
        up 5
        down 3
        forward 7
        down 4
        down 3
        up 5
        down 6
        down 3
        up 4
        forward 3
        down 1
        forward 6
        forward 6
        down 8
        forward 9
        down 2
        up 3
        down 4
        down 5
        forward 3
        down 9
        forward 2
        up 3
        up 4
        forward 9
        down 2
        forward 9
        forward 3
        down 4
        down 2
        down 5
        down 4
        forward 4
        down 1
        down 9
        down 2
        forward 8
        down 5
        forward 5
        up 7
        down 5
        down 2
        forward 5
        up 4
        down 5
        up 3
        forward 7
        down 9
        forward 5
        forward 2
        forward 1
        down 7
        down 9
        down 2
        up 2
        up 2
        up 4
        down 4
        down 7
        down 3
        forward 5
        forward 3
        up 6
        down 6
        up 6
        up 9
        forward 8
        forward 4
        up 3
        forward 1
        forward 2
        up 5
        forward 5
        forward 8
        forward 7
        forward 4
        down 1
        down 8
        down 1
        forward 3
        up 1
        forward 7
        forward 4
        down 8
        forward 7
        forward 9
        forward 3
        down 9
        down 9
        down 3
        up 6
        up 1
        down 4
        forward 5
        forward 4
        forward 6
        forward 8
        down 6
        down 3
        forward 5
        forward 6
        down 4
        down 2
        up 3
        down 3
        down 7
        down 5
        down 5
        forward 6
        down 4
        forward 1
        up 2
        forward 3
        down 1
        down 4
        down 9
        down 7
        down 9
        forward 9
        down 6
        down 3
        down 2
        down 5
        up 8
        forward 5
        forward 5
        forward 4
        up 5
        forward 1
        down 9
        down 1
        up 5
        forward 8
        forward 6
        forward 5
        down 1
        up 5
        down 8
        up 7
        down 8
        down 2
        down 3
        forward 2
        up 4
        down 6
        up 6
        down 3
        down 7
        up 3
        forward 4
        down 3
        forward 4
        up 9
        forward 5
        down 2
        forward 7
        forward 5
        up 3
        up 2
        forward 2
        down 8
        down 1
        down 3
        up 5
        down 4
        forward 4
        down 1
        forward 9
        down 3
        down 7
        down 4
        down 4
        forward 7
        up 5
        forward 4
        down 8
        up 4
        forward 6
        down 1
        up 4
        forward 4
        down 6
        up 5
        up 1
        forward 2
        down 5
        forward 8
        forward 6
        down 8
        down 7
        down 7
        down 1
        forward 5
        forward 7
        forward 7
        forward 7
        up 3
        forward 9
        forward 1
        down 9
        forward 4
        up 8
        forward 1
        forward 5
        forward 4
        down 2
        forward 4
        forward 9
        forward 3
        down 1
        forward 4
        forward 9
        forward 5
        down 5
        down 5
        forward 7
        down 3
        forward 4
        down 6
        forward 7
        down 2
        down 1
        down 5
        forward 4
        forward 9
        down 4
        forward 2
        down 8
        up 5
        down 9
        forward 8
        down 3
        up 6
        down 2
        down 4
        forward 4
        up 2
        down 4
        down 4
        up 7
        down 6
        forward 4
        down 7
        forward 3
        down 1
        up 1
        down 2
        down 6
        down 4
        up 3
        down 6
        up 2
        down 6
        forward 3
        down 9
        forward 5
        down 5
        down 9
        down 9
        down 7
        forward 9
        forward 8
        forward 9
        up 9
        forward 7
        forward 4
        forward 4
        up 5
        forward 2
        down 1
        up 9
        forward 2
        forward 7
        forward 1
        down 9
        forward 9
        up 8
        up 1
        up 7
        up 7
        down 5
        forward 2
        forward 8
        forward 6
        down 7
        forward 1
        down 9
        down 4
        down 4
        down 1
        up 7
        forward 4
        forward 6
        up 5
        forward 2
        down 9
        down 7
        forward 1
        forward 2
        down 5
        forward 3
        forward 8
        forward 6
        forward 3
        forward 2
        down 1
        forward 1
        forward 1
        forward 3
        down 9
        up 9
        down 9
        down 6
        forward 7
        down 6
        forward 9
        down 9
        down 7
        down 1
        down 9
        up 9
        down 6
        forward 9
        down 6
        forward 3
        down 8
        up 5
        forward 5
        forward 8
        up 3
        down 8
        up 6
        forward 4
        down 2
        forward 6
        down 9
        forward 6
        forward 4
        forward 9
        forward 3
        down 2
        down 4
        forward 5
        down 9
        up 7
        forward 4
        up 1
        forward 1
        down 6
        forward 3
        forward 7
        forward 2
        forward 2
        down 5
        down 9
        down 3
        down 5
        up 3
        forward 1
        down 2
        down 4
        down 1
        up 9
        up 5
        up 1
        down 1
        up 9
        down 5
        up 3
        up 3
        down 7
        forward 4
        down 6
        forward 2
        forward 7
        forward 4
        down 2
        forward 6
        forward 2
        down 3
        up 3
        up 9
        forward 9
        forward 9
        forward 6
        down 8
        down 1
        forward 9
        up 1
        down 6
        forward 6
        up 5
        forward 2
        forward 6
        down 9
        forward 1
        forward 8
        down 8
        forward 4
        forward 7
        up 6
        up 1
        forward 7
        forward 3
        forward 2
        down 4
        down 7
        down 7
        down 1
        down 6
        forward 1
        down 9
        up 9
        up 9
        down 2
        down 2
        forward 5
        up 2
        forward 7
        up 5
        down 9
        forward 7
        forward 2
        down 8
        up 1
        down 5
        forward 6
        down 8
        down 7
        forward 4
        up 2
        down 8
        forward 2
        down 5
        down 4
        down 9
        down 1
        down 9
        down 6
        down 3
        forward 1
        forward 6
        up 1
        up 1
        up 9
        down 2
        down 2
        forward 5
        down 3
        forward 4
        down 3
        down 7
        down 7
        forward 4
        up 3
        forward 4
        down 3
        forward 8
        forward 1
        up 2
        up 1
        forward 1
        down 6
        down 1
        down 3
        forward 7
        down 7
        forward 4
        forward 5
        forward 3
        down 5
        forward 9
        forward 5
        down 7
        forward 6
        down 4
        down 4
        down 9
        down 3
        up 9
        forward 7
        down 7
        forward 6
        down 2
        down 9
        forward 4
        forward 1
        forward 4
        down 5
        forward 7
        down 9
        down 8
        forward 9
        forward 1
        down 9
        forward 6
        up 5
        forward 9
        down 1
        down 5
        forward 4
        forward 5
        forward 8
        down 5
        forward 9
        down 6
        down 2
        up 4
        up 8
        forward 3
        forward 4
        down 3
        forward 4
        up 6
        forward 3
        forward 8
        forward 7
        down 1
        down 9
        down 8
        down 8
        down 1
        forward 9
        up 4
        down 5
        forward 7
        down 8
        down 3
        forward 9
        down 5
        forward 7
        forward 2
        down 4
        forward 2
        forward 7
        down 6
        forward 7
        down 2
        forward 9
        down 9
        forward 8
        forward 8
        down 6
        forward 7
        down 8
        forward 7
        forward 3
        down 1
        up 8
        down 5
        down 6
        up 5
        forward 5
        forward 5
        up 5
        up 3
        up 7
        down 6
        forward 8
        forward 4
        down 2
        up 5
        forward 8
        down 6
        forward 4
        forward 2
        up 8
        down 8
        down 5
        down 4
        forward 9
        forward 9
        forward 6
        forward 6
        down 3
        up 1
        down 4
        down 8
        down 9
        down 1
        forward 3
        forward 1
        down 9
        down 3
        down 7
        forward 6
        forward 9
        down 8
        down 8
        forward 6
        forward 1
        down 3
        forward 1
        down 8
        down 3
        down 9
        up 1
        forward 6
        up 2
        down 3
        forward 4
        forward 2
        up 2
        down 5
        forward 1
        down 3
        forward 9
        forward 4
        forward 6
        down 3
        forward 7
        down 6
        up 3
        up 7
        up 5
        down 4
        forward 4
        up 1
        forward 7
        up 9
        forward 3
        up 1
        down 3
        down 4
        forward 4
        up 3
        down 6
        down 9
        down 6
        forward 4
        down 9
        down 6
        forward 4
        forward 3
        down 3
        up 7
        down 9
        forward 8
    """.trimIndent(),

    "day03" to """
        111011110101
        011000111010
        100000010010
        000111100110
        110011111011
        001100010111
        011000100100
        110011111010
        101011010111
        010001001011
        001011011010
        110001000110
        011101111111
        100101010010
        011010010001
        010111011110
        001101101001
        100000100101
        011010100101
        010011010011
        100000000000
        001010001000
        101100110001
        011010000111
        011011101101
        101000011111
        100010110000
        101011000010
        010001100100
        100100011001
        111000101110
        101010111010
        000111011101
        011101110101
        000010101101
        110110000000
        111110100101
        100110101100
        000001100001
        101001110010
        011101100001
        110111011101
        000001111001
        000110110000
        111001110110
        101011110101
        010010011000
        101011110011
        011101101110
        100010000110
        001000010110
        110000000100
        010111101101
        100000001110
        111010100101
        101000000110
        100001101111
        000010011010
        111001000100
        000100011101
        000101101001
        100111110011
        111011010010
        110111001010
        100111111100
        011011110101
        011001111111
        111010101101
        011111010000
        100010010000
        111110111110
        000111101100
        100001011101
        000100001010
        111110101110
        001000011010
        010100010011
        101111101011
        001001001101
        111111100101
        000101110011
        100001000000
        100001111011
        001001000111
        101101001101
        010011111011
        111001001110
        000100010100
        000101100001
        111011000100
        010101111010
        110110100101
        001011000101
        100110000101
        001110100100
        100111110111
        011100001101
        001001111110
        000001011011
        101001011011
        010111101011
        101001011101
        011101110011
        111110100100
        101100010010
        110001000100
        001101000100
        000110011011
        100111101111
        010100000110
        100101001011
        101101000000
        110000111100
        010011110100
        110101000110
        011111010101
        100101010100
        111111010000
        011000010101
        000001010001
        100100100100
        101101101111
        011011000111
        100101101011
        101001001101
        010110111000
        000111111000
        110010100001
        011011011011
        111001111111
        101010010010
        011110101000
        001110110100
        111011010111
        001011010011
        101000010100
        100001000001
        000001111101
        011000000101
        101010101111
        100011100010
        010010100111
        011111000010
        110000111010
        010111110110
        101000001100
        001111001010
        000000100110
        100000101100
        010001011011
        000000110011
        011101100110
        000011101110
        011110011010
        100000110110
        010011011010
        001000000100
        001001101011
        000101101111
        011000110011
        101001000101
        011010101100
        010010111111
        110010100101
        011100101011
        011110111000
        001000101001
        010011111001
        001111001000
        111010000110
        000010000011
        100101011010
        100010001010
        010111010000
        000000111101
        001000110101
        001101010000
        100000010101
        111000010000
        001100010010
        000110101100
        001111110111
        100111010100
        000110001001
        101010111000
        110111101011
        110000010101
        011000101011
        010111001111
        011000001101
        011011011100
        011011000110
        011110111100
        010110010011
        000100110101
        101100111101
        111001100001
        001111010011
        110100010110
        111010000011
        000011110000
        010010111010
        100010101010
        110010101011
        001100001010
        010011001011
        110011000001
        010011101001
        010101000111
        001011000001
        001110101001
        011111110101
        000011100000
        001001000011
        010111110000
        011001000000
        111111011001
        111010001100
        011011001001
        111001101100
        111001111011
        111100111110
        100110111011
        011011110100
        111011100001
        000111110101
        011100001010
        001110110101
        101110011010
        100010100000
        100100111011
        110000110010
        001000101010
        110001100011
        001101100100
        000101010000
        011110110001
        100100110101
        111101111100
        011011111001
        111101000000
        000100111000
        101100100001
        111100001011
        000111110110
        100101001010
        100000111100
        100100000000
        011001011101
        111111100100
        111101010110
        011110001110
        100101110010
        101110011101
        110001100111
        001110011011
        001111111100
        001101111111
        011000100010
        010001110111
        010010110111
        001001001000
        010010010001
        100111010011
        000011110100
        110000110011
        100001101101
        001111110010
        100111110100
        111010111011
        101011101001
        000100100000
        111010110100
        011111010011
        000101011111
        110011110111
        110101001110
        101111111010
        000110111111
        101011010100
        100011000000
        101010001001
        001110100010
        110100111101
        001100011100
        100111001000
        001010000110
        000001100110
        001000101110
        010011101010
        110001100000
        011011111101
        110110001101
        010101011010
        010010001101
        010101111000
        001110001011
        001001100000
        101110110011
        000011011011
        001010110101
        101101011100
        101011100011
        010100010100
        011111010100
        100110101110
        001100100100
        001100111100
        000000100111
        101011001110
        010010100101
        010100001111
        000010111101
        000111101101
        100010000010
        110101100100
        111100101100
        101101110000
        110000011100
        101111100111
        010111100000
        010100001101
        000110111001
        010010011100
        110000110100
        011000000001
        010100100110
        001111011101
        111101111010
        011011101111
        010011001000
        110010101000
        101001000111
        101100000111
        111000110011
        101101010011
        110000111000
        000010000000
        100010101111
        000111101001
        000100110000
        110011011101
        110110010110
        110100110100
        011110111101
        000001011100
        101010100000
        010100101000
        001111001100
        101010000010
        111000100110
        111101101111
        001000010111
        110000011101
        110101010010
        110101110100
        101001001011
        001001101000
        010001111110
        010011111000
        101010110001
        101110010101
        111011011110
        111011111000
        110000110101
        011110101010
        110011110110
        110001001111
        110001111011
        000011010011
        010001001001
        001111110001
        101000111101
        101010110010
        010100101100
        101000100100
        001110100101
        011110110110
        101001111011
        111100000010
        011010100011
        000011000001
        010101110111
        000010100110
        111110010101
        000110100100
        010111001110
        111100111101
        001001011001
        000111010011
        010100011011
        011111100101
        110111010111
        101111000001
        101010010001
        001111110101
        111111111001
        011010110111
        000110011000
        010010111100
        101011110100
        110010101001
        111011001101
        110010001001
        010100000000
        011101010001
        011100111101
        000111010100
        111111001100
        011100101100
        110100000011
        100011101100
        101101001011
        100111100001
        011010111001
        101010111100
        000011111001
        101010100110
        000110111011
        101100011011
        001100111101
        100110001010
        001011011111
        110111011011
        100011001001
        010000101100
        000111101000
        101011110000
        001111001011
        111010000101
        101010011010
        000100010101
        110100101001
        100010111010
        100011111111
        010010011111
        101010010111
        001000101100
        000000111100
        101000001010
        100010010011
        110011001111
        010001101111
        000000000010
        111100110100
        100001001010
        100101101010
        101100000001
        000110100001
        111101110010
        001100111011
        001101001001
        001010010000
        000001001111
        100101001100
        110010010001
        011010010010
        101100011010
        001101111101
        101111101010
        110111101110
        001000011000
        101100010110
        010001100111
        001011000010
        000010110000
        111100000100
        111100100111
        100101100110
        111101000100
        101110010100
        101011010010
        100111110000
        111101100000
        110111110011
        000000100000
        011011110111
        100110101111
        010011111110
        011111101001
        101001100000
        011000010010
        101001000011
        001001010011
        000010001100
        000110101000
        101110100011
        010001001010
        000110011111
        111001101110
        100011101110
        101001110001
        101001110100
        001001000001
        101100110011
        001111100101
        101111010101
        001111001001
        110101100011
        000000011001
        100100011010
        011011101000
        000011011000
        101011100010
        101110101001
        000110101010
        011000000100
        001111010001
        110001110010
        001101101110
        000100111101
        001000001001
        000111111100
        001110111010
        101000011110
        100001101100
        110101000111
        000011010101
        101110010010
        111011000000
        100100111111
        111100000001
        000100011001
        100001100010
        110011100001
        100100101010
        100100110000
        011000110100
        101001110000
        101111100110
        100011101001
        110100111001
        100011111110
        000001001110
        000110100111
        001000100100
        101011111110
        011100100111
        100101111111
        001011111110
        000010101100
        110100011101
        000100101010
        111001011101
        011010000000
        011011010100
        001001100110
        100000100111
        011000011010
        010000100100
        011010110011
        001011100001
        010111101111
        010100110000
        001111101101
        111001101001
        001001100011
        000000100011
        110010000001
        110000110110
        010011100001
        001000011110
        110001110100
        111111011111
        010000111001
        001101001011
        000111110011
        011110011101
        111001010011
        000010111111
        111000110111
        010100010101
        010100111011
        110001110011
        110100010000
        011110111110
        010111010011
        100001001011
        011010110101
        001111110110
        111011110000
        001110111100
        001101010111
        010110011001
        111000000001
        101011000110
        010110111001
        101010110101
        010010101001
        001110011110
        010100000101
        010011010100
        011110110101
        100000001000
        011011100111
        000101100000
        101001101000
        001101010010
        101110101011
        000110100011
        100110001100
        001010110111
        010000100111
        100100110111
        101000111001
        101011001101
        011110101101
        110010011000
        011100101111
        111101111101
        101001001000
        111010100001
        011011100101
        100110011101
        011100000011
        011110001001
        011111000011
        011100011001
        010100011010
        111010101111
        101100100101
        110110101111
        001011100110
        001110111011
        010010001011
        111001010010
        001011011101
        110100010011
        010110001000
        001110100111
        110011011110
        001011111000
        011111111011
        100111111000
        110000010011
        010011011100
        010111001011
        010110100111
        011010000110
        001111100000
        000010110110
        101011001100
        001100011001
        010010011001
        100010101001
        110100111000
        111010010010
        101110110000
        110100001010
        001010000011
        110111111001
        010100010110
        000110110001
        100101100010
        111101101001
        011001010110
        011100010010
        000111100000
        110000010001
        001010001101
        001001011101
        011101101000
        000101111101
        101101001000
        111010010001
        001010011010
        110010111100
        100111101101
        011111110100
        000110010011
        000011110111
        110111100011
        111111100010
        101101100010
        000111100011
        011010000101
        101010010101
        010101101000
        001001101100
        111000011001
        100100001111
        000001011110
        000101000000
        011011011000
        101111010100
        010101010010
        011001001001
        011100010001
        101101110011
        101110111101
        111011010000
        110000011000
        011111110001
        101111010000
        100101101101
        011001111101
        100101111100
        001110001110
        011001101001
        111101110101
        111100110011
        011101010011
        111111101010
        000011100111
        110110111100
        001010100110
        001011101001
        101001111001
        111101001010
        010110001111
        010100001110
        001110100011
        111111000000
        010110011101
        000110010010
        001011001111
        010111110001
        100100000111
        100110010110
        110100001101
        100001001100
        000010110111
        010000110001
        101110101000
        010000010010
        001001101001
        010110011011
        110101000100
        000000101011
        101001111100
        110100110110
        100001100100
        111010110000
        101110010001
        000000000110
        000100010111
        011010100100
        110111001000
        000000001111
        111111011101
        010100010111
        110010100110
        100100110110
        001101100101
        101010100111
        001110000100
        001010011101
        011110001011
        000101100110
        011000011101
        011110011000
        001011000100
        110001100100
        001111011000
        101000001101
        110111000010
        110010101101
        110001001101
        000011111000
        111110011110
        000010100111
        111111011110
        110010001010
        000101100111
        101000110001
        011111011010
        010111110010
        011001100011
        110011001010
        010011001101
        110101010111
        011101001110
        010011000110
        110000001100
        100001111111
        010101001011
        001100101000
        101010011101
        000011101010
        100011011110
        111001111110
        100110001111
        100101011101
        011111000100
        000010101010
        110010010100
        001110000010
        100100000100
        101011011110
        100111001111
        100101011011
        110001001110
        001101011110
        010001010001
        000110100000
        001000001100
        100111000100
        100010000000
        101111111111
        010011101111
        101011100100
        010111011111
        110011011010
        111101000110
        010000001010
        100110100100
        011000011100
        100011011001
        101000001111
        100001100101
        111110111010
        110101010100
        000110110111
        001110000011
        101110101101
        000101011100
        010011000101
        010101000100
        000001001001
        111011101110
        001010011011
        000001000010
        111110001011
        110101111111
        010000010001
        001100000011
        101101000011
        110100001001
        111100010011
        000000001100
        100000101010
        001011101111
        011111101000
        111011001000
        010011101101
        100101010011
        101000010110
        011100000101
        011101001000
        111000001011
        100001011010
        001000111011
        001100001000
        001011010000
        001000110100
        010011100010
        000111010101
        000000010011
        000011001000
        101100110101
        100110110100
        001100100000
        011100000010
        010101111110
        100100100001
        110111111000
        110110011110
        000101010010
        010011110010
        000000111000
        111000001000
        000110001000
        101010110110
        010111111111
        011100101101
        010100000111
        100010011011
        110010001011
        110011110010
        010101110110
        110000011110
        101010011001
        100100110010
        110100010111
        100001010101
        111010010011
        011100001110
        111101110011
        001011010100
        000001000001
        010010101011
        110000101110
        111100011000
        100001011111
        010011010110
        100001000100
        010001110000
        011011001000
        101101010001
        011101101101
        011001010010
        111010010111
        100110011001
        111101010111
        111110111011
        000011101001
        001010111001
        000000011111
        000000000000
        100100000001
        011100011010
        111101010101
        001001001100
        100010110111
        110111010010
        001110101010
        111010101000
        100011100001
        000000111011
        011000010110
        010000111011
        111110110000
        100001100000
        001110000111
        100000100110
        101000110000
        000110001011
        111111101101
        010100101111
        100111000010
        010110110111
        101010111111
        000110111101
        000100000100
        011010001111
        110010111001
        101001000001
        010010011010
        110011111110
        011000010001
        110110010100
        110110111110
        101100010001
        010101011000
        011000111111
        010110010000
        101100111001
        000111001000
        010010001001
        101110100101
        001110010110
        101011011011
        111111110100
        010100101101
        001110110010
        010101001010
        110011010010
        011011011010
        100110010111
        011111101011
        110010110100
        100100111110
        100100000010
        010000111100
        001111101011
        010101101001
        110100001011
        110101010110
        010111000110
        011101100011
        001011100111
        011001100010
        101001110011
        001100111010
        101000011001
        110101111100
        110011001110
        100001010111
        111111000010
        010110010010
        101000000101
        000010010001
        001100110100
        100010011111
        100111111101
        111111000101
        010000110100
        000001101010
        011000001010
        010000111111
        000010001001
        111110100000
        110101010000
        001011011011
        011011100011
        001011110001
        010110111100
        100011010001
        011010001110
        110110111000
        011011110001
        110100100000
        111011001001
        101001100110
        010010110101
        111111111110
        100001100110
        001110001101
        100111100101
        001101100001
    """.trimIndent(),

    "day04" to """
        67,31,58,8,79,18,19,45,38,13,40,62,85,10,21,96,56,55,4,36,76,42,32,34,39,89,6,12,24,57,93,47,41,52,83,61,5,37,28,15,86,23,69,92,70,27,25,53,44,80,65,22,99,43,66,26,11,72,2,98,14,82,87,20,73,46,35,7,1,84,95,74,81,63,78,94,16,60,29,97,91,30,17,54,68,90,71,88,77,9,64,50,0,49,48,75,3,59,51,33

        12 75 58 21 87
        55 80 14 63 17
        37 35 76 92 56
        72 68 51 19 38
        91 60 34 30 88

         0 66  5 51  8
        45 57 31  3 62
         7 60 40 29 90
        80 19 47 86 81
        95 69 68 53 93

        30 99 16 34 42
        94 39 83 78 49
        57 81 97 77 52
         9 61 98 11 89
        85  1 60 90 55

        87 49 12 85 88
        67 89  7 35 70
        37 45 93 84  9
        80 58 54 13 22
         8 71 48 15 39

        40 79 34 18 42
        35  8 64  5 63
        93 57 16 10 96
        22 20 23  0 86
        61 78 68 83 12

        43 78 64 70 49
        60 54 31 82  9
        10 69  2  1 50
        37 12 16 77 25
        18 14 57 13 91

        42 85 53 57 52
        19 41 84 68 28
        39 22 55 51 87
        49 23  5 66 71
        72 83 86 35 50

        91 75  9 62 82
        47 37 94  6 55
        96 38  8 19 22
        46 66 54 43 59
         1  0 26 36 74

        19 78 25 10 80
        23 88 95 42 11
        54 85 52 92 31
        73 87  9 17 93
         2 46 12 24 83

        84 73 85 51 89
        41 26 98 11 29
        81  6 35 39 76
        27 10 49  4 92
        55 43 28 45 88

        23  0 19 26 73
        72 42 40 58 38
        36 46 18 89 52
        85 35 50 13  1
        66 57 45 81 25

        11 71 35  0 95
        45 16 78 33 31
        30 34 25 91 36
        83 58  8  3 62
        67 14 72 93 28

        63 41 19 80 27
        69 15 99 75 95
        47 86 52 22 12
        66 43 37  6 97
        13  1  5 71 83

        19 42 85 53 31
        36 14 75 39 74
        70 86 97 72 69
        15 20 41  6 21
        26 33 48 98 34

         1 79 21 38 44
        63 71 14 17 87
        41 76 56 49 59
         3 18  6  4 77
        34 19 88 24 10

        78 20 30 54 92
        25 63 81  0 69
        46 87 26 56 40
        90 82 50 84 66
        96 41 18 29 23

        34  1 59 55 30
        97 19 82 23 77
        21 52 56 48 24
        29 43 28 99 69
         4 37 84 76 58

        96 10 11 79 40
        90 29 59 73 84
        16 62 74 42 92
        43 32 58 46 34
        75 12 57 22 15

        29 82 47 16 12
        78 84 83  0 77
        51 64  5 37  7
        49 70 19 69  8
        67 63  6 43 79

        87 67 52 64  8
        55 43 82 50 13
         3 19 94 54 83
        80 59 15 32 37
         0 58 12 89 96

        95 31 14 77 83
        26 68 33 39 85
        71 56 45 46 30
        44 93 16 17 52
        86  8 27  3 25

        27 67 81 30 95
        48 89  7  4  3
        82 90 78 85 44
        22 16 97 92 11
        15 87 47 79 62

        49 51 35 87 75
         3 70  8 43  5
        77 88 73 81 29
        42 62 50 37 85
        26 86 14 38 65

        81  9 84  3 37
        33 32  1 54 45
        39 83 82 36  2
        56 28 76 85 40
        96 69 43 24 71

        83 72 50 46 34
        15 51 87 44 71
         8 78 10 94 11
        67 40 85 93 35
        17 23 24  0 61

        62 55 47 77 95
        81 20 35  8 78
         7  9 89 27 51
        80 39 33 63 50
        67 34  4 87 57

        72 88 74 46 91
        67 66 32  0  9
         3 69 94  6 81
        40 95 29 83 20
        80 68 55 54  2

        72 68 65 91 81
        52 34 88 46 48
        66  4 54 27 62
        83 60 69 26 56
        19 11 35 22 84

        72 69 92 87 83
        55 95 85 66  1
        16  3 86  5 99
        24 22 29 53 90
        76 73 48 80 42

        38 22 94 50 20
        40 52 61 39 62
         7 35 95 54 66
        37 59 84 76  2
        81 85  0 48  6

        90 95 34 93  8
        46 13  6 58 85
        91 89 83 80 18
        56 57 44 99 17
        21 42 12 74 38

        28 61 78 99 23
        75 64 37 66 50
        53 70 89 17 63
        43 38 71 26 85
         4 13  2 27 18

        35 12 60  7 29
        87 65 17 81 10
        42 62 99 38 51
         2 57 92 27 89
        82 58 97 36 72

        43 45  5 99 51
        88  4 13 39 95
        44 56 31 33 94
        37 57 12  3 91
        50 74  6 76 30

        67 85 56 69 84
        74 65 61 66  8
        43 50 55 25 97
        78 15 49 73 27
        71 44 93 23 64

        83 38 97 85 76
        55 90 46 34 12
         1 52 18 59 48
        62 63 30 82 92
        68 95  0 72 84

        40 10 62 77 75
        93 94 32 27 60
        26 12 14 35 57
        88 53 97 95 24
        66 46 33  3 63

        25 44 90 34 17
        91 93 42 37 86
        95 41 82 92 31
        65 35 52 40 84
        85 57 71 19 29

        77 38 15 12  9
        65 78 39 81 33
        35 64 96 76 71
        68 93 79 22 40
        88 87 27  7 29

        10 81  7 92 64
        60 25 11  6 87
        34 49 20 13  0
        48 38 14 61 75
        71 86 39 37 22

        63 67 82 98 18
        11 95  4 55 44
        42 10 84 73 19
        17 57 53 61 49
         7 32 24 75 58

        50 90  1 98 41
        77  4 87 69 19
        48 44 68 10 17
        96 66 71 61 45
        18 86 26 73 16

         5 58 68 34 85
        44 89 72 21 27
         0 50 39 94 82
        23 13 41 81  6
        83 60 61 22 40

        59 41 63 92 69
        10 58 29 60  4
        76 15 46 34 85
        13 17 88 86 24
        62 73 19 67 98

        96 69 70 87 80
        28 27 40 77  9
        23 52 99  3 60
        81 53 26 45 35
        82 33 71 43 67

        30  8 41 71 26
        97 96  0 45 11
        61 12 91  7 50
        22 40 74 55 29
        53 78 43 15  5

        93 25 12 62 84
        95 31 87 83 23
        29 41  6 55 17
        33 85 42 20 56
        57  1 65 45 16

        76 86 27 75 96
        56 63 45 25 77
        54 44 64 41 13
        60 46 66 12 67
        84 59 39 24  5

        79 39 22 84 66
        76 38 99 21 47
        52 73  7 45 94
        70 78 24 16 40
        48 57  9 13 64

        17 80 28 51 94
        52 56 24 65 82
        38 96 21 70 23
        60 50 40 32 91
        45 77 37 44 89

        18  3 42 68 66
        22 35 95 29 65
         8 99 72 19  5
        44 80 11 60 76
        59 90 64 57 94

        66 97 62 49 89
         4 41  5  2 23
        54 48 43 45 76
        68 35 14  1 86
        34 47 26 92 95

        57 36 52 42 11
        49 83 94 72 26
        91 48 50 88 80
        70 23 81 33 15
        64 90  2 47 18

        68 11 16 77 28
        29 56 81 21 63
         2 88 54 82 40
        69 93 92 55 70
        57 51 25 80  3

        10 73  8 27 61
        74 66 47 54  1
        52 17 76  5 20
        70 44 92 59 34
        26 16 11 81 46

        10 31 95 17 44
        76 67 19 69 33
        36 70 25 71 99
        56 42 53 46 40
        90 85 81  6 26

        17 32 74 57 64
        37 82 92 54 59
        56 87 41 68 73
        44 98 58 95 53
        47 29 71 52 31

        19 58 84 14 91
        75 89 18 67  3
        11  5  2 24 37
        62 35 48 56 81
        54 77 16 70 45

         7 20 41 87 74
        17 47 45 96 49
         4 33 89 31 77
        79 42 52 29 85
        88 27 63 11 75

        61 87 90 15 17
        22 82 28 21 93
        65 98 12 23 24
        73 70 42  1 94
        83 79  5 18 55

        78 67 22 88 18
         2 43 14 56 92
        61 32 87 20  8
        28 11  7 12 70
        21 72 36 74 77

        27  6 97 66  7
        30 67 12 70 40
        18 61 78 36 23
        44 24 85 74 82
        55 42 51 90 34

        98  9 39 42 44
        50 54 43 66 57
        85 58 91 13 11
        67  5 23 59 70
        45 41 87 29 20

        97 57 48 42 73
        37 29 50 49 83
        55 38 69 13 44
        52 14 54 94 56
        24 77 16 39 66

        31 61 44 38 80
        11  3  0 56  8
        94 81  1 25 19
        71 23 36 66 41
        70 35 77 79 46

        17 96 13 25 48
        65 28 41 24 81
        39 87 74 42  5
        36 35 21 60 40
         3 83 11  1 34

        50 52 84 38 57
        15 20 26  3 72
        48 85  4 88 63
        39 34 32 42  7
        86 77 71 94 23

        28 60 13 25  0
        22 74 20 75 30
        97  5 21  2 73
         7 44 14 77 16
        43 68 76 24  1

        99 85  4 62 67
        46 86 43 45 77
        42 21 81 47 57
        71 35 23 10 29
        58 60 79 61 48

        33 10  7 61 17
        97 91 70 75 48
        81 80 78 34 36
        26 55 73 77 14
        85 84 62  9 16

        17 41  3 82 86
        58  0 51 79 29
        60 70 61 95 46
        98 85  1 72 93
         4 42 89 88 84

        95 16 26 32 29
        27 37 51 23 55
        36 10 50 70 57
        60 79 96 40  9
         3 43 74 94 31

        15 56 51 72 62
         8 63 23 90 67
        93 85 28 70 82
        33 65 89  4 64
        19 58 37 88 75

        34 71 60 84 85
        64 87 92 67  8
        42 58  4  9 75
        49 95 26 91 12
        27 56 74 90 20

        13 46 27 12 97
        90 25 87 73 41
        50 66 34 15 94
        45 99 88 86 21
        56 37 62 44 29

        77 31 59 94 74
        19 15 11 23 68
         0 36  2 98 30
        44 49 90 83  9
        13 88 69 66 81

        31 71 58 11 47
        42 41 10 83 21
        38  9 51 17 64
        37 13 93 81 39
        33 22 98 26 43

        60 89 20 94  2
        45 34 93 15 30
         4 16 49 92 28
        67 75 27 61 70
        25 84 55 91 88

        85 22 41 43  0
        21 77 12 64 34
        30 39 97 36 72
        56  8 65 82 84
        76  3  4 17 49

        16 61 63 41 47
        48 46 37 70 87
        57 31 36 83  1
        71  3 93 24 80
        51 78 91 17 86

        87 72 70 97 58
        54 16  1 43 46
        49 28 59 38 51
        24 15 10 84 94
        76 86 55 83 26

        93 10  5  1 92
        99  6 45 79 76
        74 87 47 25 24
        50 43  4 21 67
        81 39 49 12 86

        49 35 22 27 37
        90 80 68 52 59
        78 53 23 65 46
        30 61 75 97 31
         1 76 66 26 48

        37 11 88 20 99
        45 96 95 81 39
        60 55 80 58 53
         6 23  8  1 46
        98 89 16 73 78

         0 58 88 69 66
        82  9 31 97 55
        22 37 90 79 14
        44 45 49 43 60
        93 62 36 57 30

         1 34 89 90 46
        81 26  5  6 14
        75 74 62 55 37
        96 58 78 93 73
        35 40 13 95 45

        22 57 46 99 42
        65 39 38  7 81
         4  1 76 59  8
        84 60 37 55 40
        49 31  5 80 30

        29  4 96 50 24
        61 77 70 88 93
        12 64 52 25 90
        67 34 59 95 16
        79 21 82  6 63

        26 41 52 91 57
        92 95 33  1 62
        45 31 87 29 59
        44 86 99 81  5
        36 20 58 73 30

        55 96 28 26 17
        62 51 64 43 49
        37 41 36 75 42
        11 94 87 27 63
        35 23 21 29  4

        99 54 74 83 92
        27 53 15  8 85
        94 36 63 29 91
        58 10 45 38 79
         9 95 23 98 33

        52 14 99 30 50
        29 81 41 28 15
        43 51 61 56 62
        68 67 93 45 13
        23  6 70  8  7

        73 78 47  2  7
        45 16 46 65 21
        60 54 43 12  1
        20 23 42 56 81
        89 80 52 26 32

        79  5 10 11  7
        87 36  2 70 16
        99 44 49 43 19
        46 25  1 18 78
        55 76  3 73 15

        18 49 71 59 90
        97 37 23 68 62
        48  8 14 81 26
        88  4 22 76 12
        60 99 64 17 46

        99 25 79 42 33
         5 28 38 15 11
         8 78 51 40 65
        47  0 12 48 67
        14 98 53 43 86

        74 46 42 86 44
        83 96 61 38 70
        97  7 49  9 22
        65 34 66 90 51
         0 36 13 85 53

        43 21 64 86 20
         8 55 85 48 15
        58 49 87 29 35
        74  4 37 12 99
        98 69 75 39 71

        58 65 63 41 87
        19 49 91 34 37
        95 10 55 94 82
        78 71 66 60 96
        27 11 29 48 72

         9 78 51 18 93
        71 55  0  5 37
        24 98  2 70 92
        85 15 46 91 99
        60 68 41 86 96
    """.trimIndent(),

    "day05" to """
        105,697 -> 287,697
        705,62 -> 517,250
        531,627 -> 531,730
        21,268 -> 417,268
        913,731 -> 271,89
        214,697 -> 82,697
        376,661 -> 376,177
        519,859 -> 977,859
        782,98 -> 184,98
        612,179 -> 515,179
        340,772 -> 352,784
        111,863 -> 111,298
        944,73 -> 594,73
        465,21 -> 970,21
        122,592 -> 111,592
        975,975 -> 16,16
        327,532 -> 561,532
        811,618 -> 811,945
        623,437 -> 623,202
        380,591 -> 871,591
        278,514 -> 125,667
        797,946 -> 953,946
        325,61 -> 484,61
        450,422 -> 450,862
        923,972 -> 119,972
        813,141 -> 69,885
        926,834 -> 926,687
        137,564 -> 595,106
        415,566 -> 274,566
        726,354 -> 251,829
        889,236 -> 470,236
        282,376 -> 282,193
        343,248 -> 932,248
        790,918 -> 790,528
        532,369 -> 222,369
        15,378 -> 820,378
        279,507 -> 279,719
        641,68 -> 220,68
        340,270 -> 340,680
        939,364 -> 32,364
        686,106 -> 568,106
        919,365 -> 255,365
        870,236 -> 879,227
        322,397 -> 397,322
        984,980 -> 350,980
        392,864 -> 31,864
        846,975 -> 243,372
        253,981 -> 500,734
        98,193 -> 280,11
        477,460 -> 350,460
        690,833 -> 48,191
        469,409 -> 218,409
        321,532 -> 321,106
        868,341 -> 223,986
        185,174 -> 801,790
        256,658 -> 800,658
        808,576 -> 931,576
        959,913 -> 959,785
        976,969 -> 47,40
        891,931 -> 572,612
        600,804 -> 866,804
        149,368 -> 680,899
        799,882 -> 157,882
        803,214 -> 803,668
        53,900 -> 940,13
        424,800 -> 424,261
        985,924 -> 80,19
        158,194 -> 158,281
        683,237 -> 683,341
        493,482 -> 493,921
        664,195 -> 664,824
        689,405 -> 616,478
        946,873 -> 846,873
        977,988 -> 28,39
        305,892 -> 662,892
        891,27 -> 891,440
        136,897 -> 35,897
        948,458 -> 935,458
        569,100 -> 599,100
        542,292 -> 974,724
        501,825 -> 104,428
        875,872 -> 875,441
        631,924 -> 43,336
        874,846 -> 874,389
        947,932 -> 81,66
        75,480 -> 75,403
        211,622 -> 211,482
        344,904 -> 699,549
        227,508 -> 698,508
        677,774 -> 385,774
        279,267 -> 391,155
        294,801 -> 547,801
        717,446 -> 614,549
        490,903 -> 490,225
        872,751 -> 278,751
        580,163 -> 61,163
        198,800 -> 389,800
        147,728 -> 516,728
        675,417 -> 675,752
        147,544 -> 134,544
        977,70 -> 164,883
        349,976 -> 349,23
        897,10 -> 14,893
        602,349 -> 602,354
        326,332 -> 355,332
        53,331 -> 34,331
        617,333 -> 466,333
        661,537 -> 661,131
        985,18 -> 20,983
        953,580 -> 953,124
        70,363 -> 74,363
        448,38 -> 141,38
        957,175 -> 957,634
        88,316 -> 88,899
        231,94 -> 857,720
        643,566 -> 643,832
        724,955 -> 243,474
        368,521 -> 537,521
        649,245 -> 406,245
        92,304 -> 399,304
        978,491 -> 819,491
        99,637 -> 765,637
        243,159 -> 803,719
        139,756 -> 305,756
        815,226 -> 79,962
        317,562 -> 491,562
        783,95 -> 783,277
        207,321 -> 133,321
        752,136 -> 185,703
        752,990 -> 752,433
        282,841 -> 466,841
        314,31 -> 314,829
        637,873 -> 637,854
        60,746 -> 563,243
        646,566 -> 119,39
        260,475 -> 124,339
        603,647 -> 327,647
        990,202 -> 342,202
        981,620 -> 606,620
        475,352 -> 313,352
        184,497 -> 143,497
        130,929 -> 329,929
        779,111 -> 779,975
        892,960 -> 11,79
        37,984 -> 919,102
        589,794 -> 589,548
        665,668 -> 385,668
        668,301 -> 281,301
        860,122 -> 623,122
        18,914 -> 782,150
        691,150 -> 25,150
        117,439 -> 462,439
        926,695 -> 926,651
        907,644 -> 708,644
        545,120 -> 229,120
        181,659 -> 181,820
        362,543 -> 575,330
        603,531 -> 603,142
        754,404 -> 754,678
        703,551 -> 450,551
        794,137 -> 581,137
        866,288 -> 327,827
        676,613 -> 676,470
        874,130 -> 23,981
        132,288 -> 360,288
        706,147 -> 706,433
        734,646 -> 588,500
        641,386 -> 598,343
        743,726 -> 79,62
        308,192 -> 859,192
        858,125 -> 603,125
        694,199 -> 653,240
        251,407 -> 79,407
        254,337 -> 254,310
        586,850 -> 17,281
        937,989 -> 17,69
        503,784 -> 584,784
        17,97 -> 906,986
        909,987 -> 23,101
        11,465 -> 953,465
        645,862 -> 251,862
        741,488 -> 856,488
        488,123 -> 488,641
        720,775 -> 79,775
        228,105 -> 702,105
        344,804 -> 873,275
        953,848 -> 669,564
        188,76 -> 524,76
        473,852 -> 137,852
        515,14 -> 515,183
        362,654 -> 362,335
        76,73 -> 969,966
        987,743 -> 468,743
        912,28 -> 912,31
        464,247 -> 380,331
        171,20 -> 171,863
        855,653 -> 855,941
        505,415 -> 505,808
        947,543 -> 947,821
        907,365 -> 726,365
        475,563 -> 475,63
        927,679 -> 773,679
        938,77 -> 26,989
        345,909 -> 299,909
        46,22 -> 972,948
        197,735 -> 288,735
        552,748 -> 756,952
        946,180 -> 946,695
        956,779 -> 216,779
        120,105 -> 950,935
        924,902 -> 35,13
        530,49 -> 451,128
        491,693 -> 340,693
        533,774 -> 623,864
        177,618 -> 177,123
        543,114 -> 637,114
        503,585 -> 344,585
        34,836 -> 34,625
        618,802 -> 212,396
        863,678 -> 349,678
        26,850 -> 768,108
        99,67 -> 988,956
        11,902 -> 871,42
        658,749 -> 507,900
        967,178 -> 218,927
        671,247 -> 671,525
        421,985 -> 541,865
        279,639 -> 754,164
        627,747 -> 627,290
        77,66 -> 977,966
        177,282 -> 617,722
        400,444 -> 451,393
        540,152 -> 540,888
        521,196 -> 36,196
        32,590 -> 32,537
        145,613 -> 279,747
        45,428 -> 45,12
        785,956 -> 785,728
        205,507 -> 205,539
        117,12 -> 117,221
        395,17 -> 479,17
        104,881 -> 933,52
        918,716 -> 570,716
        121,621 -> 937,621
        516,773 -> 516,917
        311,605 -> 311,168
        611,185 -> 611,976
        373,80 -> 373,295
        987,295 -> 515,295
        416,717 -> 416,121
        251,508 -> 196,453
        498,824 -> 428,754
        956,818 -> 153,15
        266,272 -> 266,748
        769,312 -> 769,387
        604,766 -> 184,766
        656,934 -> 520,934
        224,771 -> 162,771
        588,395 -> 133,395
        219,489 -> 219,948
        67,42 -> 979,954
        684,109 -> 920,345
        168,895 -> 762,301
        761,953 -> 59,953
        583,408 -> 592,399
        129,48 -> 931,48
        694,76 -> 404,76
        808,380 -> 808,886
        643,165 -> 643,757
        714,543 -> 714,913
        258,550 -> 295,550
        400,857 -> 400,38
        267,573 -> 267,779
        124,182 -> 255,51
        399,981 -> 552,981
        197,803 -> 197,275
        791,706 -> 791,373
        500,664 -> 924,664
        177,171 -> 177,935
        703,43 -> 696,43
        265,849 -> 889,225
        847,324 -> 661,324
        369,965 -> 369,780
        169,965 -> 935,199
        742,540 -> 742,355
        210,854 -> 204,854
        58,281 -> 954,281
        858,793 -> 666,793
        276,156 -> 733,613
        537,538 -> 80,81
        985,10 -> 14,981
        79,31 -> 692,644
        77,41 -> 77,502
        684,150 -> 17,817
        295,785 -> 920,785
        171,579 -> 171,16
        763,754 -> 763,86
        719,573 -> 719,71
        183,708 -> 227,708
        826,952 -> 835,952
        124,914 -> 975,63
        807,704 -> 653,704
        140,468 -> 140,874
        408,330 -> 408,291
        501,958 -> 501,302
        834,505 -> 686,357
        267,76 -> 267,526
        18,88 -> 863,933
        147,188 -> 147,454
        922,733 -> 277,733
        509,259 -> 957,259
        614,765 -> 238,765
        77,54 -> 77,252
        591,532 -> 591,384
        539,574 -> 729,384
        347,158 -> 347,10
        389,988 -> 989,988
        696,571 -> 662,605
        656,207 -> 656,883
        802,446 -> 802,693
        121,35 -> 121,66
        967,738 -> 949,738
        12,86 -> 809,883
        96,167 -> 758,829
        790,42 -> 790,549
        14,987 -> 986,15
        363,689 -> 363,386
        148,148 -> 807,807
        891,899 -> 891,710
        445,678 -> 445,464
        649,426 -> 649,452
        641,378 -> 967,378
        580,220 -> 300,220
        376,789 -> 376,572
        770,551 -> 647,428
        651,692 -> 399,692
        432,385 -> 432,835
        242,48 -> 512,48
        955,612 -> 955,520
        926,568 -> 938,556
        626,836 -> 626,266
        973,982 -> 39,48
        64,32 -> 64,653
        503,444 -> 641,444
        593,306 -> 11,888
        287,138 -> 287,891
        529,886 -> 529,826
        217,320 -> 217,875
        11,988 -> 989,10
        291,30 -> 488,30
        864,945 -> 113,194
        550,501 -> 550,89
        269,474 -> 269,40
        953,394 -> 908,394
        451,983 -> 451,293
        135,121 -> 455,121
        30,35 -> 915,920
        31,451 -> 31,936
        300,715 -> 42,973
        577,459 -> 577,700
        291,539 -> 456,539
        373,449 -> 855,449
        222,136 -> 358,136
        206,14 -> 206,211
        977,577 -> 977,535
        183,723 -> 183,900
        888,905 -> 821,905
        51,301 -> 388,301
        859,594 -> 859,227
        767,343 -> 767,472
        36,897 -> 565,897
        450,481 -> 855,481
        137,401 -> 137,643
        771,276 -> 771,61
        767,144 -> 767,562
        212,111 -> 978,877
        841,117 -> 234,724
        975,104 -> 263,104
        839,408 -> 839,588
        122,50 -> 911,839
        748,208 -> 748,929
        230,305 -> 645,305
        107,324 -> 175,256
        726,339 -> 726,968
        780,127 -> 664,11
        392,148 -> 392,133
        228,607 -> 228,689
        469,379 -> 739,379
        797,851 -> 841,895
        896,494 -> 896,568
        351,950 -> 566,950
        593,387 -> 492,488
        939,664 -> 843,664
        463,159 -> 197,159
        164,265 -> 164,16
        164,147 -> 510,493
        989,988 -> 11,10
        98,676 -> 693,676
        118,384 -> 118,544
        220,502 -> 220,593
        530,437 -> 802,437
        321,29 -> 321,819
        438,118 -> 438,531
        268,128 -> 802,128
        602,770 -> 602,183
        841,58 -> 846,63
        582,371 -> 592,361
        174,163 -> 296,163
        927,268 -> 927,391
        579,280 -> 12,847
        52,951 -> 52,772
        645,203 -> 985,203
        725,119 -> 725,367
        155,112 -> 779,736
        988,44 -> 320,712
        438,463 -> 914,463
        193,948 -> 292,948
        217,398 -> 638,398
        70,553 -> 465,158
        271,262 -> 867,262
        964,576 -> 442,54
        253,67 -> 972,67
        537,507 -> 290,260
        537,645 -> 213,321
        366,130 -> 913,677
        834,283 -> 834,523
        858,825 -> 858,391
        146,60 -> 146,701
        865,909 -> 162,206
        503,628 -> 326,628
        49,101 -> 583,101
        692,17 -> 692,218
        704,744 -> 210,744
        144,434 -> 587,434
        630,393 -> 630,870
        606,616 -> 606,330
        41,83 -> 916,958
        80,341 -> 706,967
        426,683 -> 426,173
        919,962 -> 499,962
        442,49 -> 442,970
        740,378 -> 498,378
        563,196 -> 563,442
        222,76 -> 614,76
        398,451 -> 851,451
        62,50 -> 243,50
        775,114 -> 775,234
        650,901 -> 650,195
        164,10 -> 164,149
        127,751 -> 67,751
        122,674 -> 780,674
        325,652 -> 70,652
        944,908 -> 99,63
        40,985 -> 977,48
        946,21 -> 126,841
        872,906 -> 872,136
        365,288 -> 827,750
        348,935 -> 244,935
        371,963 -> 499,963
        816,595 -> 392,171
        953,673 -> 953,585
        223,612 -> 223,362
        327,423 -> 553,649
        661,693 -> 258,693
        10,838 -> 10,859
        985,814 -> 985,25
        331,529 -> 87,529
        611,460 -> 355,460
        928,426 -> 748,426
        540,172 -> 365,347
        57,45 -> 57,129
        20,861 -> 628,253
        460,474 -> 297,311
        549,876 -> 131,876
        748,197 -> 287,658
        639,137 -> 741,137
        917,35 -> 917,273
        482,333 -> 975,826
        176,817 -> 89,730
        894,418 -> 806,418
        555,227 -> 349,433
        317,33 -> 432,148
        93,988 -> 93,479
        635,300 -> 870,300
        301,437 -> 301,760
        660,548 -> 660,909
        696,18 -> 60,18
        231,787 -> 165,787
        500,242 -> 371,242
        88,126 -> 405,126
        983,941 -> 61,19
        242,519 -> 242,489
        519,957 -> 926,550
        606,181 -> 606,432
        873,216 -> 851,194
        880,924 -> 880,844
        321,119 -> 801,599
        963,392 -> 726,155
        190,655 -> 190,305
        542,676 -> 542,819
    """.trimIndent(),

    "day06" to """
        3,5,1,2,5,4,1,5,1,2,5,5,1,3,1,5,1,3,2,1,5,1,1,1,2,3,1,3,1,2,1,1,5,1,5,4,5,5,3,3,1,5,1,1,5,5,1,3,5,5,3,2,2,4,1,5,3,4,2,5,4,1,2,2,5,1,1,2,4,4,1,3,1,3,1,1,2,2,1,1,5,1,1,4,4,5,5,1,2,1,4,1,1,4,4,3,4,2,2,3,3,2,1,3,3,2,1,1,1,2,1,4,2,2,1,5,5,3,4,5,5,2,5,2,2,5,3,3,1,2,4,2,1,5,1,1,2,3,5,5,1,1,5,5,1,4,5,3,5,2,3,2,4,3,1,4,2,5,1,3,2,1,1,3,4,2,1,1,1,1,2,1,4,3,1,3,1,2,4,1,2,4,3,2,3,5,5,3,3,1,2,3,4,5,2,4,5,1,1,1,4,5,3,5,3,5,1,1,5,1,5,3,1,2,3,4,1,1,4,1,2,4,1,5,4,1,5,4,2,1,5,2,1,3,5,5,4,5,5,1,1,4,1,2,3,5,3,3,1,1,1,4,3,1,1,4,1,5,3,5,1,4,2,5,1,1,4,4,4,2,5,1,2,5,2,1,3,1,5,1,2,1,1,5,2,4,2,1,3,5,5,4,1,1,1,5,5,2,1,1
    """.trimIndent(),

    "day07" to """
        1101,1,29,67,1102,0,1,65,1008,65,35,66,1005,66,28,1,67,65,20,4,0,1001,65,1,65,1106,0,8,99,35,67,101,99,105,32,110,39,101,115,116,32,112,97,115,32,117,110,101,32,105,110,116,99,111,100,101,32,112,114,111,103,114,97,109,10,76,50,481,307,723,1100,235,147,851,504,1068,780,490,126,771,831,358,711,68,281,645,644,862,705,372,217,679,1097,1005,728,1739,571,40,1293,782,378,802,245,1370,1512,9,372,448,64,36,1212,141,585,1468,278,286,476,239,285,664,277,43,665,1037,654,205,1238,36,41,276,945,624,47,91,1569,284,107,845,60,961,30,21,269,1091,304,364,339,169,430,176,156,1483,1510,111,146,447,590,1227,611,483,428,396,839,307,901,380,128,80,535,461,482,379,59,281,977,44,966,545,37,163,845,845,151,936,269,938,612,1284,863,516,927,511,825,125,599,101,394,1062,140,483,218,83,443,404,492,78,507,860,1741,43,128,60,566,181,5,554,937,163,280,655,184,480,408,127,935,613,766,46,312,770,697,275,13,84,600,168,83,281,599,607,1441,197,344,0,302,414,147,370,748,421,844,871,319,666,117,640,247,167,529,324,252,235,303,443,1305,796,109,20,364,532,1388,708,769,916,340,405,90,47,504,516,97,535,28,69,960,590,254,106,188,190,1388,698,246,264,98,229,1648,292,710,14,421,31,147,1493,552,1371,454,4,146,674,452,1267,1027,170,141,936,1341,884,558,276,631,68,39,2,464,1,839,318,881,413,2,452,352,34,89,323,884,1439,243,79,56,128,1273,1134,606,11,682,747,415,599,782,179,269,320,682,177,336,466,10,370,159,1636,367,888,573,171,682,60,9,59,332,10,1496,637,1029,413,186,1183,77,309,461,883,1079,699,233,69,259,108,1160,435,480,495,13,858,718,126,115,728,1008,133,442,7,598,1475,1156,226,162,415,3,151,72,527,792,494,763,144,64,490,273,1245,300,465,744,36,1465,251,8,494,1126,362,180,1263,175,141,1041,103,163,205,568,93,699,103,437,204,931,563,550,88,415,146,265,31,221,1123,835,375,1101,578,388,92,1417,845,308,343,499,158,293,242,4,509,574,254,1556,69,668,691,0,558,16,687,1210,166,748,400,863,66,600,771,1073,561,738,398,384,232,350,393,1113,1222,153,462,907,797,712,18,1463,1185,1055,994,57,130,265,131,52,463,902,453,38,132,783,1560,232,169,1162,173,311,5,1477,397,336,480,540,491,67,340,27,291,341,35,275,78,1525,387,218,63,79,533,4,569,1643,595,1508,851,39,1200,912,10,53,42,60,154,1174,155,275,137,677,367,1373,4,708,441,756,647,1054,872,1039,109,530,1179,939,429,567,866,1411,436,23,212,184,66,79,831,538,90,827,678,549,313,434,60,907,284,171,570,1091,603,447,122,1092,29,789,563,462,15,310,340,16,365,393,614,48,368,42,457,736,737,1008,513,61,764,366,400,525,1683,1177,909,908,112,734,16,79,917,541,127,107,79,1208,32,258,596,166,376,1313,735,1457,864,563,55,439,54,694,81,93,48,470,1028,689,1177,1331,155,412,847,250,405,387,8,456,18,619,533,729,1475,1182,935,210,55,355,958,15,32,598,85,175,471,1087,280,652,53,13,225,12,488,717,353,2,134,351,698,276,456,209,535,604,19,12,785,3,63,879,437,216,1,1275,811,786,417,33,51,733,1074,143,309,65,555,557,78,611,909,260,973,701,998,490,213,9,233,760,933,916,437,1369,1952,372,324,859,670,73,296,1391,127,407,230,52,16,547,803,883,258,308,710,343,1290,184,8,41,9,68,104,175,1034,1544,219,752,327,690,134,601,1574,214,385,1233,231,267,944,1533,349,431,97,632,278,1505,162,888,62,90,489,351,990,846,14,159,134,14,314,148,214,1153,513,114,6,49,10,14,957,219,16,204,954,863,50,482,90,696,99,253,252,433,57,385,54,343,106,154,78,1595,590,380,102,825,1933,191,1328,374,263,355,137,494,60,781,1113,391,274,325,326,14,965,269,15,32,742,81,393,730,892,982,103,890,499,58,816,292,29,480,173,831,132,1033,1511,1137,1511,22,1105,146,344,308,915,540,1371,1238,414,352,304,841,749,6,491,30,1322,415,293,1207,31,90,636,303,1551,354,23,275,18,32,623,1483,49,12,311,407,1551,296,252,647,778,1499,98,1220,264,1020,1440,377,1125,8,72,270,162,348,3,1023,965,719,62,1467,1176,663,439,557,654,85,1493,70,349,10,727,15,1173,387,529,608,1398,905,619,173,849,1493,49,88,4,708,1084,370,1007,285,4,530,770,561,26,669,1100,30,876,649,178,32,354,621,911,334,514,9,449,1019,107
    """.trimIndent(),

    "day08" to """
        fdb bgfa cedfg abedcf defgba gbaed dagfbce fbged dgabce fb | bf dfbega fb baged
        ce cgfdea acdfe befda afgdc fec gdfbca ebdcgf cgea adgcfeb | fgcadbe cefda aebdf degcfa
        egca gdcaeb cbdfe bdaegf dgbafec ge agdcfb degcb cgadb ebg | edfbc bcdeg bfcde baefdg
        dfbc bc facgd feagb bfadegc gacfbd acgfb bagedc gacdfe cbg | afdcegb bagfc egcafd bcg
        edc aedcbf dgcf cgebf egdacbf bdega egcbfa gcedb cd edgcbf | gdcebf bedfgc dbcgfe cd
        gcfabed fed facegd abdge gcdfb fbdge befa abgdfe dgbcae ef | bgdfe befa fgedb adcbeg
        fca fbdcega cadfg ac dbca dbcgf cgfaeb dbefcg gcfbad gafde | gfbacd fdgea gdfcb bdac
        eb bgafe bgcefd fegcadb daeb eafcg gbdaf bfe edgabf agfbcd | cfdebg aegbf dbagf dgbfea
        aebfgd gbcead dfbecga gdceb decfbg aeg ae gacfd eacb edgac | ea aeg ea dfaegb
        gdc fceagd cagf cgfdbe febcad gecad gc agdeb fcade bfaecgd | fdaecg gdc cegafd adebg
        bdgcef acd bdgacf gbcfd da agbcd bfda eadgcf bcgea cfbgade | fcbaged bfdegc gecdabf adbf
        bd faebcg cdgfa fcbda fbd fbcae aebd bgcdef gebcafd cdaebf | dbae fbd gcebfa gacfd
        gbaefc gbfdec gfdbe edbgcaf fdab dfgabe gadec agbde ba gab | bag fegdb badecfg bag
        feba fb fgbca acfdg gcfedb fdbecga eacgb abcgef fbc adgbce | gcfba afeb gbafc ebgfdc
        fegbc abdfce egdba cea cgabe faegdcb edfgcb cefbag afcg ca | dbgcfe gfac bgead aegbcf
        acdbf gfebc afe ea fdeagb fgbaced cfeadb eacd fgdcab bfaec | bgadfc bfaedc agcdbf ecgadbf
        cefag dbgecf cfbga dfceag gdfcbea dfebac eg cge gdae cadfe | dagebfc ge ge cbdfae
        cgefabd agbdc dgef bedfac gcf cafgd dfegac fg fadec afgebc | decabf febdacg bcdag fgc
        dfe bdfa gfeabd dacbegf agcfeb edacg efagd gedcfb bfgea fd | aedgc fd febag acgde
        dgcf efbcga adgfbc gbcfa adfebc eabgfdc dc acd dcabg egadb | fcdeba egcabf acfdgb dbgac
        cagfdb eagdc ea gacedfb beac bagdec gdfbae eag cgfed dacbg | dafgbe adegc daegc adcge
        adf ecgbda afegb dbacgf adfgb ecgfbda cgdf fd dacbfe cgdab | eadgbc adgbf gdaebc gdebcfa
        abfecd gdbaf cdfg bfd gacfbd df badegcf fgcba acebgf eabgd | abcfde edbag cfegab fdegbca
        cdfeba dbec dc dfcea bdfea cafebdg gadfcb cagfe fcd abgfed | gdabfc eacfg cabfde bdfgca
        eadcgb acefd degac dgface bcfaegd baegdf cfdg df ecbfa def | cefad dcgf fde feadc
        ceagbd bedgfac efbdc gd edgbc gbad gdc ebgca fgecba egcfad | ebgdca fcgade edgabc fagebc
        aedbcgf fg agfdc gbcad edfcgb egcdaf daecfb fgd ceafd afge | defac fg gedfcb gdcfeba
        egfbda dbcfeg gafc abdce dgfabec afged adegc cgdfea dgc cg | gcd degfa cbead bagefd
        de aedbf aed acfgde ebgaf cafdgeb cdfab defabg bedg acefbg | efdba befag dbafc fcaged
        cdgfba dfb efadbcg dfea ecfabg gdabef gbafe dcebg fegbd fd | fgaeb dfabge eabgf gdefb
        bagcef fabeg ebca fbged afe cdefag gcdbfa bfagc agdfbce ae | fdgbe cbgaf bace gbdef
        eafdg dfc cdfgbe bdce cebgfa gfceb dgcfe cd begafcd gdcfba | edbafgc ebgfc fcedg aefdg
        aegf bgedc cfbega fgcbda cfgeb gf eafcdb feabgdc fgc feabc | cedgb facebd bgadfc gefcb
        ebacgd faecb bd cdb cgaed bdeg fgbdca dcgafe eabcd afdbegc | dbc deacg dceba gfbacd
        aeb dcabge ba edacf bdaf fcgeb cfabde agfbdce afcbe aefdgc | abfd fgecad gdaecf afcgde
        dbgc gfcea cafgd fgcdab dg abdfc bcgeafd fgd eabfdc gdaefb | deabfg cgbd dcfbag cefag
        cabgfe baedcg cgd dg acfeg adgf bfecd fbegcad egcdf fgdace | cdg egcfba defgc acbedg
        ef fbcgd afde eafcgb bfgcdae dfacge egdabc eagdc gecfd cfe | caged efgdc gdeacf fe
        ae dfeabc fgea fbcegd fcdge ace cgdae bcefadg dbagc dcafeg | cgadb becafd dcbag fgae
        eafdbg fdgc fgeadc egacd egd ebcad bgfeca acefg fdgeabc gd | afebgd cfeadg gd ecbda
        ebgfc agcbd bgcdef ea gfea eafgbc cae ecbfad cegba egdbcfa | cafbde dgcfbe aebcfd badefc
        badfce cf ebgcd acgbfed afdgeb bfagec baedf cdbfe efc dcfa | debaf bgedfca facebgd ceabgf
        ebfac dba ecgbaf ad cbfdega edcbaf feda cebgda cdafb dcbfg | dacbf adb fgacdeb fdcba
        acdebgf gbdefa gaebd dgb gbfe aedcg aedfb afdebc gb cdagfb | geadb adfgceb eacgd debcaf
        adfb adfgce ecafd dgbace bd cfegb bfeadc begdcaf fedbc bdc | bd ecdabf dceaf dbc
        gaceb fg edbgca gafb fcbeg bfaegc eadcfg gcf bfdcega bcdfe | eacfgd becadfg gf fcbed
        bdfcg ad begac gfbadc dga abcgd dcaf gcdaefb gcbdfe gefdba | dfbcg cdabg adcbg dagbc
        febgdac fgadce fa gdfbc dcgfba gcfebd afc gabcf bagec bdfa | agbec bdfa gcbaf fbcgde
        bdfgae fgead faebgc dabg bcfdge gde gefba gd edcbafg dcfae | cgfaeb fgcabe cafgeb gdcbfe
        eadcbf agfdb bfa ab dfgbc faedg aegb dcfaebg gbfaed dfcaeg | fagbd dfgab fgadb adfceg
        gaedc aegdcbf bdgf feagbc cedfg dbfec ecdbgf fge fg cbdaef | agedc dbfegc fg efcdg
        db becfag abd agebd bgcae bced efdag gbcade gbcadf gcbeafd | bd bdgefca dgeabc bd
        febag deg gefdab becdag defa dbfge gbcfd gcbeaf bfdgaec de | fead bagef abfeg aefd
        dfac aegcbfd aefcg daebgc eadcg fa bfeadg adgcef fae fgceb | cdeagfb fea cedgab bfcge
        ed dbfgce efdcb bafcged dcge bcadf afecbg dfeagb fegbc edf | debgaf ebcdf de fdgbec
        fadg dgefc da eafcd adc gdecbf bcgdae afecdbg dgafec caefb | caedf eagbcd gdaf gefdbca
        degbcf gfdbace fbced bedg abgdfc gecfa fceadb ecbfg fgb gb | gb gbdfca dceabf fcegb
        bagfce gfbac fbdcga ceab edagf eb afgeb gfdbec cfdbgea gbe | fdgceb fdage fgbac bfeag
        afbecg aecdg bfcd dfecgb febgad efdcg fed aedgfbc df efbgc | dfcb dfcb cbgef fd
        defca bgac egdfbc gfbea fgabde ceagdbf bfaecg cb afebc fcb | cb acfeb ecabf ebfca
        cdfbga befa daebc afcdbe fdabceg aed gdcbe acfdge cafbd ea | dae cedbaf dcgeb afbe
        dbefg gecad ecafgd aedgcb fecdba cb cbedg cbd ceabgfd bacg | fegdac eadgcf geabdc cedag
        abdcfg eagf cgf ecgbd badfce cabgefd gbcef aecfb fcabeg gf | gf gabfdc cgebf abcfed
        agdceb ebadc dfebc gbdac fegdac adbfgc cae ea befdgca ageb | edfbc acbefdg cdgefa bdcga
        efca fgbca gabfe eab ae cfaegb caebdg abfgcd dfgbe cadbgef | bfacge fabcgd eafbgc cfgbad
        cedbgf efbagcd aegdcb dabef feb ef badgf cdeba acfe ecdfab | ef eadfb baedcg edfacb
        af gfa egbdf ecgabd afcgdb fbadg facegd cbaf gcbda eacbdgf | abdcg gfadbec bfedg cdbga
        dgbea afeg ef cbedfg cbgdea fcabd adfbe efd efdgba gecfbda | cfbaged ecbagd fbgecd ebgda
        gcbeaf bf ebadfg dafb bcgde daegf cagfde bdacefg bfe dgebf | gceadf gefacb fgdeba gfbdea
        dgafbe dgfce cb cbafde eadbf dbca cbf cedfb gfaceb fdegbca | bedacgf bfc cdab ecbagf
        cadbef dfgac gfb bcedf gbdafe cgbe gdcfb cagbdef egfbcd bg | gdfbc ecbfdga bdcgf bacgfed
        dfcb cd gdbae gabdfce bfceg bdcefg ced cfdeag ebdcg efgcba | fgecba edbgcf cbgfed fgdeac
        ebgdcf cdfa cgafe ace gfedc cadfge aebgf adgceb fdecgab ac | cegdf gfeba edcfg ac
        agbefd bdgfe fdcegb dce ebgcd bcdga decbafg ec eacfgd cbfe | ec edgbc cgdba ec
        bgadc adbecfg gdbfce fdg dfeac agfb fdgac fg cbfgad dcgeba | gf dcfbge bgadc fg
        badegf abegc dfgc gbdaf fdgaebc cgbfa cf dcbaef cdbgaf bfc | dabgf cageb adfgb bdfagc
        ce abgdef ecdg fgbca fdage cadgef eca acfge acfbde bedfgca | cfage bagfc gbcfa eac
        gdfbe gcfeb febgda cfb fedc baceg ecgdfab dagbfc cf fbcdge | gfebc cgdefb bcf gebca
        gceabd bc ecb bdcef ebfacd fgeadcb abfc dgfec bdafge fdeba | gcbefda egcdba ecbgad gfbead
        gabec gaefbcd bgeaf ebf dbfag ef edgafb fbdgec fade bdfgac | bef abdgf fe ceagb
        bcfaged fdbgc dafcg edfacg dfb fb bdagef cfba dgbec gfdacb | fadgc cgbfad dcbeg cafb
        bdg bfdcae eagdb eacgd fagb afebd ebfcdg fcaegbd bg egdafb | fbedgc ebadf dgeabf aefbdc
        ad cgadbef eabcfd fdabgc dba dbace ecdbf fdae bdfecg acegb | bcgfda gfdcbe eafcbd cbgea
        efbda dcbfe bc bcfg egfcd gdcefb agbcde bec ecfadbg caefdg | dcagebf bc bfcdaeg cabfedg
        agde gdacef adgfc cbdfaeg cgfde cde badfec abcfdg fbcge ed | cde eafbdc cdfbae afbecd
        fdg bgfeac afgcbd bcfag fgeacd cdfb gbead fgdba cgfdaeb fd | bgacf gecdfa fd dfg
        ga agc cedgbfa bcfdea fdgcb geab gfbca ceabf edafgc cgefba | bgcfa fcagde edbgafc becaf
        agceb ecfgba decgaf eaf ef cdbaf gdcafbe fgeb gcaebd ecabf | fbdcage aegbdfc bagce fdagce
        cdage aebfdc bgacf fbeagc cfd bgfd defcgab acfgd gafbcd fd | cfadg dbface dgbf gdfac
        cefbda afcdb dgecfb dab cdefb bafdge ad deca gaecdfb acfbg | cbdgfe fecdb bdfce efbgdc
        aefbd ebcgfa ad ade egfbd abcefd cfeab bacd afedcg dbcagfe | edcbaf gfedcab dfgeb gefbd
        agdb ecfgb fcbaed agfdc bcd fgdcba faegbdc deacfg db dgcfb | dcb gcedfa agdfc bdacgfe
        gdfeab gcdfeb dg fdebc bdacef fbcegad gbced cdgf edg baecg | gcdf dg gbeac bedcf
        eb degbc bead cbegfa cdgfb gecad gbacde bce adfecg eafbgdc | dfaceg dbgce gcadfeb bcgdea
        dgcefb cad gcbad da dfcgb bcega bcfgda afdg dbfceag fcdeab | egabc bgfdce gcadb fbacgd
        gfadce eabfgc df gedab cdgf debcfa eagdbcf acgfe edfag afd | fadeg cbeadf aecgbf adfeg
        abcdg fecd ged aegcfd dgeca afegcb afcge debgfa de eafgcbd | ged efcgda gefcad aegfc
        gbfecd gafcdeb ebcgd efgbad fg dfgbc egcf egbdca fadbc fdg | dbacf gf fbdecg gdceabf
        ebdf dbafc gdcabf dagecbf cabedf afgbce ef cfaed gecad aef | ef dacbf febd gcbafe
        daebfg gfceadb agbde aegbc ebagcd cdgb cg baefc egc dgafce | cadbeg agbdec eafcb gebac
        dcfgbe ca acgde begdc dabc efdag aecdgbf ceadbg cae aecbfg | cgebd bfedgc defga bdac
        cbdf dacge fadec df dbafge eafcb fbdace dfa bgacfe cgafdeb | df eadcfb cdefa fecad
        fb feb cgeab cagdbe ebfadc gbcf adfge aebfgc acgbdef bfgea | efcadb gdcbae fbe afegd
        dgcf gaecb gfdeba bcdef dgb fgadcbe dg fdebca dcegb begfdc | bdg ceabg gabce gd
        dagc gaedb dgeabc ag ebcdg age fcaebg adfbe cdefagb gbcdfe | bdceg gecabfd acdfegb gacfdeb
        acefdg gacebd fdga bgdcfae afceg ecadf fgebc cdfbae gea ag | cfagde ega dcefab afdg
        bcgadf defgb cfea ec gdeacb efadcbg ecd ecgadf edcgf fdcag | dce fdgbe egacbfd efcagd
        dcagb dagbcef aedcgf deafb adbfg bfgc bgafdc gcedab gfa gf | gdfba fedba eafdcbg fg
        fedacb gdbcae gefda fbcae gecafb afegc gca gc edfbgac fbcg | bgcf gac ecafgb egadf
        ecfgb fdbega cbga gce bacfeg agfedc cbfgaed cefdb bgefa gc | dgacfe daefgcb gebfa ecg
        gefadb dcfbge ag abg fbcad cfgbea edga dbegf dgfba egbcdaf | ebfdga adgcebf gbdecf dbgfeca
        ecfgbd agde eacfgdb dgcabe edbcg facbd cabfeg bdace ea aeb | aeb fabdc egdcb ebacd
        ecgfda af fac cgfde cgefbd fagecb daceb gafd ebfadcg efadc | af fcegd bgceaf fca
        ca cgade adefgb dgfea edcbg dgeafc cfga dgbceaf dfaebc dca | cedga bdceg degfa ca
        gfced dgecfb ga ceafbdg afedb acdg gfeadc cebgaf fag fdgae | cgfeab ga dcfeg dbafe
        bcefda fcega dbga abgcdfe bgfdc dfgbce dca ad fgdac cadgbf | ad bacdgf da gcdeafb
        gdcea caebgdf agfdeb cfabge cbdafg gef bcef acgfb ef fagec | ecgaf fcage acged fe
        egc bdfge cedbg befc dabgecf dgfeac cgdab ce dcfebg bgfdea | dcgeaf ec egbfd ec
        gcbdaef fd dbecag fde gcdf acebf fgdbea gbdcfe dcgbe cefbd | egfdab fd cgfabed cbdegf
        abec baf ecgaf facgbe fecbdga ba fagecd bgcfda bfage dfbge | bgceadf ebdgf dfabgc acegfd
        dca eafc dafcgb cbead efabd cfbade faedbgc gdecb gfbdae ac | adefb adfecb cfbeda acfe
        eac becfgd fgadcbe geafd fcade eagbfc bcad ca abedcf fcbed | fcbed bacd fdgecb abcgfe
        bfad cbged efdgbac gdefac fd acbgf bdfgc cafbdg acgebf cdf | fdcgae gabdcf gcbdaf cabfg
        ebg bdfce gfecb dgceafb cafeg dgfcea cafegb gb cgadbe bgaf | cebgaf dcebag gbfa egacdfb
        edbacf eba dbgcfea dbef abdcge bcgfad gcaef be ebfca cdafb | gbedca cbafd edfcab bdfe
        fcdbae efacd aebd gbedfc afgdc gfcdeba aef efdbc ae cfbeag | bcfde abcgfe dcagebf gfbdce
        abg gcdfb ag afegdbc bfagd bcdefa fedgab eagbcf deag adebf | ga bdgfc efabd edbagcf
        fb befc egafcd gdbcf gecbafd fgb dgfce dcgba cdbgfe adebgf | cbgfde bf bdfceg edgbfa
        gefab efdabcg eagcbf de eabdfg geda egcfdb faebd cadbf edb | aefcgb fbade de afbge
        edfcgb ecadgb adbcf decbf fcgaed dfegc ebd dbagcef egfb be | gbef fgeb eacdgf dfacb
        dfc ecfgad abcfd befgca cgfabd cagbf gbdc dcbaefg dc bdefa | cd ebafd dc fdc
        aefgc cfdga acbefd gebdacf efg cbefga fceba eg begfdc bega | gbfdce dfbegc geba dagcf
        cfgbad fadebgc cga efgcd afecgb ac acegf ebgfa fbgeda ebac | fgbedac ac ecba beca
        dc gbcfda dbc egabc gcadbef agbcde bgdef deac bdecg gecafb | ecad gfbaec dc cegbd
        cadgef eb cgdeab ceb cbgdf befgc egcbfa cefdgab fbae cfaeg | cgdbea acbefg gaefdc gbecf
        cdfbea gbceda cgdfb cdbge geb acgefb dage eg afcgedb beacd | aebdcg gbdeafc ebdcga bcged
        cgbfed ba agefdb acbedgf adegb dcega abdf abg gfbde gbcefa | bgedf dbgfe dfab edbfcg
        ga geabc bfedacg efga bfgaec bgecf agb cdbfag abdec fcbegd | egfdbc cefabg ga gaebc
        cfebg cfgbea acdgf edgbfc dgfabec db fdebac bedg dgfcb dbf | dcebfa egbd dfb fdcgeb
        ecdgf ad ebdgac dca caebgf gebacfd fbace dabf bdecfa fecda | bagfecd dca abgcde bcefga
        de def dbeafc dcbaf efacdgb cfagdb afcegd ecdb gfeba dabfe | bdec fadeb de febag
        bdgfac ec cde fegc fdbeca fcgdb cedgfb gbecd fecbgda edagb | fcgabd ecfg bfadgc ec
        gfc fcbagd fg dfeg gbeadcf becaf bcgeda cgaed acgfed ecgaf | eadcgb cbfea gdef ceagf
        degac bcegd cedagb ebc agfbedc dfcgb adeb be cgadfe agcebf | eb daeb cgbed fcgdb
        aebcfd feabgc fgbdca bfcag df fagbd fdagceb fcdg baedg fad | debag dcfbea bgdfa gbacfd
        bef fe agebd fgacbe dcfba aebdf edfg gecdab fgcbdea afdebg | fdeba dbeaf bdceag adgbef
        cdefb gcabdf cgbdefa eg ebg fbegd bafgce bdaegf dabgf dgae | geb bfgacd gdea abgfdc
        acegdb fcge gceabf fadbe fgcba eagfdbc ce ceafb cafdbg ace | bfead dfcbgea faebd dfaeb
        agbfe bcfgdae bca gcfb gefabd bdecfa deagc cb egfcab begac | becag gedac bfgc caedbf
        adgef egcd gda beafd gcfbda cefdag gd dgcfeba egbcfa aefcg | abgdcef ebdfa edgc eafdb
        adecf faebd gaefcb ebf bfdc badge efadbc bcfeagd agcedf bf | dgaeb edcfag fb cbegfa
        gcfa becda dabgfe af ecfda efgadbc gcfaed egfcd fcgbde eaf | fae fecgd adfebg afedcg
        gbacdfe gfaecb fgeab cg fecdbg bcafg aecg abcdf fgadeb cgf | ebcfag cbdgfe bgfecd gecfbd
        adgcef gfbde dafcgb bceagd edbgc dbc baec bc eadfbgc ecgda | cb gdbeca facdeg fdbge
        fgabe ad dfbce fad facebg fbeadg fcgaed ebafd bgad gfceadb | dcfeb egdbaf fbecd efcdb
        bgfdc gbacef fgdeba abefg afec bcgfe aebfdgc ceg degacb ec | ec fegab fgcbe ec
        egfdc cbagdef fcaed fdg dcefbg dbcge fg dcbega bcfgad befg | cdeaf dgf abcgdf edfcg
        cdfgaeb eagcd decf efdcga ed fagdc gabec egd bfedag bdgacf | cdef eabcg acegdf egbac
        badfecg gdfabc bd dba acgbd fbdaec gbdf agbfc gecda fbcega | dbgac bcgfa ebgacf gcdea
        bacgfd dabec ebdgc fgcbade fdeg fbgdec dg begcf dcg cafgbe | gaefbdc dcbae fedbgc acebd
        bdcgf aedbgc befa gcfeb fgebac efagc eb efagcd efdgbac egb | gfabce acfged egdafc ecfag
        fade facbged defcb fe gdbace fgbcd cagbef bceafd feb edcba | ef cdbea fbe becdf
        edcag gaefd edcf cfegad egdbafc cfaegb aec bdcag ce gbefad | bdfgae abcgd cae cdbgaef
        cegbf ebfca gbc gc debagf cdgbef becagdf bfdge dabceg gcdf | ebfca cegbf ecbaf eafbc
        dgafe gbcdef efcdab bcga eafcdgb cefgba abe gcefb ba egbaf | gaefbc cfagbe fcbeg cedgbf
        befgac bed dfcabe db fcgeb gfeda decafbg egcbdf bfdge cbdg | eafdg agfceb febagc gbefd
        cdbfgae gcdfea agb gbfad dgfcb faegd ebda eabgfc ba bdgaef | gdfab cbaefg bdgaf fbgeac
        cabgd cbfagd fd gecbda fceadgb fgadbe fgdc ebcfa cbdfa dfa | gefabd fd cadfb gcbdea
        efga gfbce abgce cbgead cagbdf egdfcab bafecg bfecd fg gbf | fcebd geacb gadfcb fbcgae
        efg eagfd gcea bafgecd gdfebc bdaef cdafgb afgdec dgafc eg | eafdb dafbcg cadfg caeg
        ebcgad dbe efcgd caegb cgbefda dagb fabdce ebcdg cebagf bd | cfbaeg defgc fgced becfga
        bcadge fbedg aegc dbfcag ebgad gdbac gcfdeba ae eba bcdafe | gace agcefdb gbade eba
        eabd bfcagde egacd cgebfd ad dcgeba aecfg ebcdg cfdagb acd | dcgbaf cafeg egfac bfcged
        ebaf gcdeabf edgba dfacge gfbde fgdcb aecbgd bedgaf edf ef | bdegf ef adgbef dgface
        fbedca dgefa adebcgf bacfg efc fgeca fagced ce degc gaebdf | gcfea cfgeda ebfdcga ec
        ecba fedcabg bgedf age dcfgae feacgb ae agcfb ebagf cadbgf | fegba efagb afecdg afebg
        ea edbgf efadgc bdacfeg bgafe bcafg deba edbcfg debfga fea | fgedba bade gacbf adbe
        fdbage cabgfe edb efabg aegd gdecbf fbdae de fabedcg bdcaf | begdfc adefb gfdbce aged
        dafcbge febadg cfdea fdgcae ga gaf gcda bfcade egcbf cgeaf | ceagf fcegb afg adefc
        adfebc dfgb bg befacg daebf bfegda daegc bdgae gfacbde bag | aedcg gab abgde debag
        daegfb dgec aedcfbg fdcgeb bdcef fcadeb beg ge bgfce bcagf | fcgbed dbfega beg febdc
        fgcead edgbcf adebf cfb bfacge bcfae cfeag bagc gfcaebd bc | efbad abgc edgabcf acbg
        bcafegd eafdg dbfgc edgfc cdgfab geabdc gce ec egfbcd fbce | facbdg badgce dfegc aegfd
        bcdafge bedfag cfgbad abgc dgabf dgfcb cb cdb dcefg fabdec | dcb bdfagce cbfgd cdb
        afebdc adebc gdbca fbeadcg bacfeg eafd de bcdegf edc abefc | ed cgdab feda efacb
        agecfd bgcefd fecba ga egad agbfdc fcaebgd feacg gfedc fga | dega caefb fcgea fcaeb
        bfcegad facbgd egbfa ca gcafbe afec cdebg fbeadg bca acgeb | bfgace acgfdb cgedb beafg
        cefbad fd befd ecabfg gefacbd bcefa fdeca fad dgaec dbfgca | adf geadc fd dfaec
        adfbe becagf geabf ge gacbf efg gfdcea cfbdag ecfbadg becg | fgbae afdcgeb eabdf cgbaf
        fgdcae bgdfae cfdag ea egcfa gcbfe becfgda aef ceda dabgfc | gcfaed acdgbef efbgc cade
        cgbfde cdb aefcdgb cegda dgbca bafdg fbac badcfg cb gfadbe | dcb bacf cdegfb bfdag
        gdcbe bcdega geadc bfgdae fgcad eabc cgefdb gae acfbedg ea | gbdec gcdea befgdc gecda
        df abcgdf gfeba bfagdec gbeacd bcaefd abdfg abdcg fdb dcgf | fd fdcg abgdfc gbaedfc
        eg eadcf dfabeg cedg aecdfg afgcb cefdba debfcag egf aegfc | fecad fcagbed ecfag cagfb
        fbeadc gfa fg fagbd gfdebac eafdgb dacbg fcbeag fedab gefd | agedfb fg eafcdb bgedaf
        gbcadf begcfd fcbed caed dafeb eacdbf faebg cdeafgb abd ad | cbefd cfebd cead dab
        dceba gbcaed ag gdcbf geab bdaegfc acg acdbg bcfaed afcdeg | gcdbf edbca agcbd cdgba
        facbg fdgbca afc fgcade fegbacd af cgbad cgdeba fbda cefgb | fac caf fca cabfg
        badecf acbdf efac agedfb bgedc aeb baedc bgcdfa ea fgbcead | face eafc bacfd gacbdf
        bc ebfgcd gafbcd dgeacf gfbea bgc dcbe faebgdc ecfgb ecfgd | edbafgc bgefa bcfgde dfcage
    """.trimIndent(),

    "day09" to """
        7678921234988678901238954323498765432125789999567898765454223789989865432124569899894325678989212965
        6567890139876589992367896512987654321034569988979999879321012569876987573245979767799434599878909893
        5456799298987699989456789401398765732125678967991098988632123458965987684347898955688976988768919789
        4345898987698789878967894323499977543245789456789987999544345567894398789458997544567897976956898678
        3212987656569898767998985435989899764766789366789875987656776678993239896569987632456789865432234567
        4336796543456989658789976549978798765677890155898964298767897899789123987678998874567893984321045698
        5445995432345678945669987698766689976798931234987654109988999935678939899789679965678912995452166789
        6569876521236789123458998987654567899899545356998543212399990126989298759894579878789429876743278995
        7689986432345691012567999098767678976989876877899984323456789237892129642923499989896545987895345954
        8789976545856789134569892199898789895976989988999876567967898356799298731019989997998656798985457893
        9895989686787899246698789989999898769894394399989987678988987577898987656198968956999897999876568954
        4934399787899997657997679879987957656793239498765699789999599988967798868987657849899989879987679765
        3210239898989298799876534568896543234899398997654249899923478999456679879876543434678976756798799876
        4323359999879129987655423456789654455678966789743134998899567964345569998765432323459765433459893987
        5535698998968934599543012348998766566789355678951034997678978954233498999988751012578978712778932398
        6645987897659549698792133959429987679891234589432129865567899543102987899876542123457897653567890129
        9759876789798998999983249898902398789932356796543298754346789643229876553987854348578998765778921234
        9898765990987877698765398767893569898756789897954349853245678994346985432398765467689689978989434378
        9949976891396662549876989756789698998767893959876498432134679989459876654459876567896567989997545456
        9956987932985451234989977645656997649998932345987987543245789879569998786867997678987499797897697967
        7899999549876310125698765432345896432109985456798998676346789567998759897878998789599986656789989898
        6798897656995421234999876501456789543998976567899989785456894456789543998989559895498764345899878789
        5676789799876532459899997632567897669887987678989976998767943345678932109995446996987653234998765678
        4565692987987683769789876543478998798756799799878995439889321234589543319865325789876543129987644569
        3234891996598954598698998674989439979545678998956989421995495345678954429876434567998652098999432878
        4545689879459765986567899876896529865436567987545678939876989459789867834987545699899754987898541245
        7666799767249899865456778987898698965323457976434567891989879567899989655698956989798999876987672396
        8787898654123999794325767998999987979412399854323457892499968998998998776789769876587989765698983989
        9898987653234598643214656899998876898924987643212356789598956989767899989899889976465678924589999878
        8959199764545689954902345789987765786899876542101245678987547678958899898967999984324569012367899767
        7543019878789899899895496899876643245689987653212357899498636569446798767856789999313458923457998758
        9652123989896998789799989901985432136793298765323768912399923479234987654545998898926567894568989549
        8783435699934987654678978919876543046789109895434879101989812568995698543239896787987678985879876435
        9897545789219876543234567923987652167898912976545689239878601477889789632198785676798799976989989324
        9998676792101997689345698934598743999987893987866789398765412345678998744987674345889899899992398435
        8799787893912398795458789545689899887876689798978996989876323456889898759876543234578999788921987567
        7678998959893459987567899766798998776564599649989565878989554567996789769985432123699998677892398878
        6578999446789567899678998977897899656453878932199434567898765678945698978996543434589987545799469989
        3467891235697679998799567898986798743212367943098923456989976789434987899987655546678998624678978998
        2379910145789798969896466789875669853201458954987897599878999898559876789899897677889359534567899987
        9498921234578967345912345698654356965342367899876798989767899987698865678789998788990297645678999896
        8997945945689653239543456789743239877463478998985679975656789998987654235699869899459987657789998765
        7686899899789764398654678999899345998569989767564578954545689989599875123987654912348999767899979654
        2545798788999875498798789987988957987678997654353989543234569876421986013498763201567899878998765423
        1236789657899989569899899986767998998989987543212895432123698765310197124569654323468998999769876534
        0198996545678997689968909865456789989799898987323789543254789898725239295998767434569987987656998676
        1246789324568998798754219874367899875698769996534679654345679997654356989899896545678976898543459987
        2345994213579329999864346976788987654398657987785789876456789999765459878788987698789875795432346899
        3456943103589439899976487987899398966497546798999897989597899899976598765697898789895934989521235678
        6577893212347998799987898998989209897989434989321956899989999789987699654346889897954329878945656789
        7898954523456895688999999879878998789879219876532348998978987678999987543234678976543219867896867897
        8949765434577934567934698765467899654569998997543467987767896567899995432125698988655398988987898986
        9939876657689810128955987656356789543498766789676579876456789459929876321014567899789997699898939345
        9899989769798752379969876543245678932398754596987689996567992398910987432323458959899878598789320123
        8789999878987643467893985432134699210987643135898792987678931987934598893434567945921965498678921939
        4678999989598654688912396543245964329876532023789910199789549876899799764545678956899876324567939898
        3456789895429765678901987656457895435995432134567891249897698965788989879659789968998765412679898797
        4597998766219876789799999786578987559876543265678943459998987754557678988769899879879876543498776656
        6789109854101989895698999898689499678987665345789759598789876543234567999899901999768987656989654235
        7899298943212399923987997999995398989298887969899898999567987432123459877989219878957898769876543123
        8987987654434459439876786789889987899199999878978997898689989731036769765678998767942109879988654234
        9566798765645798998765345698778656798987878989769876998799876545645998954567896659956212989999986646
        4345899876756987899873234569656546897976967897654645789893987676789987943456964348897323499854598758
        3234998989967986789982126997435135456895456986543234678901998787899876542546893237789434999743219869
        9099767898999865689321019876521012367892356798632126778919879898998997621238964345678956898654309878
        8987652967989754578993998765432763778901256989321034567898765909987898730145695476789867959765412989
        7896543459876543469789879876743454678994349876532123456789973219876799421234689587891979039876567899
        6987699967985432379699867997854575789689467987944354569899894398765987632345898799910989123987679988
        5498987899876541234578956798965676793578989099895465678976789987654598943656789899321995434598989767
        6589876999997672345689545899877989892345893139799876889765698998873459658769898957949876565789397656
        7678965698976543456789323459988999943456789298689989997654567999764569879878997745698989876899298743
        9899894797897765689893312568999598764567899987578993298785979898975678989989986534987899987998999652
        4987643656798976793932101478965329998789999876459999109999898767899789694499997929876799999897898921
        3298432345789989892953212379654219899899876432367898919878798756998999532378999897655678998786987890
        5099321234877895989894324569795499789999987321458987899957654346897898921569998789743235699674876791
        6988430123456794578789456678989987678998765432567896999843210123456987892459976678954346986553285892
        7976651237897943445678967889978976587899876543678965698754942434567935793598765569899457996442154589
        8995432456789321234567978998767894356789997656789214569869893545678923989789874346778967984321023478
        9987659567895432345689989999846789267899898767892103489998789678989019878999995234569979876465434567
        2198968789976563456792199899656895458986789878943212567987659989392198965487893123479989987566545678
        9099879999998654567989299798767976569875897989654343459876548990129987654356989235689495698998676799
        8989999987769765679878987649878987679564456899868764567982137892498975431245678949794323499998787891
        7668899876545989899768999534989998789432345689999879779873256899987653210134567898999467987899898990
        5456789994323499998657898745699979895431956798989989898654568998798974321265678987998979886789979789
        4245790295934589876546789976789865976599897997878998939765978989659765432347889986987898765699865678
        2134891989895678996534578999898654987988789896767897659877899678942986543656798765976789654599654589
        3256789978789989987321367899987843499875699765656998798998936567890197665689897674765678963688912345
        9346789865678999865475456789996512569764598654546789987659123489921298778895999543124789754567901234
        8957898654567921976986667896989423498843699543234678976543234595432569989954398751012678965679892945
        7899987653459892988987778965978934987654985432124599897964545679843456798743297532154567896798789896
        6899999542356789899299989754567899999769876563465789789875657789654577897659349854365789949897679789
        5678987601298997789124596643454598789989997654567898679986768898765689999798998768456895435989567678
        4567998732349765691015975432123987667895329765678976588987878999876998898987649879768929759878454569
        3479876545458954589129896543239865456789439878899643456798989989989876787976534999878909998764343457
        2567987657567895678998789654497654345678945989998532145799098767898765476899745699989698999873232565
        3456798978678976889765678967986643234789656793987643234689198656987654365678956789995466987652101234
        4568999989889987996554779879865432123898767892198754365699987545976543234579987899954345699843232345
        5679987691998998965443456989976321034999878943598767896789876529865432123689298989875677899854345456
        6789996532467899654321269890195432146890989659679889919899965419876543254590129678986789998767957687
        7999986543456798767532345789987543256932399767899995323999876201998754365789234567897890129878968798
    """.trimIndent(),
    "day10" to """
    {[<<([{((((<[<[]{}><[]{}>]<<{}{}><[]<>>>><<([]<>)>[({}[])({}[])]>))([[({[]{}})<{{}{}}(())>][[{
    ({[{({[<<<<<<(()())>>{{([]{}){{}[]}}{<(){}><<>[]>}}>{(<[[][]]{<><>}><<{}<>>{<>{}}>)}>>>]<[{<{<{[(){}]<()()>
    [{[{{{[<({<((<()()>[{}()])({<>[]}{[]()}))>[{{[[]()]<{}()>}[<[]<>>{<>{}}]}{[<{}<>>{<>()}][(()<>)[
    {([<(<{{([[{(((){})[<>[]])<[[]{}][{}<>]>}{[{<>{}}]{<[]()><()[]>}}]])}({[<{(<()<>>)({{}()}[
    <[{({{(({<[{{(<>()){[]{}}}[{[]{}}]}<{{{}{}}<{}()>}{<<><>>({}())}>](<{{[]()}[{}[]]}((()<>>([]<>)
    ({[{[[[{{{{[<({}())[[]()]>({<><>}(<>()))]<((()())<{}<>>){{<><>}(()())}>}{<({[][]}<[]()>){{{}()}
    {((<<<<(([(((({}()))[[()()]{{}{}}])(<{{}}{()<>}>((<>[]){{}<>})))({<({}())[<>[]]>[{[]<>}]}[<[{}{}]<
    (({([{{{{([<{<{}[]>({}{})}[{<>{}>([]{})]>][(((()())<()[]>)(<(){}>[{}{}]))(({{}{}}({}()))({{}(
    {([<{{{{({{{([(){}])}[<<[]<>>([][])>({[]<>}{[]()})]}}{{[{(<>[]){(){}}}({[]()}{{}{}})]{{{{}()}([]<>)}}}{{
    (<<(<<{[<{((({[])<[]{}>){[[][]]}))[[<<<>{}>>][({{}()})([()[]]<[]<>>)]]}(({<[()()]{()[]}>([<>{
    ({<[({[<{[{(<<()[]>(<><>)>{([][]){()<>}})[(<(){}><{}[]>)(<[]{}>[<>[]])]}]<(<[(()[])[{}[]]]>{[[(){}]([]
    <<<{{<([([<(<<{}{}>[<>[]]>(<{}()>[[][]])){<<<>{}>([]())>(([]{}){[]})}><{{{{}[]}<()()>}(<{}<>>{[]<>}
    <[[{{<(<[{[{{({}[]){()()}}((()())<()<>>)}][[{(<>[])(<><>)}(<()[]>{{}<>})]]}[{<<<{}<>>><{{}<>}[{}{}]>><
    [<{([<[<<<<[({<>[]}{()}){[(){}]{()[]}}]><[[[[][]]{<><>}]]<<{()<>}{<>{}}>(<()()>[{}()])>>)<<{{<<>
    [([(({([({{<<{<><>}>({{}{}}{(){}}))<[<{}{}>(()<>)]<<[]>>>}}{({<<{}<>>{[]()}>{[{}[]]{()[]}}
    {{<<(({{[[<({{(){}}}[<<>{}>{[][]}])<{<{}<>><{}{}>}{(<><>)((){})}>>{[{(<>[])([]{})}{<{}[]>}]}]<<[<((){})(<
    <{(<<([<[{<{{{()[]}<<>{}>}(({}<>)(<>()))}{{((){})([]<>)}<{()<>}[<>[]]>}>{[<{{}<>}>(<<>[]>[{}
    <{({(<{<<{(([(<>[]){<><>}]({[]{}}(()[]))))([[{{}()}{{}<>}][[[]()]{()}]])}(<[<<[]()>(<>{})){{{}()}<<>()>}
    <<([{((<({<[<({}[])({}[])>]<{[[]<>]<()[]>}[<{}<>>(()<>)]>>[[<[<>()]<()>>{(<><>]{[]<>}}][{<()<>>{[]<>}}
    [{<[<(<[(<{<({{}{}}[{}[]])><{(()<>){[]()}}{{[]()}[()()]}>}>[[[<({}[])>{<()<>>[<><>>}]]])]>(<{<<[<(
    [[(<<<{{[[<<<[[]<>][[]<>]>{{<>{}}}><<{[][]}{()}>>>]]}[([{<<[{}{}]<{}<>>>>[(<()[]>{()()})]}]([[(<
    <<<[<<[<[{<(({{}{}}<[]{}>){[{}{}]{{}{}}}}{<(<><>)[{}{}]>{[(){}][()<>]}}><(<{<>{}}(<>{})>{<{}<
    [({<[<(((<({[[{}{}](()[])]<<[][]}>}<{{[]{}}([]())}{(<>())<{}[]>}>)>))({<[<{(<>{})[<><>]}(<(){}
    <(({[<[<{{{<[[<>{}]]{((){}){<>[]}}>(([{}<>][{}<>])[[[]()]<()()>])}(<[<[]{}>{<>{}}]><<(<>()){<>()}>([()[]]{<>(
    <<<([(<(<(<[<{<><>}<()[]>>(((){})((){}))]<({()[]}({}<>)){<[]<>><<>()>>>>[<[[<><>]([]<>)]>[(({}{})<()
    (([[(<{[([({[[{}()]{[]{}}][{{}<>}<{}<>>]})([[[<><>]<<>>]][([[][]])])][<<[[()<>]{<>{}}]<[{}()](()())>>{[(
    [{{<<{<({({[(<<><>><<>[]>){[[]{}](()())}][((<><>){<>[]})(({}<>){[]()})]}<(({[]()})(<[]()><{}[]>))(<
    {(<{<[<[<[<[[<()[]>(<>{})]{(<>{})<<><>>}]>[({[<><>]})[<<{}<>>{<>{}}>]]]<[[<{{}()}(<>[])>]]<{{<()[]
    {[{((<<<<[<{({()<>})}>{<(({}<>)){{()()}{{}{}}}>[<[{}()][<>()]>[[<>{}]{[]()}]]}]({{[<<>{}>(<>[])
    (([[<<({{{[<<([]{}){(){}}>[({}<>)<{}<>>])(({[][]}){{<>{}}[[]()]})]}}})([((((({[]()}[()<>]))
    <<<{<<[[{({([{()()}(())])<<{[]<>}<()[]>><<()[]>[{}<>]>>})}<[[{([<>[]>(()())){([]{})<()[]>}}<[<(){
    {<{{{<[([[{[<(<>)<<><>>>{<<>{}>({}[])}](({()<>}({}))[(<>[])])}]<{[[<{}>(<>[])]{[[][]][<>[]]]]{((<><>)[(){
    <({({<<(({([[[()[]]{<><>}]{[[]<>]}]{[<<><>>[(){}]]({()[]){{}{}})})}<{<[[[][]]<<>{}>](({}<>)(()<>))>
    {{{[(((<{{(<({{}[]})><([{}{}])<([][])[<>[]]>>)<{[(()<>)[<>[]]]{[{}[]]<[]()>}}>)}{<<[<<[]{}>[{
    [({<{(([<<([([[]()]<{}[]>)<{{}()}<<>[]>>]{[{{}}<[]>]{{[][]}(<>())}})[[{<[]{}>{()<>}}<(<>{})(<>{})>][
    {<(<{[{[{(((<{{}[]}{[]()}>)[{{<>[]}{<>[]}}((()[])<<>()>)]))(({[{<><>}<[]{}>][{[]()}]}<<{<>}[<>()]>(<[][]>{[]{
    {{{([[{<<[{[{[[]()]{{}{}}}([{}]{()[]})][<<[][]>(<>{})>]}]{[<<[<>())(<><>)>[{<>{}}{[]<>}]>]
    {[<{{<[[<[[(<([][]){()}>[{{}<>}[[]<>]])<((<><>){<>{}})([<>{}]{{}[]})>](<[{()<>}[<>{}]]>{<<[]
    [<(((({[{((<{<{}{}><(){}>}][<(()<>)<[]{}>>(<()[]>[{}{}])]){[[[[]()]([]<>)]][<(()[])<<><>>><{[]<>}>]}
    ({(<<(({{[{<<{{}()}{()<>}>({[][]}{<>{}})>}]([{{{[]{}}<{}()>}[(()[])({}())]><{[{}<>]<()<>>}[
    ({(<<[({({<[<[()()]>{({}()){{}{}}}]>[<{(()<>)<{}{}>}{<{}{}>[<>[]]}]((<[]<>>)[[[]()]<<>[]>])]})[[[[[[
    {<(<<[[[<{({{{[][]}{()}}[{{}<>}{[]<>}]}<([[]{}]{[]()})[(()<>)([][])]>)}>]]]>>[<{[<{[<[([{}{}]([]<>))[[
    {<({{<{<(<[{[[{}()](<>{})]<{<>()}{<>[]}>}{{[{}{}]}<<{}{}>({}[])>}]({[{()()}[()[]]]}[<{()()}{{}{}}>[<()[]
    {[[{(([({([([{<>()}[<>{}]])]<<[((){})({}<>)]><[[[]<>](<>[])][<()>[[]()]]>>)})])<[{<[<<<[[]]>{<<><
    {<[[<[<<{[{<({[][]}[(){}]){<()<>>[{}<>]}><([[]{}][()[]])[<()()><()[]>]>}({[{[][]}][[{}{}]]}[[{(){}}<<>[]>
    ({(<{[[{<<<(([{}()]<(){}>)[[{}<>]<<>[]>]){<{[]<>}(()<>)>}><{({[][]}(())){<()()>(<><>)}}>>([<([{}[]][<>()
    <{<(([(<({[<{((){})<{}()>}[[[]<>]{[]()}]>({({}[])<(){}>})]{[{[()]{{}[]}}<[{}()][[]{}]>]}})>)[<<([({<
    [(({{{(<{{{[<<[]()><[]<>>>{((){})}]}{{{<()<>><[][]>}}}}{[<(<[]<>>[{}[]])[{()()]]><[([]())[{}[]]]({{}[]}(()[
    [[(<<<{{<{<<([<>()]{{}{}})[[<><>][<>[]]]>>[[([<>[]][[]{}])({[]{}})]<[<{}{}>[()<>]]>]}{(<[{{}[]}{
    {{{(<[(<{(<[{{<>()}{[]<>}}]>)<[{([[]()]<{}<>>)[{<><>}([]<>)])(<{()}(()<>)>([{}<>](<>[])))]<[<<<>><<><>
    <[[(([(<<[{[<<()[]><<>()>>{[{}[]][()[]]}]{[<()[]>{()<>}](<()()><{}[]>)}}{({[[]](()<>]}({[][
    <[<{{<([<{<{[{[]}({}<>)][(<>())]}<<[()[]](()[])>{<{}()>[()[]]}>>(<{((){})[{}()]}>((((){})((){
    ([<{<{[<[[<<{(<>[])}[<<>[]>{[][]}]>>]<({<(()())([]())>(({}<>)<[]()>)}{({(){}}([]{}))[{<><>}<<><
    {{(([({({{<(({{}()}{[]{}})<([]{})>)>[[[[{}<>]](((){})[()<>])][(({}{})({}[]))<[[][]]<<>{}>>]]}))}){{<
    [{{<{{<<{({{<[{}[]][[]()]>[<<><>><{}{}>]}{[<()[]><[][]>]({{}()}(<>{}))}}<<([<><>][[]<>]){(<>}(<>())}
    {[<({<[[[[{<{<<>{}><<><>>}{[<><>]({}<>)}>((((){})[{}<>])[{()<>}{{}[]}])}({(<[]()><{}()>)}{(
    [((((({{<[{({[{}[]]{{}()}}{(<>())[[]<>]})}(<{<()[]><[]{}>}>{<[[]()]<(){}>><{[]}{[][]}>})][<{((
    {[(((([[[([{<{()[]}(()[])>((()<>)[<><>])}]([([{}()][[]()])[{{}<>}{(){}}]]({({}{})<{}{}>}<{{}[]}<{}<>>>)
    [(<([{{[(<({{[<>]<()<>>}{[[]{}][[]{}]}}]>)]}}<{(([[{({[]()}({}[]))<[()<>]{(){}}>}]{({(<>[]
    (<([([<([<{{{{<><>}<()()>}{({}()]<[]<>>}}}>]([({<((){}){{}[]}>}([{()()}{<>{}}]<{[]<>}{(){}}>)){{[<[](
    [{<({{([(<[(<{{}()}{<>()}>((<>())<<>()>))<<[{}[]]><({}())[<><>]>>]<{{[{}{}]{[]()}}<(()<>}<()[]>>}<<({}()
    [<<(([<{<{[[{{[]<>}{{}()}}<[<>()]<<><>>>]({({}())(())}([{}{}]<{}()>))]{<((<><>){<><>}){(()())}>}}({{([
    {{{([{{[<{(<{<<>{}><<>()>}<{()<>}{<>[]}>>)[[<[<>{}]<{}{}>><{()[]}>][(({}())([]{}))[[{}[]][{}()>]]]}[
    ({<(({<<(<<[{<<>{}>{<><>}}((())<{}[]>)]><{((<>{})<<>()>)}>))>(<[<[{[<>{}][[]()]}[({}{}){<>()
    [{{<[<<({([{{{()[]}(<><>)}([<><>]<<><>>)}[({<>{}}((){}))]][[(<<>{}>[{}()])<([]())([]()>>]{
    ({([<[((([{([<()()>[()<>]])(<{[][]}<{}[]>><[()<>]{<>[]}>)}({[{<>{}}{[]{}}][([][])]}[{{<><>}}<[{}{
    {[{(<[[[{<([({{}()}(<>[]))<[[]<>][[]<>]>][<(<><>)<<>{}>><[[]{}]{<>{}}>])(([<[][]>{{}()}]<{
    {<<(<<{<<([{[<{}[]><{}[]>]{{{}{}}{[]()}}}(<[[]{}][[]<>]><[()()]>)]){(([(<><>)([][])](<{}()>)){([<>{}](<>
    (([[{{[[{{{<{{<>[]}{()[]}}(<()<>})>({[[]()]{[]()}}<(<>())>)}[[([{}](()[]))<<<>{}>{<>{}}>]{{({}<>
    [<([(<<{({<[<[(){}]{(){}}><<{}[]>(<>())>]>({([<><>]({}<>)){([])[{}[]]}}[[<[]><{}>]])}){<{<<{[]<>}[{}[]]>>}{((
    ((<<({({({[[[<{}[]>{[][]}]<{[][]}[<>{}]>]{[([]{}><[]{}>]}]((<{()[]}[<>[]]>{(<>[]){()<>}}))}[[[
    (((<<{{([{{(([[]<>]<[][]>)({[]{}}[()<>]))[<({}{})<[]{}>>{{{}()}[()<>)}]}}[{<{<(){}>[()]}{(<>{}){()[]}}>
    ([([<<<[[[[<{{[]()}}[[<>()][[]()]]>{({{}{}}<[]()>)}]]][({([({}{})[{}<>]])[{<[]>{()()}}{(()[])
    {[<(({((<{([{(<>[])}]{{{<>}[[][]]}((())<[]{}>)})}>[{([[<{}<>>([]{})]))[{<{{}<>}[()[]]><{[][]}
    <[[<{[<[{{{[<(()())}([[][]]<<>{}>)]{<{[]}<{}[]>><[{}{}](<>{})>}}}}({(<(([]()){[]()})><{({}<
    [(({({[(<({(((()[])))})>[[{(([[]()](()<>)){{{}<>}<{}()>}){[<(){}><[]()>]<({}<>)[()()>>}}[[<<()()>{()[]}>
    {<[({([[(({[{[<>{}]{<>{}}}{[<>()]}][<[{}[]]<()<>>>{<{}()><{}{}>})}(<{[<><>][<><>]}>([(<>{})<{}()>
    [{<{<{{([[[[[([])({})](([]()){<>{}})]<[{{}{}}[{}{}]][<()()>(<>{})]>]]]([([<[{}[]]<()>>[({}[])(<>())]](
    <(<{({{((<<[({[][]}[<><>])]><<{[{}]<[]<>>}[<[]<>>]>([{{}[]}({}<>)][[[][]]{[]()}])>>((([{(){}}[(){}]])({<()<>
    <{(<<(<({[<{([{}]{[]{}})[<()[]><{}[]>]}>(([({}[])]<(()<>)[()()]>)<[{[]()}<<>()>](<(){}>[{}{}])>)]}<{({[{[]<>}
    [(({([({[<[{({[][]}<()()>)<(<>{})[{}()]>}{<{{}<>}<{}[]>>([<>()](<>))}]>[[((<[]>[[]<>]){({}())((){})})][([[(
    ({[[(<<{{{<[[[()<>]{{}<>}]{<()[]>({}())}]<[[{}[]]{<>{}}][[<>{}]{[][]}]>>}}}]>[<{{<{[[<<>[]>({}{
    ((<[{[{{[<<{<{{}<>}<()<>>>[<{}<>>(()())]}(<<{}()><[]()>>(<{}{}>{(){}}))>([({<><>}<{}()))[{[
    ([{{[{[{[(([[(()[])[<><>]](<{}()>([]<>))]))(({[{()}]<(<>[]){()<>]>}[({()[]}[{}()])]))]}][<(<{<<[[]<>]<(){}
    {{<{([{<[([<{(<>[])<{}{}>}[{(){}}(<>())]>[(<{}<>>[{}<>])((<><>)[()[]])]]<(({{}{}}<{}[]>)<[{}
    {{{{({<[{({{[[<>{}][[][]]]<<()<>>{[]}>}})]]>}){[<[<({((<{}[]>({}()))((()<>)))((<[]<>>))})>[([{[<{}()>(<>{})]<
    {(((((({((([{((){})([]<>)}(<{}{}>(<>()))]<<{<>[]}<<>()>>>){{<([]())[{}{}]>[(()())<(){}>]}<<{{
    {[[{<{(([{[[{(()[]){[][]}}(<()<>){{}()})]]}<(<([(){}])[[{}[]]{<>()}]>){{<[[]()]>(([]<>)[[]<>])}{(<{}<>>[(){}
    <<[<{<[[({(<<(()()){{}{}}>>[{<(){}>({}())}{<{}()>[[]<>]}])[{{({}<>)<<>()>}<{{}()}<{}<>>>}[{[{}{}]
    ([([{{[[([<[[<<>{}>[[]()]]{[[]<>]<[]<>>}]({[<><>][<>{}]}{[[]()]{<><>}})}<(<<<>[]>{{}()}>{<()[]>
    [[[[([<<{[{({[{}<>][{}<>]}([()[]]<[][]>))(<([])>)}{{({<><>}[{}()])(<<>()><[]()>)}{((<>[])<
    [(<[([<<({[<<({}[])(()[])><{<>()}{{}<>}>>(<{[]<>}{{}[]}>{[()()]<[][]>})][[{<{}[]>(()[]>}<<{}[]
    [{[<<({([{<[({[][]})]>{({{()<>}{{}[]}}[(<><>){[][]}])}>]<[<<<<[]()>(()[])>{[[]()]([]<>)}>>(<
    <[(({<[({<[{{{()()}<<>[]}}({<>[]}<[]<>>)}]{[<<[]()><()()>>[({}<>){[]{}}]][<<()()>[<>]>{{()<>}}]}>})]>}))({
""".trimIndent(),
    "day11" to """
        6636827465
        6774248431
        4227386366
        7447452613
        6223122545
        2814388766
        6615551144
        4836235836
        5334783256
        4128344843
    """.trimIndent(),
    "day12" to """
        nu-start
        rt-start
        db-qh
        PE-end
        sl-rt
        qh-end
        ZH-rt
        nu-rt
        PE-db
        db-sl
        nu-ZH
        nu-qh
        PE-qh
        ZH-db
        ne-end
        ne-ZH
        QG-db
        qh-sl
        ZH-qh
        start-ZH
        nu-PE
        uf-db
        ne-sl
    """.trimIndent(),
    "day13" to """
        587,795
        930,267
        306,240
        1052,763
        177,826
        681,841
        1062,413
        840,878
        232,271
        965,165
        319,612
        1027,215
        524,707
        939,887
        1210,740
        284,126
        579,38
        1079,826
        509,73
        542,381
        1163,560
        1208,775
        83,306
        177,266
        348,297
        1001,729
        621,162
        1081,92
        557,802
        1039,87
        1290,824
        1096,513
        1034,711
        446,105
        955,523
        371,7
        1039,759
        246,556
        321,143
        1277,747
        768,157
        644,382
        895,471
        1285,252
        751,87
        237,30
        1057,453
        1119,747
        1086,551
        940,514
        279,345
        1064,879
        1061,32
        833,138
        637,541
        900,207
        145,709
        50,437
        870,466
        604,367
        164,773
        688,658
        698,156
        477,714
        759,721
        1233,354
        808,382
        669,121
        1034,576
        694,208
        1210,224
        67,756
        1292,770
        1124,371
        1185,455
        1016,549
        957,226
        641,87
        559,795
        229,840
        446,287
        706,576
        542,466
        753,502
        1173,390
        95,266
        1081,840
        271,87
        858,821
        1067,418
        408,879
        494,684
        525,291
        852,411
        826,313
        626,502
        918,808
        259,714
        1133,266
        567,79
        1272,354
        74,756
        125,7
        1026,380
        812,509
        465,390
        1243,756
        242,609
        1251,665
        264,796
        945,82
        25,535
        378,823
        1300,512
        559,68
        484,313
        298,52
        885,129
        1016,345
        140,819
        750,467
        485,805
        1171,173
        90,42
        191,371
        38,514
        637,93
        858,799
        997,569
        1017,162
        939,455
        999,876
        909,444
        557,392
        751,387
        408,422
        378,631
        1017,284
        249,204
        405,204
        25,617
        438,751
        1087,497
        343,218
        903,614
        1216,686
        826,562
        1078,175
        139,721
        919,732
        765,35
        977,312
        999,533
        1036,367
        284,799
        990,700
        698,14
        1064,472
        689,823
        184,645
        102,551
        567,815
        547,359
        1034,479
        229,92
        715,609
        805,180
        113,644
        721,502
        1063,112
        460,464
        1255,477
        560,203
        758,327
        718,651
        1304,131
        1036,11
        698,351
        435,278
        571,54
        662,357
        885,502
        253,892
        909,854
        1078,7
        241,606
        724,539
        181,185
        1243,490
        284,516
        644,512
        33,610
        659,197
        346,572
        263,162
        18,236
        170,497
        94,887
        147,442
        380,267
        698,238
        797,285
        964,740
        239,471
        94,686
        1066,687
        547,87
        898,285
        1061,862
        1198,466
        999,894
        49,411
        1062,481
        840,206
        1064,422
        430,551
        50,661
        1031,345
        33,215
        196,35
        957,568
        669,404
        430,631
        147,560
        393,819
        407,280
        132,793
        115,35
        274,367
        636,434
        1052,656
        90,852
        845,60
        83,364
        1101,218
        266,439
        425,129
        759,173
        38,380
        49,467
        736,422
        1163,442
        361,162
        276,711
        805,308
        544,591
        602,194
        1083,801
        1091,278
        636,770
        1261,336
        97,18
        674,770
        847,147
        900,332
        238,539
        766,476
        1046,89
        908,786
        557,502
        864,329
        1046,691
        179,697
        48,383
        751,196
        666,834
        72,490
        689,299
        674,231
        539,859
        605,558
        708,866
        299,299
        858,73
        1197,644
        684,842
        682,175
        376,551
        1258,703
        214,9
        733,526
        1295,309
        452,768
        554,446
        1293,386
        693,887
        189,504
        699,455
        201,455
        403,486
        920,796
        1091,168
        626,842
        684,54
        328,233
        663,730
        237,854
        231,703
        1063,784
        920,0
        699,614
        1144,131
        309,165
        410,780
        1039,554
        266,485
        365,119
        769,196
        1022,1
        208,789
        1215,266
        361,757
        689,75
        1305,413
        226,516
        1113,743
        636,796
        900,543
        571,588
        579,856
        1304,2
        1161,143
        319,282
        902,463
        1108,73
        416,84
        513,285
        97,17
        1136,270
        1220,490
        417,406
        1096,428
        1044,455
        801,821
        151,595
        965,505
        120,655
        875,168
        838,187
        346,154
        1250,343
        1215,826
        64,86
        865,116
        994,158
        473,165
        141,285
        264,89
        1104,544
        1272,211
        567,472
        592,719
        1061,480
        1109,439
        888,243
        739,54
        1129,185
        694,540
        626,54
        693,439
        470,206
        258,432
        391,732
        166,539
        498,133
        82,463
        1258,143
        715,161
        1277,732
        743,815
        72,861
        2,131
        1227,306
        1034,599
        671,876
        87,24
        991,707
        166,131
        522,206
        264,546
        1001,521
        917,523
        517,837
        800,635
        704,717
        219,535
        801,73
        715,665
        1235,883
        343,0
        479,147
        52,703
        567,422
        231,308
        415,471
        1078,427
        356,842
        731,11
        768,381
        577,368
        865,218
        1126,231
        945,119
        587,11
        1227,364
        74,138
        586,847
        334,642
        1185,439
        616,290
        1243,138
        1208,844
        880,263
        1242,439
        1277,679
        383,807
        1213,18
        905,592
        1113,757
        683,187
        830,494
        309,93
        192,26
        706,16
        629,535
        547,807
        934,343
        607,673
        944,235
        746,490
        497,766
        1063,614
        38,113
        0,661
        1064,662
        288,669
        574,562
        1046,805
        689,519
        1250,103
        611,439
        390,348
        552,791
        755,613
        888,875
        1268,514
        1073,30
        977,560
        38,561
        18,7
        1034,556
        967,632
        1237,749
        309,521
        962,597
        920,348
        85,466
        865,564
        1260,457
        758,50
        1280,576
        1046,98
        1034,295
        950,549
        73,2
        545,859
        837,389
        60,791
        745,226
        587,180
        60,343
        365,775
        902,472
        875,127
        559,87
        95,807
        141,509
        999,890
        1067,476
        893,304
        656,681
        13,404
        745,369
        64,808
        430,263
        219,168
        939,7
        724,47
        467,61
        95,826
        1071,423
        914,579
        756,154
        621,183
        266,7
        507,782
        733,354
        276,338
        48,717
        487,652
        319,264
        1272,540
        348,533
        1297,82
        551,173
        751,835
        196,483
        858,95
        100,313
        1119,579
        423,835
        818,121
        320,357
        580,586
        1198,94
        902,422
        694,333
        604,599
        410,207
        37,364
        746,404
        734,817
        1180,187
        1225,428
        982,380
        299,595
        1216,467
        1285,642
        885,392
        684,392
        112,878
        166,355
        967,710
        957,277
        599,359
        197,757
        470,361
        1066,780
        718,670
        1235,491
        246,662
        1059,408
        664,357
        735,700
        1034,31
        940,351
        716,73
        621,732
        858,156
        1144,539
        446,271
        341,878
        833,502
        686,634
        440,542
        488,579
        735,252
        1255,417
        935,549
        933,336
        997,430
        989,751
        669,542
        271,554
        18,98
        577,32
        356,536
        887,835
        962,688
        1036,627
        38,540
        1099,859
        15,466
        595,665
        75,446
        724,91
        475,25
        572,431
        605,467
        25,252
        666,60
        1215,59
        736,332
        1046,546
        174,606
        1173,504
        32,259
        1011,299
        637,205
        202,745
        523,19
        1200,303
        284,380
        33,162
        693,7
        706,437
        1118,500
        276,631
        559,387
        470,645
        1099,35
        1293,353
        1262,791
        416,450
        999,18
        1238,490
        587,782
        612,238
        263,732
        875,87
        440,437
        731,311
        756,446
        751,68
        557,278
        1136,830
        1064,214
        1061,690
        202,149
        984,661
        648,357
        1001,165
        125,455
        1001,93
        554,313
        1230,472
        845,834
        311,361
        689,610
        283,455
        181,505
        249,862
        95,180
        1215,852
        1027,7
        569,18
        662,131
        887,628
        551,721
        182,488
        311,302
        621,375
        246,463
        1118,394
        423,628
        10,508
        100,581
        652,579
        246,15
        864,271
        1084,378
        112,16
        689,711
        751,99
        189,642
        1009,326
        191,579
        954,392
        812,761
        232,7
        922,485
        671,38
        560,691
        805,514
        1044,439
        253,453
        124,785
        253,702
        191,763
        59,161
        283,679
        768,16
        266,821
        403,408
        346,740
        604,457
        191,131
        447,663
        976,642
        850,464
        853,603
        1073,854
        80,562
        244,207
        326,233
        621,711
        530,745
        758,485
        763,359
        239,696
        785,603
        223,497
        177,290
        930,303
        440,430
        294,549
        1165,877
        1297,404
        835,679
        219,278
        156,385
        853,743
        982,233
        1102,341
        43,439
        694,290
        1307,473
        1081,392
        229,54
        661,334
        907,486
        1186,540
        661,560
        939,280
        252,672
        214,162
        708,194
        1002,175
        1063,280
        298,502
        1071,696
        1140,397
        102,396
        808,158
        407,782
        1136,606
        534,543
        170,397
        184,663
        232,427
        853,599
        893,864
        1051,714
        90,490
        999,4
        25,502
        490,667
        577,592
        67,138
        1133,826
        87,359
        177,806
        765,859
        1133,806
        130,187
        1140,497
        1108,745
        289,231
        20,16
        1113,137
        422,243
        80,472
        1176,618
        864,105
        945,812
        490,227
        1,560
        736,562
        266,551
        422,651
        38,686
        888,651
        107,87
        510,572
        1033,483
        1290,518
        33,519
        261,819
        1279,467
        452,156
        1119,131
        18,434
        232,175
        13,352
        15,224
        232,691
        422,208
        1198,800
        962,533
        1292,460
        1044,821
        390,796
        492,219
        177,88
        1198,513
        1057,444
        77,144
        739,784
        1128,406
        612,156
        606,717
        569,876
        617,7
        780,574
        991,264
        544,303
        38,290
        915,547
        308,175
        505,751
        244,780
        639,38
        1126,249
        1046,446
        991,282
        651,473
        110,418
        182,406
        1200,418
        840,430
        930,527
        1026,462
        48,791
        572,15
        803,452
        1295,466
        182,712
        87,311
        1285,617
        396,763
        629,54
        822,579
        763,127
        812,133
        863,663
        52,303
        1250,73
        1073,864
        716,567
        838,707
        214,885
        797,385
        403,535
        370,516
        1220,42
        990,418
        704,177
        969,325
        699,7
        659,869
        1278,259
        616,208
        370,351
        460,430
        962,297
        758,844
        1293,613
        77,316
        636,231
        554,670
        1268,156
        80,332
        756,448
        67,404
        73,749
        283,215
        246,879
        1012,502
        559,99
        249,32
        79,252
        1033,336
        1267,166
        808,64
        1186,785
        1228,463
        219,359
        288,652
        626,840
        883,93
        365,231
        837,165
        706,599
        1129,505
        1292,98
        999,184
        492,675
        715,49
        830,624
        320,418
        1131,334
        820,331
        179,334
        932,631
        147,452
        1178,793
        800,707
        1081,205
        1178,814
        571,840
        87,870
        276,823
        1,334
        232,887
        604,878
        253,889
        1064,108
        840,533
        542,878
        609,218
        1309,334
        55,502
        422,686
        739,110
        17,613
        743,760
        1215,135
        371,280
        858,126
        786,187
        43,166
        887,266
        1021,775
        85,428
        232,686
        1293,281
        258,686
        177,628
        559,196
        1119,371
        485,312
        845,390
        715,733
        572,463
        95,628
        197,585
        494,131
        309,613
        405,32
        13,490
        214,605
        1078,271
        1079,255
        817,889
        612,656
        237,406
        1186,428
        80,422
        651,25
        465,642
        940,516
        793,57
        1078,238
        209,330
        348,688
        232,875
        1034,71
        83,82
        1203,731
        151,747
        48,551
        17,508
        15,551
        1192,287
        375,345
        900,351
        552,485
        1208,103
        189,281

        fold along x=655
        fold along y=447
        fold along x=327
        fold along y=223
        fold along x=163
        fold along y=111
        fold along x=81
        fold along y=55
        fold along x=40
        fold along y=27
        fold along y=13
        fold along y=6
    """.trimIndent(),
    "day14" to """
        BNSOSBBKPCSCPKPOPNNK

        HH -> N
        CO -> F
        BC -> O
        HN -> V
        SV -> S
        FS -> F
        CV -> F
        KN -> F
        OP -> H
        VN -> P
        PF -> P
        HP -> H
        FK -> K
        BS -> F
        FP -> H
        FN -> V
        VV -> O
        PS -> S
        SK -> N
        FF -> K
        PK -> V
        OF -> N
        VP -> K
        KB -> H
        OV -> B
        CH -> F
        SF -> F
        NH -> O
        NC -> N
        SP -> N
        NN -> F
        OK -> S
        BB -> S
        NK -> S
        FH -> P
        FC -> S
        OB -> P
        VS -> P
        BF -> S
        HC -> V
        CK -> O
        NP -> K
        KV -> S
        OS -> V
        CF -> V
        FB -> C
        HO -> S
        BV -> V
        KS -> C
        HB -> S
        SO -> N
        PH -> C
        PN -> F
        OC -> F
        KO -> F
        VF -> V
        CS -> O
        VK -> O
        FV -> N
        OO -> K
        NS -> S
        KK -> C
        FO -> S
        PV -> S
        CN -> O
        VC -> P
        SS -> C
        PO -> P
        BN -> N
        PB -> N
        PC -> H
        SH -> K
        BH -> F
        HK -> O
        VB -> P
        NV -> O
        NB -> C
        CP -> H
        NO -> K
        PP -> N
        CC -> S
        CB -> K
        VH -> H
        SC -> C
        KC -> N
        SB -> B
        BP -> P
        KP -> K
        SN -> H
        KF -> K
        KH -> B
        HV -> V
        HS -> K
        NF -> B
        ON -> H
        BO -> P
        VO -> K
        OH -> C
        HF -> O
        BK -> H
    """.trimIndent(),
    "day15" to """
            1839699672891217819841135688732885247928872185751688897193694689841978768898988716768379159626957769
            2192965275394162996999895995785387868994994237879517119896718684447799929129197684778981358614968999
            4927383925892593199621279935962919798987897179929239949761461388699843711988814644869741378719173483
            8477219799114299945911696955298929578477221885481596518899422291833711899891919649968262899912978495
            2817819315696246315613761896884311877197776956918937431899919989993647979687738979982159319969999578
            3921996199497877997385372981891389397955538984319996184818154286982971629971788627117188715658844389
            5696289699499785672395936877891787618217139792484279891873848972886677869648279849941981792717281246
            7129788971966517941968791978867682499789996196627769926196599536999511916296719695918118513815976349
            1381929498954922995835988798893531695699987868681872499899992886217921974289119956826999218123897213
            3549913197832174177998998971454816159459558141919981479795995936196572194594817927979929738759867894
            9611896297924264799116365948992848469239159938929996899929777915699853979918582424799771491998912979
            8896967853332494975677896997672171389899888116469938368961869677885966598315829996195872879574939986
            9626189338738929979981447485199177591878259393971396598363117898998298987485689289496613119256439899
            2581156691693933978289919429717851359711529572527892887523428997945121976943613884281932582667716991
            4857749547398635351971151567993497882693289669919191261189467927291485822988998937261939351941999294
            9979549966583584768911191197888394588359811168955197992344559871917368365693995819623578492892117965
            7917619899893818421929319482596212795441911115499449598578141584124868349823956298792992725966777516
            2697478689842617698991751821916919179878699969168944195711127939671889181979689787352786387785699521
            5628861417276569893927949572431986589991615467936891731193459939419453649317149915959852176399973589
            8598569847167978841129794826999662765259922655959764477818121949594195739723999227684728927989339119
            4182959939882942967265114769585986179935694989457955516994462933849599811279155619129418458797995622
            1279595759999171395932712699994819257845174915367819726796291129129599651846687999276797388996427778
            9296982979291838998696697779899683138299888951939184269574988996713891298254594788689192581761749199
            7898529747921567799259614785195711298722899995563953389729854138375923998574978337182583278948847719
            5759446778338982811699959831289965877558538939879994889218461796989951784178978799849671789158886897
            7415595795257999869637399856813943916821952389724896878395719969295689189795989165918718449122987199
            5277453841999959187658984456999172829279388688718797962891581393742197336462888178979189352184979949
            5999981119718823799197782992389545832933319635165527477618193669683395899625211846978654499226399797
            7322199138398291243793993699835559699138756292792984578118155756991829199928884365469898457139328686
            9775914799619642898291963375991191628695225917979692891671897729899818377814699992599988648899942791
            8948987951991949582694791597541537194826936836198728557871776596876483555677964781688292387914326753
            9213756988419798972995796183793994111132948871779176579959128321249279918195586594789188299644117867
            9988433162977618915986998165315738891899136974228444679817784196285989196833829498599242575681145814
            9791592618881314992187289981991739796732996331271778166199345941317931346471829257789892157381499863
            9499419789996969573941937888782528949789684318198482997994745339176219598921458631299916799778884817
            2277686127357627956911728981267798224881752966899798581725971189337959769999869229925117426917625199
            1999699745289281249967797888799871999146947533529539989233621472949571967151789691253813551194618681
            9238952871919977668545861691928249849927594589174716439899152978859299629711884871697927912461472994
            5693999942961769969718338296515799968282716963999984993888892242696899996795925781241445296217627178
            8792428798344969728695853837168378997699984979131949839165699783857198193498498736992586279899821412
            1341919577154536468492199645582852198865993428962991914182893729629689781488953997938479967399146778
            9898949742669498817836927188698938227948751963788368618567158392937389662143188419869976976925878791
            3863117255166859917114949882975512671793669888162298313911399221119869882291829638194582789793418289
            9596288958978715572748999386778128882784799162918942799919631858671496234669281962991995233992749952
            6997779116995311359832955891964599794272117296498929189987697599197694888589441578989117831993918718
            7219931668741539419881791921297299193759485378719199131594468581498823119993138431698117329151685993
            9991785795956519898724215929388399519198169893772269522781911299828828719913593119159389994321995377
            1589752819788998863984993442776834999519338818989989495699398699154669871729719681765719291527179338
            8677957657692461442138991259699913791937168914981686493768195739178827997898947526914998694258679922
            4849917555929118828918968891876276887639893972978948923811398959691888936961558869619293798468841985
            7591968777781688486657287185989899191971952213756197996811597477672998399939675983945724719698884599
            6899888699478362939992989749759999712997799584666749322821376782881741755288569217947936871182976848
            1735199974829194482981896378227633177972319179949967756755521733779617177179359212319773425697866997
            3817786989897897994439614784549395537969388789791413599197191838485991439746959838499918989897373913
            2719191794268958189883498885198299315552993614929981815887488991913575719125897648119198699694955658
            8611179529935254458198327845291391389724392969973839397898842294993199375485515291996883222899689991
            8398823979899558976479278944596967387155551118966181677313118773839682992993917222897269187917874592
            2487941895917465999597918394945859695258999448375194788482811987238831113585754399697111268658668889
            3165197318894179819982145518884339855547283986969388189465598238955334846398599126862329692958664948
            3214872888941835551618295749815936447379164982127158756962916255229169362959926278166736999319912819
            4868124598799489351953998942791869914281926889999798529189893579219896982989159757889999382997456943
            8672278997992939676945791326494928981411855996524976679577219115682448991379182496989176176892955997
            8111891278678128919594646897157998782266751249261774371581459924956699896849994366954445434474781578
            8249786717337987789952959798892829877893399167892331184917262668179734459799489311239757879516294465
            9852771579612566998897674385811911818948564954991939885767921923981188625619181137998899948258572979
            8612233978552678659564598998421227845993777696273794576957923128579776275997368719911972768685865998
            6396851886891895296969881984429869249152211913969992437536151582791889978657684752357197472254994988
            3695799988814791969715781692449771636664975681917717875419692871833998897968137988438688312531982994
            9799816699679961493172819538998439929815883179937897936513288991893517969173952292367191736769497839
            5487189519289987929697958195599289891998858434678412995965929931628861499363469341795747195949193877
            6739149655994322287114451851696968915518886882179199899799198896298439491168965677946959585791922991
            7875868799175446444492125897984182249898398898198398899624194998968992755965526468819199935461896522
            9923777354998999989529234613945179216797888819972843544155815189644616839788974886941699326421549841
            9837752658678939554498959998869286695381999792678588829498726116797976874754432625959997899964961117
            4717998192119995873889929597352494574179889139457687881597984631978122179999847756728256698191958875
            1147792391878293969869927531466959648488946866744187478828598431946397869339996555913936372485598319
            1729458969812991729853868291992796927589977318749959991121659524578882749876653191899888916983993938
            5422297182981548376898998215962759232393984336464957894919858956974254531489959719997972873997937692
            3199336788797284719839921695495517272991434711495852899631691933861734818967428219448778989968921925
            3889221762999735892919139864989364219919169731157979281459579889482418486891595961949493447544517193
            9355469915996928586767975877917345931266994986698979919796174258151191169995547961865818119648997268
            8692788299949696166916297743985789626882949981798279977178688415833151985953312384733396838865784999
            9316745159996983928757926544879899715977394193949854489942766891919251799289766868549937433785889914
            9937295953918786961694665799391691269467721681791691569576999292476928869517976198997996715957887973
            8999699441572871874518614611114944189659589819985946914755696873491986611733664565758846724456999784
            9116981466999567259618817461965968995197895178699925761889819968695815843195626222889663978266638312
            7496777622968979738689969982199115142999716676411153547457678983372187937369468776931919982541562956
            9711218859281461218983199251368361768986916826888997785964293959998789268113318238149695966879999797
            6396519733444912825295488769115364759158246882639423329569891881919222497434924659991959287999748365
            3591978594781812551657193838674165375218922829899666689958499971985994795445889338599149989672551988
            9162686192777939527739918151948819936589514481514772297919921699455894972279155835299769254289449518
            8597167796744489859182666617666191913229499513732992789613684219819139687799191187969614489978432719
            8725996361192474996782398367199589936642142186985992467978955321715239979857188349439928391129199188
            9914982598239713756772933962271117962459258999596911828443669896324963789594196632987171698531997995
            9292787327339152989498298698897892123859477919765998144995958191875619248199229793829439922998911971
            7168891919118159796997743319856499417567997747972686299988494498485789859333169934997951999978853556
            8961965298269611964877937134849653928898265888386915993799796699279138978121546916964914764987918881
            9879861126679363918974986484928288831691848721349296732824948923888932696139779188699788579981817411
            9537881896773448882931789856999511751189985796662931657323198877792797393599726994959993148693994398
            8933595393747579247498891129685978923196761941162347892984592262912838443199289579117219188537241993
    """.trimIndent(),
    "day16" to "220D4B80491FE6FBDCDA61F23F1D9B763004A7C128012F9DA88CE27B000B30F4804D49CD515380352100763DC5E8EC000844338B10B667A1E60094B7BE8D600ACE774DF39DD364979F67A9AC0D1802B2A41401354F6BF1DC0627B15EC5CCC01694F5BABFC00964E93C95CF080263F0046741A740A76B704300824926693274BE7CC880267D00464852484A5F74520005D65A1EAD2334A700BA4EA41256E4BBBD8DC0999FC3A97286C20164B4FF14A93FD2947494E683E752E49B2737DF7C4080181973496509A5B9A8D37B7C300434016920D9EAEF16AEC0A4AB7DF5B1C01C933B9AAF19E1818027A00A80021F1FA0E43400043E174638572B984B066401D3E802735A4A9ECE371789685AB3E0E800725333EFFBB4B8D131A9F39ED413A1720058F339EE32052D48EC4E5EC3A6006CC2B4BE6FF3F40017A0E4D522226009CA676A7600980021F1921446700042A23C368B713CC015E007324A38DF30BB30533D001200F3E7AC33A00A4F73149558E7B98A4AACC402660803D1EA1045C1006E2CC668EC200F4568A5104802B7D004A53819327531FE607E118803B260F371D02CAEA3486050004EE3006A1E463858600F46D8531E08010987B1BE251002013445345C600B4F67617400D14F61867B39AA38018F8C05E430163C6004980126005B801CC0417080106005000CB4002D7A801AA0062007BC0019608018A004A002B880057CEF5604016827238DFDCC8048B9AF135802400087C32893120401C8D90463E280513D62991EE5CA543A6B75892CB639D503004F00353100662FC498AA00084C6485B1D25044C0139975D004A5EB5E52AC7233294006867F9EE6BA2115E47D7867458401424E354B36CDAFCAB34CBC2008BF2F2BA5CC646E57D4C62E41279E7F37961ACC015B005A5EFF884CBDFF10F9BFF438C014A007D67AE0529DED3901D9CD50B5C0108B13BAFD6070",
    "day17" to "target area: x=20..30, y=-10..-5",
    "day18" to """
        [[2,[[4,8],7]],[[9,7],[[2,0],9]]]
        [0,[7,5]]
        [[[5,[6,9]],4],[3,3]]
        [[[6,[6,9]],4],[[[4,8],8],[6,5]]]
        [[[[1,4],[2,1]],[6,0]],[[[9,1],[4,2]],[[0,4],0]]]
        [[9,4],[[8,6],1]]
        [[[[0,7],0],7],[1,[2,9]]]
        [[[2,9],[[8,4],[4,0]]],[[[6,2],2],[9,5]]]
        [[[0,[5,8]],[6,8]],[[[0,7],4],[[2,8],4]]]
        [[3,[[4,1],[0,7]]],[[1,[5,1]],4]]
        [[[[2,9],6],[[5,3],2]],[[8,[2,0]],9]]
        [0,[[[2,7],9],[1,8]]]
        [[[2,[6,2]],[[4,0],[9,6]]],[[6,1],[8,9]]]
        [[[[9,6],9],[5,[1,8]]],[[[9,6],9],[[2,0],[3,8]]]]
        [[[[4,3],[0,8]],4],[6,6]]
        [[[[4,3],7],[[7,0],5]],[2,[[9,9],4]]]
        [[[[4,3],[1,7]],[[3,1],[0,9]]],0]
        [[5,[[2,5],[2,8]]],[[4,0],[[5,2],[9,8]]]]
        [[[0,[3,5]],7],[[[5,9],2],4]]
        [[9,[[4,4],8]],[[[2,8],1],[[0,9],5]]]
        [[[6,8],[0,1]],[[8,2],[2,0]]]
        [[[1,9],[[9,1],2]],[[6,4],[[7,7],[8,3]]]]
        [[1,[5,[7,6]]],[[[4,7],4],5]]
        [[[8,0],9],[[[6,0],4],1]]
        [[[4,[4,2]],7],[[6,[0,9]],[[3,0],[7,6]]]]
        [[[[3,4],[9,0]],[4,4]],[[9,6],7]]
        [4,[[8,3],[7,1]]]
        [6,[6,8]]
        [[[[0,6],[7,6]],[5,3]],[[[8,9],[6,0]],[[8,5],7]]]
        [[[[0,3],1],5],[[[4,3],[3,2]],[2,[5,9]]]]
        [[[[3,1],0],[1,[8,4]]],[4,5]]
        [[[0,[4,1]],1],[[1,6],[[4,8],[8,3]]]]
        [[[1,4],6],[9,[1,2]]]
        [[9,[[0,7],1]],[[0,9],[0,[4,4]]]]
        [[1,[7,4]],[[2,[5,3]],[[6,6],9]]]
        [0,[0,[0,[0,4]]]]
        [[[[9,7],[4,9]],[9,[3,5]]],[[9,7],7]]
        [5,[9,[[4,1],[2,9]]]]
        [[0,[8,4]],1]
        [[[9,[3,3]],[8,6]],[7,[[1,6],0]]]
        [[[1,[0,7]],[[9,1],8]],[[[2,2],5],[[7,1],[2,2]]]]
        [[[7,[0,3]],4],[[6,[1,6]],[8,7]]]
        [[[[4,8],3],[[6,1],7]],[8,[3,[7,8]]]]
        [3,[[[9,6],9],3]]
        [[[5,[1,0]],[1,4]],5]
        [[[[4,7],2],[[7,0],[6,7]]],[[1,[0,3]],0]]
        [9,[[3,7],[6,1]]]
        [[[2,5],[[0,7],[0,7]]],[[[0,3],2],8]]
        [[[[4,4],7],[2,[0,7]]],[[[1,4],[6,6]],[[8,9],[5,2]]]]
        [[[[0,8],5],[[3,5],7]],[[[5,6],[0,0]],[[3,8],6]]]
        [4,[8,[9,[2,3]]]]
        [[[[6,6],9],0],[[[2,9],[0,8]],5]]
        [[[8,[4,0]],[[2,1],[7,3]]],[8,7]]
        [[6,[9,[1,8]]],[[7,[7,9]],[[2,3],1]]]
        [[6,[[1,7],1]],[[[5,3],[2,0]],[[4,4],9]]]
        [[[[8,0],[0,3]],[[4,8],[0,9]]],[8,[7,[8,6]]]]
        [6,0]
        [[[[5,2],0],[3,3]],[0,4]]
        [[[9,5],[6,4]],[[[7,2],0],8]]
        [[[0,9],[5,[2,3]]],2]
        [[[[5,4],[2,9]],[1,[9,0]]],[[9,9],[9,6]]]
        [[[7,[4,8]],[9,8]],[[[1,3],0],[4,[4,7]]]]
        [[7,[7,9]],0]
        [[[[6,7],[8,1]],[[0,2],2]],[[[7,6],6],[[3,4],[9,9]]]]
        [[7,[6,[2,2]]],[[[8,8],[0,4]],[5,[7,7]]]]
        [[[[0,6],[9,2]],[8,1]],[[[0,4],2],[[5,9],[4,9]]]]
        [[[[9,1],[1,7]],[[3,1],[0,7]]],[[2,[4,9]],[9,1]]]
        [[[9,4],2],[[[2,3],3],[6,[5,7]]]]
        [[[0,8],[[0,9],2]],[[[0,7],[4,4]],7]]
        [[[5,2],4],[0,6]]
        [[3,[9,[9,2]]],[8,[1,[6,8]]]]
        [3,[7,[[8,0],[1,7]]]]
        [[[[2,4],[7,3]],[[0,7],0]],5]
        [[[[6,0],8],[1,4]],[[[3,3],[8,6]],5]]
        [[5,[5,[6,2]]],4]
        [[[0,7],[[4,1],4]],[[8,[3,2]],[7,7]]]
        [[1,[[6,5],[2,2]]],[[6,[2,8]],[1,0]]]
        [6,[4,[[2,2],[1,8]]]]
        [[[[3,3],1],[[4,1],7]],[[[5,2],7],[4,[4,7]]]]
        [[[[2,2],1],[[4,1],3]],[1,[[0,9],[3,8]]]]
        [[0,[0,4]],[[9,[7,5]],[8,[8,0]]]]
        [[[[0,3],3],[[7,3],5]],[4,[[0,1],[3,0]]]]
        [[4,8],3]
        [[[6,0],7],[[6,8],[8,6]]]
        [[[[8,5],3],[[6,2],[2,6]]],[[[2,7],5],[[3,8],[6,9]]]]
        [7,[4,2]]
        [[[[6,0],[7,8]],6],[[[4,6],6],7]]
        [[[0,[2,1]],[5,[3,8]]],[[[3,9],3],[[0,9],3]]]
        [[[8,6],[4,0]],[2,[[4,1],8]]]
        [[[0,1],[[2,0],5]],[[[0,1],[7,0]],[[1,2],[1,4]]]]
        [[[8,8],[[4,4],3]],[1,[4,1]]]
        [[[5,[0,7]],[7,5]],[[7,6],[5,5]]]
        [[[9,[1,3]],[[3,3],6]],[4,[[5,6],8]]]
        [[[9,[3,0]],[8,5]],[1,[[8,0],3]]]
        [[[3,[3,9]],[[2,4],[4,6]]],[[1,2],3]]
        [[[1,[3,1]],[3,[6,3]]],[1,[5,7]]]
        [[[[5,5],[1,5]],3],[9,[[7,4],[9,2]]]]
        [[[6,[7,1]],[[6,6],[1,6]]],7]
        [[[[1,4],0],[8,3]],[[[8,2],9],[[0,3],[9,5]]]]
        [[4,[1,[0,1]]],[[1,[7,3]],1]]
    """.trimIndent(),
    "day19" to """
        --- scanner 0 ---
        65,91,116
        -514,-323,679
        -810,416,687
        -670,417,-446
        557,770,781
        893,-705,-874
        769,-603,624
        -615,-434,763
        866,-777,-839
        -884,416,506
        666,-551,609
        -830,402,-478
        714,394,-419
        -848,390,535
        -723,-356,-598
        -884,-326,-497
        715,782,804
        717,-686,714
        661,494,-310
        835,-669,-705
        -647,-375,698
        26,-64,-42
        540,729,799
        -807,445,-371
        -764,-418,-429
        632,440,-457

        --- scanner 1 ---
        623,554,-341
        630,-553,-714
        694,536,-542
        -687,464,-705
        -844,532,-645
        813,-586,674
        -564,576,348
        567,-517,-838
        756,-671,678
        -507,-620,398
        -386,-393,-497
        -542,-435,-486
        620,-612,-772
        -77,-1,-31
        -457,-467,-531
        -596,439,327
        828,-606,643
        -710,447,340
        40,114,47
        -512,-705,462
        505,928,649
        762,555,-401
        -636,-638,498
        446,804,725
        -781,626,-743
        565,793,665

        --- scanner 2 ---
        -396,-811,-616
        717,488,380
        -552,-346,451
        441,-784,-675
        -398,-811,-479
        404,488,-883
        -708,298,-722
        468,-673,-592
        -540,-745,-557
        427,-767,-608
        -568,825,585
        787,-461,442
        488,383,-838
        44,17,-60
        -645,820,598
        750,360,417
        629,-453,480
        518,616,-826
        689,-502,492
        -584,770,737
        -721,485,-662
        -678,358,-768
        708,420,516
        -638,-442,511
        -576,-495,459

        --- scanner 3 ---
        -586,-450,-590
        -727,576,-754
        26,-50,57
        296,660,742
        420,723,706
        362,713,647
        -628,-549,-574
        637,-293,866
        603,-364,792
        325,-570,-316
        -782,511,-717
        331,-669,-307
        557,937,-229
        -629,-741,646
        -706,407,542
        -82,47,164
        417,908,-244
        -650,-601,769
        -821,503,-650
        -654,397,723
        648,-449,824
        -627,-512,-662
        -643,-726,893
        534,839,-306
        -588,406,593
        449,-506,-292

        --- scanner 4 ---
        -629,-448,-538
        -451,559,699
        12,137,65
        734,-533,479
        701,437,-739
        665,758,756
        -142,50,-4
        746,542,-823
        455,-619,-759
        538,-730,-786
        -821,-517,693
        -579,-407,-440
        -554,414,-477
        -749,-476,755
        633,713,841
        -617,-399,-598
        -475,435,635
        487,-519,464
        610,-540,604
        -517,542,-510
        707,747,912
        -653,474,-519
        -466,441,536
        689,670,-709
        471,-713,-800
        -733,-518,656

        --- scanner 5 ---
        -350,-557,-558
        534,-303,-707
        -36,79,-85
        -474,-620,-594
        -657,467,-508
        438,792,658
        422,773,820
        600,-294,-577
        596,704,-531
        589,829,-407
        -543,854,491
        382,821,740
        -702,552,-476
        -847,-613,513
        -646,-684,495
        -787,-752,514
        652,-304,-758
        -445,791,585
        -483,697,423
        483,-527,472
        -416,-610,-653
        550,-452,548
        382,-471,503
        575,844,-654
        -691,396,-434

        --- scanner 6 ---
        665,-388,856
        -902,331,695
        -747,-602,710
        401,-727,-532
        -842,376,680
        396,-780,-707
        591,553,-658
        694,-414,892
        -827,-571,691
        502,377,655
        576,605,-761
        -512,-437,-661
        -813,512,-738
        437,436,623
        419,-768,-549
        -734,-410,733
        -9,60,-48
        -531,-487,-869
        -615,-446,-791
        486,688,-709
        513,-414,818
        -712,333,698
        -671,498,-758
        -819,380,-777
        521,325,522

        --- scanner 7 ---
        -757,981,603
        338,-318,715
        -552,-640,560
        661,-339,-711
        -790,870,490
        754,439,319
        673,-316,-553
        380,611,-391
        -660,-511,-602
        -624,-591,635
        -627,-510,499
        373,-256,727
        -619,893,-522
        -845,963,415
        596,507,377
        330,592,-599
        -795,-406,-551
        693,563,421
        -605,751,-502
        -133,-1,-57
        -712,-496,-499
        339,695,-469
        620,-321,-728
        405,-288,517
        -487,899,-483

        --- scanner 8 ---
        -575,-817,237
        -795,503,280
        -784,347,-758
        548,860,627
        743,-729,-870
        426,515,-910
        -166,-12,-31
        574,849,545
        663,-777,-910
        581,-748,-854
        -484,-785,-703
        -604,-843,273
        -731,-800,-717
        -756,-817,311
        377,-816,451
        -654,338,-692
        409,-831,291
        -768,365,283
        302,-788,314
        -608,-660,-696
        395,571,-809
        681,835,531
        471,496,-742
        -779,484,347
        -835,348,-640

        --- scanner 9 ---
        -539,-718,-844
        485,-535,-554
        950,532,-710
        -601,-526,777
        -468,-507,725
        -306,518,-866
        -518,-635,-889
        843,561,471
        529,-527,269
        -428,897,771
        -443,837,726
        854,592,-796
        165,-21,-100
        -564,-560,-804
        512,-594,283
        -500,-442,666
        623,-511,310
        -406,481,-984
        551,-476,-698
        835,523,629
        -425,707,769
        485,-398,-556
        801,540,-734
        794,573,531
        -395,561,-866

        --- scanner 10 ---
        -539,528,-785
        620,-478,-368
        -509,-552,-501
        472,735,835
        442,537,768
        -409,441,480
        -353,397,577
        -620,488,-641
        -541,-449,834
        7,-85,106
        558,599,-320
        475,-708,553
        470,-533,500
        -457,-371,793
        -438,-579,843
        671,-575,-376
        575,-582,-440
        -566,545,-629
        612,510,-246
        -499,-609,-305
        -508,-436,-324
        410,747,800
        692,691,-273
        -285,339,419
        493,-691,512

        --- scanner 11 ---
        367,-454,-454
        475,806,-642
        -114,30,-142
        -781,625,591
        663,-462,285
        -662,741,-663
        293,-635,-454
        -640,-602,-611
        -467,-463,793
        329,-606,-428
        487,771,293
        490,961,291
        -704,757,-762
        -647,-726,-486
        -773,587,433
        530,-443,337
        494,886,-611
        -450,-530,779
        452,793,-450
        -732,637,531
        -37,123,4
        -661,-479,-471
        562,-378,396
        -561,-447,752
        -663,829,-700
        505,901,336

        --- scanner 12 ---
        -844,-686,-461
        831,-405,-512
        426,754,489
        357,704,-659
        -535,558,362
        240,669,-581
        387,779,-588
        -32,121,-94
        546,-425,440
        -739,625,-706
        -950,-740,552
        -134,13,56
        -803,-521,-396
        -897,615,-832
        -867,-575,-539
        525,712,505
        -817,-761,693
        738,-402,453
        488,713,417
        577,-444,360
        -527,519,429
        760,-356,-623
        -880,-719,693
        -773,717,-859
        828,-416,-540
        -600,613,325

        --- scanner 13 ---
        406,-575,574
        478,781,-595
        -134,-129,85
        -670,464,522
        407,496,771
        -798,-546,911
        639,-645,-613
        -729,-542,956
        -503,599,-446
        249,459,834
        -671,-503,945
        -488,508,-335
        -48,18,1
        -757,451,594
        -729,-591,-360
        256,504,653
        -398,594,-305
        -681,248,591
        -580,-672,-374
        -475,-585,-371
        602,-480,-661
        439,-452,509
        414,-486,712
        638,-472,-505
        600,664,-596
        587,784,-475

        --- scanner 14 ---
        -694,776,767
        -533,741,-630
        -404,-717,-823
        483,-706,316
        -80,1,-140
        -532,-351,541
        468,-694,555
        773,798,463
        -608,817,-563
        -690,-389,458
        710,704,365
        -386,-711,-803
        57,172,-101
        740,549,-462
        711,631,-518
        -765,794,566
        616,866,403
        562,-696,514
        363,-454,-536
        692,469,-502
        -451,-758,-714
        415,-230,-543
        -569,-418,512
        325,-332,-586
        -833,775,707
        -552,786,-462

        --- scanner 15 ---
        -12,-84,63
        -772,-427,-692
        -793,-461,-733
        719,552,669
        414,460,-823
        -630,-742,273
        508,501,-825
        -744,557,-518
        483,-454,-546
        -571,-818,397
        471,-420,762
        -819,449,665
        -887,308,646
        370,-541,-534
        -136,-25,-123
        -586,474,-480
        -668,-430,-870
        -748,248,647
        294,-461,-644
        562,612,737
        -623,503,-547
        429,699,-835
        656,650,575
        -690,-758,408
        585,-433,754
        439,-441,625

        --- scanner 16 ---
        596,-593,418
        -820,646,-381
        638,802,-496
        -1,71,103
        -674,518,-399
        -916,-524,664
        647,-609,-454
        -620,529,537
        -792,-560,601
        587,786,666
        -107,-67,179
        -479,548,469
        817,-647,-500
        609,832,-520
        -799,593,-449
        -626,-312,-582
        710,845,-383
        676,-722,-453
        -609,-487,-657
        600,-678,475
        -850,-619,611
        -419,547,608
        -646,-423,-598
        571,921,726
        565,-613,403
        647,797,785

        --- scanner 17 ---
        -404,492,-456
        896,680,623
        63,-49,38
        -340,577,-451
        -620,526,812
        775,-306,871
        -40,89,-73
        743,-354,-543
        -616,611,869
        658,-368,802
        544,762,-486
        772,644,686
        -651,-359,-631
        861,-369,-706
        555,804,-330
        -465,-590,412
        -604,-339,-596
        -383,-598,308
        -488,-595,452
        -440,559,-580
        589,730,-401
        -584,-538,-599
        -585,591,884
        635,-291,900
        867,-378,-607
        830,585,676

        --- scanner 18 ---
        664,-543,735
        638,469,-766
        678,457,392
        -700,-415,369
        637,551,390
        635,-580,668
        -39,-39,37
        -698,-711,-544
        -818,-698,-665
        -815,-589,-545
        -420,404,856
        119,8,-73
        -463,314,754
        446,-713,-479
        581,-701,697
        439,472,380
        -413,352,632
        -591,-462,328
        -628,287,-835
        -680,-397,375
        557,618,-780
        -542,377,-805
        -633,392,-694
        438,-749,-635
        611,-750,-527
        551,364,-769

        --- scanner 19 ---
        473,682,455
        -834,-721,461
        587,626,546
        564,-479,651
        -545,-765,-540
        -78,-2,-37
        -711,617,612
        -722,496,598
        831,531,-771
        -518,616,-871
        614,-696,-440
        726,-573,613
        855,473,-742
        719,416,-765
        647,750,477
        -490,459,-778
        -451,525,-896
        -846,-706,700
        -737,628,496
        751,-664,-419
        -557,-652,-453
        743,-550,-432
        658,-416,553
        -655,-841,-460
        -836,-627,502

        --- scanner 20 ---
        809,-632,570
        -591,-730,-747
        629,-731,-555
        582,721,920
        -714,-709,-607
        705,-538,497
        -487,-653,401
        681,383,-768
        -538,-771,400
        -554,270,418
        694,406,-576
        772,-577,505
        -747,224,-764
        -566,298,-764
        -543,334,537
        441,700,850
        -838,-716,-732
        -527,267,556
        -718,260,-790
        774,425,-607
        441,742,787
        -668,-705,391
        40,-182,76
        717,-732,-518
        645,-773,-456
        -127,-81,-24

        --- scanner 21 ---
        533,-731,630
        788,548,552
        684,716,-498
        -271,702,-440
        554,791,-559
        571,-655,690
        167,144,161
        -344,778,-442
        -751,-420,-734
        -631,565,434
        683,683,603
        469,-591,-728
        140,-18,49
        -649,-736,760
        -742,-538,-701
        407,-753,658
        -800,529,376
        554,-525,-666
        -785,-445,-715
        508,-638,-686
        -647,-639,771
        698,631,500
        -765,457,403
        603,719,-634
        -308,674,-285
        -538,-693,781

        --- scanner 22 ---
        62,5,12
        -313,488,594
        -312,-645,454
        -381,692,-711
        479,-656,617
        -312,-464,380
        -344,-373,-560
        538,-721,649
        -298,520,434
        -352,774,-767
        -286,-493,416
        880,699,-452
        -469,-497,-553
        -329,-620,-574
        921,-569,-363
        460,640,541
        165,120,110
        791,697,-450
        -400,854,-727
        718,808,-445
        -341,413,457
        427,-637,750
        522,471,500
        935,-636,-380
        894,-652,-474
        430,539,380

        --- scanner 23 ---
        584,-628,701
        687,619,544
        509,-313,-531
        429,-353,-579
        591,-369,-560
        -572,-433,523
        573,710,600
        758,612,-498
        -746,465,-788
        -494,-387,-908
        -734,704,-803
        747,688,668
        -372,-437,-946
        -736,663,-709
        -270,-394,-856
        -622,567,414
        -632,-441,668
        -611,553,535
        -661,-423,532
        664,514,-561
        586,-630,612
        475,-635,539
        -637,669,546
        826,552,-655
        39,30,-173

        --- scanner 24 ---
        -403,-570,-427
        835,-850,759
        -354,587,-617
        618,567,574
        -509,-951,874
        647,-674,-595
        638,706,-432
        563,799,-377
        -541,-787,776
        57,-145,118
        -374,729,-603
        -335,546,825
        708,-804,-670
        673,679,471
        663,719,575
        751,817,-465
        -351,-660,-510
        877,-889,712
        101,27,2
        -360,680,947
        783,-755,-598
        815,-804,646
        -335,735,-735
        -454,-675,-562
        -481,-825,852
        -281,654,798

        --- scanner 25 ---
        483,-365,519
        562,-828,-670
        93,27,-47
        -415,786,411
        664,518,-347
        883,371,601
        -574,548,-810
        904,504,742
        -505,-426,-416
        -472,424,-783
        -376,794,478
        -470,721,374
        -12,108,76
        -482,582,-657
        487,-526,567
        721,-840,-748
        829,477,-412
        718,454,-490
        -440,-812,687
        -446,-560,-430
        -371,-487,-404
        639,-791,-711
        -483,-706,741
        604,-431,547
        -525,-794,680
        862,441,742
    """.trimIndent(),
    "day20" to """
        #.#.####.####.#.#.#.....##.#..#####...##..#.#..#.####.#.#...#.#.#.#...#########.#.....#.#...##.##.#.####...##.#..##..##.###.##...#.#.#.##.##.#.#.#..#..#..#..##..##..##..#.#...#.#...#..#....#....#.##.##..###.....####.#.####...########.#.##.#.#.#.....#..##..##..###....#.###..###......#..#####..##..#..#.##..#..#..##.#.###.#.....#....#..####..####....#..##.#..####.#...##.###..#.....###..#..#..##...#####.#.....#..##..##..####.###.#.##..####.###.##...##..#...###.####...###....###.#..#.#.####.#...##.......##...#..

        .#..##....##.....##....##...##.###.####..##.#.#.#.#....#.#..#..###.#....##..##..#######..#.##.#.##.#
        ......#.#.##...#.#..#..##.##.###..#.#.#....#..#...#..##...#####.####..####.###...##...##.##....###..
        #.##.#..#.##.#.#.###.#.....##..##.#...##....#......#....#.#.###.....#.###..#.#..##...##..##.#.##....
        ......##.#.#.#.......#####.#....##.##...#.##.##....#..##..##..##.#..#..##..###..#.#.#.#...##..#..#..
        .#.....####..##..#.##.....####....#.....##..#.#.#.#...#...##.#.##.#.#..###...##..#.#.##......#..#.##
        ...#..#..##...#.#...#....##..####..##.###.###..####.##.##..##.###..#.#.##.#......#.#.#.#..####..#...
        ....#...#...###.##.####.#....#..##.#.##..####..##.....#......###...#.####...#####.#.#......####.#...
        ....#.....######.....##.##...#.#.#.##..#...####...##...##...#.#.#...###..###.##..#.#.#....#.##...###
        .##.######.##.##.######.#....###.#...###.###.#.#..#..##..###.#..#..#.#.######.##.##...#.#.####.#.###
        ..#..###..#..####.#.#.#...###...####....#....###.#.#.###.##.#.######.##..#.#....##.#.#.....##.####..
        .###.###.......#.##.#....#..##.##.##.....##.#..##.#..##.##..#...###...#..#...##.#..#.#.####..##.....
        ..##.###.##........##.#.##...##.####..##.#...####..###..#..##########.#...###.#...##.##.#...#...##.#
        ##........#..#####..#.####...##..#..###...#.##.###......#..###.#.#.....###.#.....##...####...#....#.
        #.###..#####.#.#..##...###..######...###..##..#.##..##.##.##...##.###..###..##..#.###....##....#..#.
        ...##.#.###..#..######..#..#..##.#...#...####.####.#...####..#.###..###.##.#####.....##.###.#.###...
        ..#...#....###....#.#....##.#.##.#####.###.#....##.##.##.#.#.##.####.#..##.#..#.##.##..##...####..##
        #.######.##....#..####....##...#####.##...#.##..#.#..##.....###.##...##.######.#..#..#.####.#.##.#.#
        #.######....##.....#..##....####.#.#...#..#...#.#.#.#.#.#..#.#..###.....#..###.##.....#######..###.#
        ..##.#..##..###.#.###...#.......#.###..###.#.###.#######.#..###..#..##.#.#...####..#..#.....#..####.
        ##.#.#.#....#.....#....#.#.##.#..##.####......####....#..##...#..####.#####.###.#....#####..###.#.#.
        .#.##...#...#.##..##.###...###.##.#...#.#.#....###.#..#...#.#..###..#.#.#.#.###..####..########.#.#.
        ....###.#.#.#.....#..##.#.#.#.#..######.#.#.##..#.###.####.#..#.#######.##.#...#.##.####.#.#..#....#
        ##.#.##...########.#.#.#...#.#.#.#..##..#...##.#...####..#...#.##...##...#..#...#.###....#.#.#.#.#..
        #.......#..###.###..###.##.###..###..#......##.##.#...#####...#...##.#..##.#.###..#.###.####.###.##.
        ..#....##.....##..#....#..##.#.#..#.##.#.##.##.##########.....####..##.###..#..#.#....##...#..#....#
        ..##.#..##..#.#####...####..#.##.###.....####..##..##...####.#..#.##..#...#...#.....#..###..##...##.
        ....#..###...#...#.###.#..#..##.####..#..#.###.....##...#########.#...###..#.#.#.....##..###...#..#.
        ###.#.##.#..#.###.#.#..###.##..###...###....#.#..#.............#..#.##.####.....###.###.###....#....
        ..#.###.#....###..#.###.##.#..#.###..##.#...##...#.#.###..#.#.##....#.##.#.#..#..#......###.##.##.#.
        ##..####..#.#.#...##....#.##..#.......##...#.......###.####..####.#..####.#...###...#...#........###
        #.#...###.#.#.###....#.#..##.##....##.#..#.#..#.##.#.#####..###..#...#..######....##.##....###.###..
        #.#.#..####..#.##..##.##.######.####.#.##...##..##..####...##.#.###...##.###...#.##...##...####.#..#
        .##.#..##..##...#.##.#.####.....#.#..#.#####.###..###.#.#..##....#..#..###.#.....##....###.#########
        #####.##.#.########.#..###.###.#.#.##..#.###.#..#...#.#.#.#.##..#....###.#...###..#.#..##...##.#....
        .#.#..#.#######.###..##...##..#..###.#..#####.#..#...#####...#.......#..#.######..##.....##.#.#...##
        #.....#..###.##.#.###.#.........#.#.#.#####.##.###########.#...###.#..#..#..#.##...#....#..#....#.#.
        #.###...#.#..#.##.###...####.##.##.##..#..#.####.##.#####.....###...##.###.#..#..#..#.##.####.####..
        ##...##..#..#######..#####......#..#..##..#..#..#.###.##.##.....#####.#.###..###..#..#.#######...#.#
        .#...###...#..##.......#####.###.#...##...##.##..#.##.####.......#.#...#...#..###.##.....##..#..#..#
        #..#.##..#..##...#.#######....#...#.###.#.##...##..#..#.#.#.#...#.###.###.##......#..#.####.#..#####
        ........##...###..#.#...###.###.###.#..#..##..#.##..##..##...#...#.##.#.#.####.....####....##.##...#
        #.##.###.##.#.#.#.#.#..#......###.######.#..#..#.#.#...#.#.##..#....##.##.##.#.#....#.......##..#.#.
        #####.#####.#.#..#.#......##.####...##..##.#.#.#..#....####..######.###..##.##...##.######.##....#..
        .##.#..###...#########...##....###.##.#####....###.##.####..##..#.....#.#......##....###.#####..##.#
        .#...##.##.#..###..###......####.###........###.#.####..#..####..#.#...######.##.####..#.###.#......
        #.#.##.##.####.#.##.#..##...####..#.#.##.#..#.#.....##.......#####..#####......#.......#....##.##.##
        ####.#.#.##...#.####.##.#...#.###..##.##....###.#####..#######..##.##.##....###.######..#......#.###
        #.##...##.#.##.####.####.##.#..#########...##.#..##...#.#.#.####....####.#..#....###...##..####.#...
        ..###..###..###...#..##...##.#.#.#..##....#.###.#####.........#.#....#.#####.##....#.##...#..##..#.#
        .#.#.#.#..#...#..##.#...######.##.###....#..#...##.#..#.##.#.#.#..#######..##.#..#....##..#....##.#.
        ##.#.###..##...#..##.##...###.##.#.##....#..#...#..##...##..####.....###.##.##.....#..##..##..##.##.
        ##.##..#.#..#..#####..#.#...#....#.##..#...########.#######..#.#.###.#...#..####.#..##.#.###.##..#..
        #.#.#...#.#.###...##.###.##.#..#..#..#..#.##.###.#..#######...#..#.##.#...#.##.#...##.#.##..#..#.###
        #.#.#####.###...#..#..########..##..#.####.###...#.#.#..#..#.#...#.....##.##.#####.#..####..####...#
        .#..##....##.#.##.#.....#..#..####.#.##.###.....#.#..##...#..####..#####...#.....#.##..###.##.###.#.
        ####..#..###..###.#.####..####..#.##.###..#.###...####.#....######...#.#...#.#...####...##.####.#.##
        .###..######......#...##.###.###.###..##.......#..###..##.##.##....#..#..#.##.#.##..#..#..#..#..#.#.
        ##..##.##.####.####.#..#.....#.#......##.#####.#...##...####.#####.###.#...###.###..##.###..#..##.#.
        .#..###.....##.###.#....##.##.....#..#.#....#.####..####.###..#..##..###.....##.##.#.######.###.#..#
        #.....##....#..#.#.#..#..###...#..#..#..####.##.#..#.##....##.#.###..#..#.....#.....#.##...##.....##
        ###...#.#...#.#..#####.###.#.........#.###.....#....#####....#.#....##.#.#.##...#...#.#...#.##....##
        ..##..#..#.#####.##.##.#######...#.#####.##..##.....#####.####.#.####..#.#.#..#...#.#.#.#....#.#....
        ###.#..##.####....#..#.##.#.####..#..##...#..#..##.#....#...#####..##...#.#######.#.####......######
        .#..##.....##..#..#.##..#.#########..##.#######...#.##.#.##...#.###..##..#..#.###.#..#...##.#.#.###.
        .##...######...####.#.#####.#.#..##.#...##.#...####..####...#..###...###.....#.##.#.#....###..##....
        #.##...#..#..#.#.#.#....#....####.#.#.#.####..####...#.#.##..#....##.....#..#....###.###.#.#####....
        #.#.##.##..#.#...#....##..#...#.#.##..#.#....##...#..##.######.....#..###.#####.##..#.#.####.#...#.#
        #.###..##.#.#..#.#..#.###.#....#..##...#.#.#..#.#..#####.##.##.....#.#.###..######...#.#.##...###..#
        .##.#...###...#...##.####..###.....####.#.####..##.##..#.###.#..####...#.###.#.##...#.#..##..#...#..
        .###.#.#..#....##.##..##..###.####.##..##...#####.#.#...##.#..#...#...##.###...##..#......#...#.####
        .......##.#..#.#.###.####..#.#.##.########..#.###..#.#......#....##..#.###..#..#....##..##..#......#
        #.#..#...####.##..#..#.#..###.......##..#..#....#.#....#.#.#..##.##..#....#...#####.####.##.##...#.#
        ..#.....#####..#...###.####.##.#..##.#..#..########.#..#..##.###.#.##..#.######....##....##.###.#.##
        #.#.#.#..#..#.#.#.#.#...#####.##.#.#.####..##..###.###.##.#.#..###..#.#.#....#...##.#...###...#.#.#.
        #.#.#..#.#.#..###.#.#....#.....#.#.###.......##...##....#....##.#.####.#.###...#.##.#..####.#...###.
        #...##.#####.##.#..#..###..###.#.#...##..##...#...#...##..##...#......#...#..##.#.##.....#...#..#.##
        #..##.#...#..#.#.####...##.######...#..##.##.##...#####.....#.#.#.#.##.####....#.#...####.##.#.##...
        ##..#.##..#.####.#.####..#..##.###.....##.#...##.#..#.#..#.#...#...#..#..###.##..##..#.###..###.##.#
        .##.#..##.#########.##...........##..#..##...##.#.....##.###...###.####.#.#.##...##....##.#.#.#.#.##
        #...#...###.###....#####....#.#...##.####.##..#.###..#.#.#..##...###.##..####..###.###.##......#####
        .#..#.##.##.##...#.##...#.....#.##.##.#.#.#..#...#.#.##....###.###.#.#.#.##.#..##########....####.#.
        ..#..#.###..###.#..#.#.#..#.#.###....####.#####.##.###..#..####...#......#####..###........#..##...#
        #.#.#.#.##..######.....##..#.##.#####...##......#.#.#..####.#..##.#####.....#.##.##..####.##.#.##...
        ...##...#..##...##...##..#....#..#####.#####.#.##.#......##.##...####.#####..##...#...#..####..##..#
        .##.#.###########...###...##..#....#...#...###.##.###...######..##.....#..#.######.#####.#..#.#.####
        ..#....##.......##.##.....##...##....#.###.#..#...##..#...#....###.##.##..###.####..###..##.##..##.#
        ###....#.#.....#...#####.#.#....#.##..##########.#.######....###..###.##.#####.####..###.#.#.#.###.#
        #.##.##..#..#####.....#..#.####.###.#...##..#.....###..#...######.##..##.###.##..#####....##.#####..
        #...#..###.#....##..##.###.###..#.#...##..#.###....######..#..###.#..###.##....#.#..#...#.#..###.#.#
        #..##..#.#.....#.....###.##.#...#...###..#.#####..##......#..#.##..###.#..##.###...####...##..#....#
        ###...######..#.#...#...#..#..#..####.##.##.##.##.##..##.###.#.#.##...#.#..#..#...####...#.###.#.###
        ..#.#.##..#.###.....#...#..##..##...#..#.....####...#.#..........##.....###.#..##.#.##...##.#..#..#.
        #.##....###.#.##...###.#...#.#.#..#.###.#####.#######..#....##..##.####.##..#..#..#####...####..#.##
        #...#.####..##.###.#...##......#.####...#..##.....#.##..##.#.##...#...##.#.##.#.##.......##..###.###
        ....###.##..#.#..###..#....#..#.#.#####...#....#.##...##..#.#..#..########.#.#...##....#.#.#..##.##.
        ..#......#.#.#.#.#...#.#.####..##.#####.##.......###....#.#.#.#....#....#######...#.#...#....#.##..#
        .##.#.#...#...##...#...########.##.#.#.#.##...#..#.##..##.#.###..##..#####.#.#.....#...#..###.....#.
        #...#....####..#..#####..#.##.....#.#.#...######......#.#.###...#.####.#......##...####.#.#.##.###.#
        .###.....###...##.###..#.####.###.#...###.#....#..#..#.#.##.##....###.##..##..#....#####..###..##.##
        #...#.##.##.#...#.....#..####..#.#..#.#.#.###..#.......###...#.....#...##.##...#.#####.#.#....#...##
    """.trimIndent(),
    "day21" to """
            Player 1 starting position: 1
            Player 2 starting position: 10
    """.trimIndent()
)
# Daikon Invariants Annotation Report

Generated from [`daikon-output.txt`](daikon-output.txt).

## Summary

- **Total Invariants**: 1134
- **Commented**: 352 (31.0%)
- **Pending**: 782

### Breakdown by Scope Category

- **Object Invariants**: 2 / 17 commented (11.8%)
- **Class Invariants**: 2 / 2 commented (100.0%)
- **Preconditions (ENTER)**: 103 / 240 commented (42.9%)
- **Postconditions (EXIT)**: 245 / 875 commented (28.0%)

## Annotated Invariants by Scope

### [`ar.edu.unrc.game2048.Board.padWithEmptyCells(java.util.List):::ENTER`](daikon-output.txt#L950)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [951](daikon-output.txt#L951) | [`this.grid != null`](daikon-output.txt#L951) | Correct but trivial |
| [952](daikon-output.txt#L952) | [`this.rngStrategy != null`](daikon-output.txt#L952) | Correct but trivial |
| [953](daikon-output.txt#L953) | [`merged != null`](daikon-output.txt#L953) | Correct and useful |
| [954](daikon-output.txt#L954) | [`merged[] elements != null`](daikon-output.txt#L954) | Correct but trivial |
| [955](daikon-output.txt#L955) | [`merged[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L955) | Correct but trivial |
| [956](daikon-output.txt#L956) | [`merged.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L956) | Correct but trivial |
| [957](daikon-output.txt#L957) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(merged[])-1`](daikon-output.txt#L957) | Incorrect |
| [958](daikon-output.txt#L958) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L958) | Incorrect |
| [959](daikon-output.txt#L959) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(merged[])`](daikon-output.txt#L959) | Incorrect |
| [960](daikon-output.txt#L960) | [`this.winningValue >= this.size`](daikon-output.txt#L960) | Incorrect |
| [961](daikon-output.txt#L961) | [`this.winningValue >= size(merged[])`](daikon-output.txt#L961) | Correct but trivial |
| [962](daikon-output.txt#L962) | [`this.size >= size(merged[])`](daikon-output.txt#L962) | Correct and useful |
| [963](daikon-output.txt#L963) | [`this.grid.getClass().getName() != merged.getClass().getName()`](daikon-output.txt#L963) | Correct but trivial |
| [964](daikon-output.txt#L964) | [`this.rngStrategy.getClass().getName() != merged.getClass().getName()`](daikon-output.txt#L964) | Correct but trivial |
| [965](daikon-output.txt#L965) | [`size(this.grid[])-1 >= size(merged[])-1`](daikon-output.txt#L965) | Incorrect |

### [`ar.edu.unrc.game2048.Board.padWithEmptyCells(java.util.List):::EXIT`](daikon-output.txt#L967)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [968](daikon-output.txt#L968) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L968) | Correct but trivial |
| [969](daikon-output.txt#L969) | [`this.size == orig(this.size)`](daikon-output.txt#L969) | Correct but trivial |
| [970](daikon-output.txt#L970) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L970) | Correct but trivial |
| [971](daikon-output.txt#L971) | [`this.grid == orig(this.grid)`](daikon-output.txt#L971) | Correct but trivial |
| [972](daikon-output.txt#L972) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L972) | Correct but trivial |
| [973](daikon-output.txt#L973) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L973) | Correct but trivial |
| [974](daikon-output.txt#L974) | [`this.score == orig(this.score)`](daikon-output.txt#L974) | Correct but trivial |
| [975](daikon-output.txt#L975) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L975) | Correct but trivial |
| [976](daikon-output.txt#L976) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L976) | Correct but trivial |
| [977](daikon-output.txt#L977) | [`this.grid != null`](daikon-output.txt#L977) | Correct but trivial |
| [978](daikon-output.txt#L978) | [`this.rngStrategy != null`](daikon-output.txt#L978) | Correct but trivial |
| [979](daikon-output.txt#L979) | [`merged[] elements != null`](daikon-output.txt#L979) | Correct but trivial |
| [980](daikon-output.txt#L980) | [`merged[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L980) | Correct but trivial |
| [981](daikon-output.txt#L981) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L981) | Incorrect |
| [982](daikon-output.txt#L982) | [`this.winningValue >= this.size`](daikon-output.txt#L982) | Incorrect |
| [983](daikon-output.txt#L983) | [`this.winningValue >= orig(size(merged[]))`](daikon-output.txt#L983) | Incorrect |
| [984](daikon-output.txt#L984) | [`this.size >= orig(size(merged[]))`](daikon-output.txt#L984) | Correct but trivial |
| [985](daikon-output.txt#L985) | [`this.grid.getClass().getName() != orig(merged.getClass().getName())`](daikon-output.txt#L985) | Correct but trivial |
| [986](daikon-output.txt#L986) | [`this.rngStrategy.getClass().getName() != orig(merged.getClass().getName())`](daikon-output.txt#L986) | Correct but trivial |
| [987](daikon-output.txt#L987) | [`size(merged[])-1 >= orig(size(merged[]))-1`](daikon-output.txt#L987) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.removeEmptyCells(java.util.List):::ENTER`](daikon-output.txt#L989)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [990](daikon-output.txt#L990) | [`this.size == size(rowList[])`](daikon-output.txt#L990) | Correct and useful |
| [991](daikon-output.txt#L991) | [`this.grid != null`](daikon-output.txt#L991) | Correct but trivial |
| [992](daikon-output.txt#L992) | [`this.rngStrategy != null`](daikon-output.txt#L992) | Correct but trivial |
| [993](daikon-output.txt#L993) | [`rowList != null`](daikon-output.txt#L993) | Correct and useful |
| [994](daikon-output.txt#L994) | [`rowList[] elements != null`](daikon-output.txt#L994) | Correct but trivial |
| [995](daikon-output.txt#L995) | [`rowList[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L995) | Correct but trivial |
| [996](daikon-output.txt#L996) | [`rowList.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L996) | Correct but trivial |
| [997](daikon-output.txt#L997) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L997) | Incorrect |
| [998](daikon-output.txt#L998) | [`this.winningValue >= this.size`](daikon-output.txt#L998) | Incorrect |
| [999](daikon-output.txt#L999) | [`this.grid.getClass().getName() != rowList.getClass().getName()`](daikon-output.txt#L999) | Correct but trivial |
| [1000](daikon-output.txt#L1000) | [`this.rngStrategy.getClass().getName() != rowList.getClass().getName()`](daikon-output.txt#L1000) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.removeEmptyCells(java.util.List):::EXIT`](daikon-output.txt#L1002)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1003](daikon-output.txt#L1003) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1003) | Correct but trivial |
| [1004](daikon-output.txt#L1004) | [`this.size == orig(this.size)`](daikon-output.txt#L1004) | Correct but trivial |
| [1005](daikon-output.txt#L1005) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1005) | Correct but trivial |
| [1006](daikon-output.txt#L1006) | [`this.size == orig(size(rowList[]))`](daikon-output.txt#L1006) | Correct but trivial |
| [1007](daikon-output.txt#L1007) | [`this.grid == orig(this.grid)`](daikon-output.txt#L1007) | Correct but trivial |
| [1008](daikon-output.txt#L1008) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1008) | Correct but trivial |
| [1009](daikon-output.txt#L1009) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1009) | Correct but trivial |
| [1010](daikon-output.txt#L1010) | [`this.score == orig(this.score)`](daikon-output.txt#L1010) | Correct but trivial |
| [1011](daikon-output.txt#L1011) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1011) | Correct but trivial |
| [1012](daikon-output.txt#L1012) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1012) | Correct but trivial |
| [1013](daikon-output.txt#L1013) | [`rowList[] == orig(rowList[])`](daikon-output.txt#L1013) | Correct but trivial |
| [1014](daikon-output.txt#L1014) | [`return.getClass().getName() == orig(rowList.getClass().getName())`](daikon-output.txt#L1014) | Correct but trivial |
| [1015](daikon-output.txt#L1015) | [`this.grid != null`](daikon-output.txt#L1015) | Correct but trivial |
| [1016](daikon-output.txt#L1016) | [`this.rngStrategy != null`](daikon-output.txt#L1016) | Correct but trivial |
| [1017](daikon-output.txt#L1017) | [`rowList[] elements != null`](daikon-output.txt#L1017) | Correct but trivial |
| [1018](daikon-output.txt#L1018) | [`rowList[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1018) | Correct but trivial |
| [1019](daikon-output.txt#L1019) | [`return != null`](daikon-output.txt#L1019) | Correct and useful |
| [1020](daikon-output.txt#L1020) | [`return[] elements != null`](daikon-output.txt#L1020) | Correct but trivial |
| [1021](daikon-output.txt#L1021) | [`return[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1021) | Correct but trivial |
| [1022](daikon-output.txt#L1022) | [`return.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L1022) | Correct but trivial |
| [1023](daikon-output.txt#L1023) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(return[])-1`](daikon-output.txt#L1023) | Correct but trivial |
| [1024](daikon-output.txt#L1024) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1024) | Incorrect |
| [1025](daikon-output.txt#L1025) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(return[])`](daikon-output.txt#L1025) | Incorrect |
| [1026](daikon-output.txt#L1026) | [`this.winningValue >= this.size`](daikon-output.txt#L1026) | Incorrect |
| [1027](daikon-output.txt#L1027) | [`this.winningValue >= size(return[])`](daikon-output.txt#L1027) | Incorrect |
| [1028](daikon-output.txt#L1028) | [`this.size >= size(return[])`](daikon-output.txt#L1028) | Correct and useful |
| [1029](daikon-output.txt#L1029) | [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L1029) | Correct but trivial |
| [1030](daikon-output.txt#L1030) | [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L1030) | Correct but trivial |
| [1031](daikon-output.txt#L1031) | [`size(rowList[])-1 >= size(return[])-1`](daikon-output.txt#L1031) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.setCell(int, int, ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1061)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1062](daikon-output.txt#L1062) | [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1062) | Too strong / likely spurious |
| [1063](daikon-output.txt#L1063) | [`this.size one of { 4, 8 }`](daikon-output.txt#L1063) | Too strong / likely spurious |
| [1064](daikon-output.txt#L1064) | [`this.grid != null`](daikon-output.txt#L1064) | Correct but trivial |
| [1065](daikon-output.txt#L1065) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1065) | Too strong / likely spurious |
| [1066](daikon-output.txt#L1066) | [`this.rngStrategy != null`](daikon-output.txt#L1066) | Correct but trivial |
| [1067](daikon-output.txt#L1067) | [`row >= 0`](daikon-output.txt#L1067) | Correct and useful |
| [1068](daikon-output.txt#L1068) | [`col >= 0`](daikon-output.txt#L1068) | Correct and useful |
| [1069](daikon-output.txt#L1069) | [`cell != null`](daikon-output.txt#L1069) | Correct and useful |
| [1070](daikon-output.txt#L1070) | [`cell.value >= 0`](daikon-output.txt#L1070) | Correct but trivial |
| [1071](daikon-output.txt#L1071) | [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1071) | Correct but trivial |
| [1072](daikon-output.txt#L1072) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1072) | Correct but trivial |
| [1073](daikon-output.txt#L1073) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1073) | Incorrect |
| [1074](daikon-output.txt#L1074) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1074) | Correct but trivial |
| [1075](daikon-output.txt#L1075) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1075) | Too strong / likely spurious |
| [1076](daikon-output.txt#L1076) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1076) | Incorrect |
| [1077](daikon-output.txt#L1077) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1077) | Incorrect |
| [1078](daikon-output.txt#L1078) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L1078) | Incorrect |
| [1079](daikon-output.txt#L1079) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L1079) | Incorrect |
| [1080](daikon-output.txt#L1080) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= cell.value`](daikon-output.txt#L1080) | Incorrect |
| [1081](daikon-output.txt#L1081) | [`this.winningValue > this.size`](daikon-output.txt#L1081) | Incorrect |
| [1082](daikon-output.txt#L1082) | [`this.winningValue > this.score`](daikon-output.txt#L1082) | Incorrect |
| [1083](daikon-output.txt#L1083) | [`this.winningValue > row`](daikon-output.txt#L1083) | Incorrect |
| [1084](daikon-output.txt#L1084) | [`this.winningValue > col`](daikon-output.txt#L1084) | Incorrect |
| [1085](daikon-output.txt#L1085) | [`this.winningValue >= cell.value`](daikon-output.txt#L1085) | Incorrect |
| [1086](daikon-output.txt#L1086) | [`this.winningValue > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1086) | Correct but trivial |
| [1087](daikon-output.txt#L1087) | [`this.score % this.size == 0`](daikon-output.txt#L1087) | Incorrect |
| [1088](daikon-output.txt#L1088) | [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1088) | Correct but trivial |
| [1089](daikon-output.txt#L1089) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L1089) | Incorrect |
| [1090](daikon-output.txt#L1090) | [`row >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1090) | Correct but trivial |
| [1091](daikon-output.txt#L1091) | [`row <= size(this.grid[])-1`](daikon-output.txt#L1091) | Correct but trivial |
| [1092](daikon-output.txt#L1092) | [`col >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1092) | Correct but trivial |
| [1093](daikon-output.txt#L1093) | [`col <= size(this.grid[])-1`](daikon-output.txt#L1093) | Correct but trivial |
| [1094](daikon-output.txt#L1094) | [`cell.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1094) | Correct but trivial |
| [1095](daikon-output.txt#L1095) | [`cell.value != size(this.grid[])-1`](daikon-output.txt#L1095) | Correct but trivial |
| [1096](daikon-output.txt#L1096) | [`ar.edu.unrc.game2048.Cell.EMPTY.value < size(this.grid[])-1`](daikon-output.txt#L1096) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.setCell(int, int, ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1098)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1099](daikon-output.txt#L1099) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1099) | Correct but trivial |
| [1100](daikon-output.txt#L1100) | [`this.size == orig(this.size)`](daikon-output.txt#L1100) | Correct but trivial |
| [1101](daikon-output.txt#L1101) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1101) | Correct but trivial |
| [1102](daikon-output.txt#L1102) | [`this.grid == orig(this.grid)`](daikon-output.txt#L1102) | Correct but trivial |
| [1103](daikon-output.txt#L1103) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1103) | Correct but trivial |
| [1104](daikon-output.txt#L1104) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1104) | Correct but trivial |
| [1105](daikon-output.txt#L1105) | [`this.score == orig(this.score)`](daikon-output.txt#L1105) | Correct but trivial |
| [1106](daikon-output.txt#L1106) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1106) | Correct but trivial |
| [1107](daikon-output.txt#L1107) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1107) | Correct but trivial |
| [1108](daikon-output.txt#L1108) | [`cell.value == orig(cell.value)`](daikon-output.txt#L1108) | Correct but trivial |
| [1109](daikon-output.txt#L1109) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1109) | Correct but trivial |
| [1110](daikon-output.txt#L1110) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1110) | Correct but trivial |
| [1111](daikon-output.txt#L1111) | [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1111) | Too strong / likely spurious |
| [1112](daikon-output.txt#L1112) | [`this.size one of { 4, 8 }`](daikon-output.txt#L1112) | Too strong / likely spurious |
| [1113](daikon-output.txt#L1113) | [`this.grid != null`](daikon-output.txt#L1113) | Correct but trivial |
| [1114](daikon-output.txt#L1114) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1114) | Too strong / likely spurious |
| [1115](daikon-output.txt#L1115) | [`this.rngStrategy != null`](daikon-output.txt#L1115) | Correct but trivial |
| [1116](daikon-output.txt#L1116) | [`cell.value >= 0`](daikon-output.txt#L1116) | Correct but trivial |
| [1117](daikon-output.txt#L1117) | [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1117) | Correct but trivial |
| [1118](daikon-output.txt#L1118) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1118) | Correct but trivial |
| [1119](daikon-output.txt#L1119) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1119) | Correct but trivial |
| [1120](daikon-output.txt#L1120) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1120) | Incorrect |
| [1121](daikon-output.txt#L1121) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1121) | Too strong / likely spurious |
| [1122](daikon-output.txt#L1122) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1122) | Incorrect |
| [1123](daikon-output.txt#L1123) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1123) | Incorrect |
| [1124](daikon-output.txt#L1124) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= cell.value`](daikon-output.txt#L1124) | Too strong / likely spurious |
| [1125](daikon-output.txt#L1125) | [`this.winningValue > this.size`](daikon-output.txt#L1125) | Too strong / likely spurious |
| [1126](daikon-output.txt#L1126) | [`this.winningValue > this.score`](daikon-output.txt#L1126) | Too strong / likely spurious |
| [1127](daikon-output.txt#L1127) | [`this.winningValue >= cell.value`](daikon-output.txt#L1127) | Too strong / likely spurious |
| [1128](daikon-output.txt#L1128) | [`this.winningValue > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1128) | Correct but trivial |
| [1129](daikon-output.txt#L1129) | [`this.winningValue > orig(row)`](daikon-output.txt#L1129) | Correct but trivial |
| [1130](daikon-output.txt#L1130) | [`this.winningValue > orig(col)`](daikon-output.txt#L1130) | Correct but trivial |
| [1131](daikon-output.txt#L1131) | [`this.score % this.size == 0`](daikon-output.txt#L1131) | Too strong / likely spurious |
| [1132](daikon-output.txt#L1132) | [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1132) | Correct but trivial |
| [1133](daikon-output.txt#L1133) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L1133) | Too strong / likely spurious |
| [1134](daikon-output.txt#L1134) | [`cell.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1134) | Correct but trivial |
| [1135](daikon-output.txt#L1135) | [`cell.value != size(this.grid[])-1`](daikon-output.txt#L1135) | Incorrect |
| [1136](daikon-output.txt#L1136) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(row)`](daikon-output.txt#L1136) | Correct but trivial |
| [1137](daikon-output.txt#L1137) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(col)`](daikon-output.txt#L1137) | Correct but trivial |
| [1138](daikon-output.txt#L1138) | [`ar.edu.unrc.game2048.Cell.EMPTY.value < size(this.grid[])-1`](daikon-output.txt#L1138) | Correct but trivial |
| [1139](daikon-output.txt#L1139) | [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L1139) | Correct but trivial |
| [1140](daikon-output.txt#L1140) | [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L1140) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::ENTER`](daikon-output.txt#L1142)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1143](daikon-output.txt#L1143) | [`size == size(this.grid[])`](daikon-output.txt#L1143) | Correct but trivial |
| [1144](daikon-output.txt#L1144) | [`this.grid[this.size-1] == this.grid[size-1]`](daikon-output.txt#L1144) | Correct but trivial |
| [1145](daikon-output.txt#L1145) | [`size >= 1`](daikon-output.txt#L1145) | Correct and useful |
| [1146](daikon-output.txt#L1146) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1146) | Incorrect |
| [1147](daikon-output.txt#L1147) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= size`](daikon-output.txt#L1147) | Incorrect |
| [1148](daikon-output.txt#L1148) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[])`](daikon-output.txt#L1148) | Incorrect |
| [1149](daikon-output.txt#L1149) | [`this.winningValue >= this.size`](daikon-output.txt#L1149) | Correct but trivial |
| [1150](daikon-output.txt#L1150) | [`this.winningValue >= size(this.grid[])`](daikon-output.txt#L1150) | Correct but trivial |
| [1151](daikon-output.txt#L1151) | [`this.size % size == 0`](daikon-output.txt#L1151) | Correct but trivial |
| [1152](daikon-output.txt#L1152) | [`this.size <= size`](daikon-output.txt#L1152) | Incorrect |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT`](daikon-output.txt#L1154)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1155](daikon-output.txt#L1155) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1155) | Correct but trivial |
| [1156](daikon-output.txt#L1156) | [`this.size == orig(this.size)`](daikon-output.txt#L1156) | Correct but trivial |
| [1157](daikon-output.txt#L1157) | [`this.grid == orig(this.grid)`](daikon-output.txt#L1157) | Correct but trivial |
| [1158](daikon-output.txt#L1158) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1158) | Correct but trivial |
| [1159](daikon-output.txt#L1159) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1159) | Correct but trivial |
| [1160](daikon-output.txt#L1160) | [`this.score == orig(this.score)`](daikon-output.txt#L1160) | Correct but trivial |
| [1161](daikon-output.txt#L1161) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1161) | Correct but trivial |
| [1162](daikon-output.txt#L1162) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1162) | Correct but trivial |
| [1163](daikon-output.txt#L1163) | [`orig(size) == size(this.grid[])`](daikon-output.txt#L1163) | Correct but trivial |
| [1164](daikon-output.txt#L1164) | [`this.grid[this.size-1] == this.grid[orig(size)-1]`](daikon-output.txt#L1164) | Correct but trivial |
| [1165](daikon-output.txt#L1165) | [`this.grid[this.size-1] == orig(this.grid[post(size)-1])`](daikon-output.txt#L1165) | Correct but trivial |
| [1166](daikon-output.txt#L1166) | [`this.grid[this.size-1] == orig(this.grid[size-1])`](daikon-output.txt#L1166) | Correct but trivial |
| [1167](daikon-output.txt#L1167) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue)`](daikon-output.txt#L1167) | Incorrect |
| [1168](daikon-output.txt#L1168) | [`(return == false)  ==>  (orig(size) one of { 2, 3 })`](daikon-output.txt#L1168) | Too strong / likely spurious |
| [1169](daikon-output.txt#L1169) | [`(return == false)  ==>  (this.grid == null)`](daikon-output.txt#L1169) | Incorrect |
| [1170](daikon-output.txt#L1170) | [`(return == false)  ==>  (this.rngStrategy == null)`](daikon-output.txt#L1170) | Incorrect |
| [1171](daikon-output.txt#L1171) | [`(return == false)  ==>  (this.score == 0)`](daikon-output.txt#L1171) | Correct but trivial |
| [1172](daikon-output.txt#L1172) | [`(return == false)  ==>  (this.size == 0)`](daikon-output.txt#L1172) | Too strong / likely spurious |
| [1173](daikon-output.txt#L1173) | [`(return == false)  ==>  (this.size == this.score)`](daikon-output.txt#L1173) | Correct but trivial |
| [1174](daikon-output.txt#L1174) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[]))`](daikon-output.txt#L1174) | Too strong / likely spurious |
| [1175](daikon-output.txt#L1175) | [`(return == true)  ==>  (orig(size) == size(this.grid[]))`](daikon-output.txt#L1175) | Correct but trivial |
| [1176](daikon-output.txt#L1176) | [`(return == true)  ==>  (orig(size) >= 1)`](daikon-output.txt#L1176) | Correct but trivial |
| [1177](daikon-output.txt#L1177) | [`(return == true)  ==>  (this.grid.getClass().getName() != this.rngStrategy.getClass().getName())`](daikon-output.txt#L1177) | Correct but trivial |
| [1178](daikon-output.txt#L1178) | [`(return == true)  ==>  (this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class)`](daikon-output.txt#L1178) | Correct but trivial |
| [1179](daikon-output.txt#L1179) | [`(return == true)  ==>  (this.grid[] elements != null)`](daikon-output.txt#L1179) | Correct but trivial |
| [1180](daikon-output.txt#L1180) | [`(return == true)  ==>  (this.size == size(this.grid[]))`](daikon-output.txt#L1180) | Correct but trivial |
| [1181](daikon-output.txt#L1181) | [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L1181) | Correct and useful |
| [1182](daikon-output.txt#L1182) | [`(return == true)  ==>  (this.winningValue >= size(this.grid[]))`](daikon-output.txt#L1182) | Incorrect |
| [1183](daikon-output.txt#L1183) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1183) | Incorrect |
| [1184](daikon-output.txt#L1184) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(this.grid[])`](daikon-output.txt#L1184) | Incorrect |
| [1185](daikon-output.txt#L1185) | [`this.winningValue >= this.size`](daikon-output.txt#L1185) | Incorrect |
| [1186](daikon-output.txt#L1186) | [`this.winningValue >= size(this.grid[])`](daikon-output.txt#L1186) | Incorrect |
| [1187](daikon-output.txt#L1187) | [`this.size % orig(size) == 0`](daikon-output.txt#L1187) | Too strong / likely spurious |
| [1188](daikon-output.txt#L1188) | [`this.size <= orig(size)`](daikon-output.txt#L1188) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT;condition="return == true"`](daikon-output.txt#L1190)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1191](daikon-output.txt#L1191) | [`return == true`](daikon-output.txt#L1191) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.validSize(int):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1193)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1194](daikon-output.txt#L1194) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L1194) | Too strong / likely spurious |
| [1195](daikon-output.txt#L1195) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L1195) | Too strong / likely spurious |
| [1196](daikon-output.txt#L1196) | [`this.size == this.score`](daikon-output.txt#L1196) | Correct but trivial |
| [1197](daikon-output.txt#L1197) | [`this.size == orig(this.score)`](daikon-output.txt#L1197) | Correct but trivial |
| [1198](daikon-output.txt#L1198) | [`this.size == 0`](daikon-output.txt#L1198) | Too strong / likely spurious |
| [1199](daikon-output.txt#L1199) | [`this.grid == null`](daikon-output.txt#L1199) | Correct but trivial |
| [1200](daikon-output.txt#L1200) | [`this.rngStrategy == null`](daikon-output.txt#L1200) | Correct but trivial |
| [1201](daikon-output.txt#L1201) | [`return == false`](daikon-output.txt#L1201) | Correct but trivial |
| [1202](daikon-output.txt#L1202) | [`orig(size) one of { 2, 3 }`](daikon-output.txt#L1202) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.validatePosition(int, int):::ENTER`](daikon-output.txt#L1204)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1205](daikon-output.txt#L1205) | [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1205) | Too strong / likely spurious |
| [1206](daikon-output.txt#L1206) | [`this.size one of { 4, 8 }`](daikon-output.txt#L1206) | Too strong / likely spurious |
| [1207](daikon-output.txt#L1207) | [`this.grid != null`](daikon-output.txt#L1207) | Correct but trivial |
| [1208](daikon-output.txt#L1208) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1208) | Too strong / likely spurious |
| [1209](daikon-output.txt#L1209) | [`this.rngStrategy != null`](daikon-output.txt#L1209) | Correct but trivial |
| [1210](daikon-output.txt#L1210) | [`row >= 0`](daikon-output.txt#L1210) | Correct and useful |
| [1211](daikon-output.txt#L1211) | [`col >= 0`](daikon-output.txt#L1211) | Correct and useful |
| [1212](daikon-output.txt#L1212) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1212) | Incorrect |
| [1213](daikon-output.txt#L1213) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1213) | Correct but trivial |
| [1214](daikon-output.txt#L1214) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1214) | Too strong / likely spurious |
| [1215](daikon-output.txt#L1215) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1215) | Correct but trivial |
| [1216](daikon-output.txt#L1216) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1216) | Too strong / likely spurious |
| [1217](daikon-output.txt#L1217) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L1217) | Too strong / likely spurious |
| [1218](daikon-output.txt#L1218) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L1218) | Too strong / likely spurious |
| [1219](daikon-output.txt#L1219) | [`this.winningValue > this.size`](daikon-output.txt#L1219) | Incorrect |
| [1220](daikon-output.txt#L1220) | [`this.winningValue > this.score`](daikon-output.txt#L1220) | Incorrect |
| [1221](daikon-output.txt#L1221) | [`this.winningValue > row`](daikon-output.txt#L1221) | Incorrect |
| [1222](daikon-output.txt#L1222) | [`this.winningValue > col`](daikon-output.txt#L1222) | Incorrect |
| [1223](daikon-output.txt#L1223) | [`this.score % this.size == 0`](daikon-output.txt#L1223) | Too strong / likely spurious |
| [1224](daikon-output.txt#L1224) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L1224) | Too strong / likely spurious |
| [1225](daikon-output.txt#L1225) | [`row <= size(this.grid[])-1`](daikon-output.txt#L1225) | Correct and useful |
| [1226](daikon-output.txt#L1226) | [`col <= size(this.grid[])-1`](daikon-output.txt#L1226) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.validatePosition(int, int):::EXIT`](daikon-output.txt#L1228)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1229](daikon-output.txt#L1229) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L1229) | Correct but trivial |
| [1230](daikon-output.txt#L1230) | [`this.size == orig(this.size)`](daikon-output.txt#L1230) | Correct but trivial |
| [1231](daikon-output.txt#L1231) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L1231) | Correct but trivial |
| [1232](daikon-output.txt#L1232) | [`this.grid == orig(this.grid)`](daikon-output.txt#L1232) | Correct but trivial |
| [1233](daikon-output.txt#L1233) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L1233) | Correct but trivial |
| [1234](daikon-output.txt#L1234) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L1234) | Correct but trivial |
| [1235](daikon-output.txt#L1235) | [`this.score == orig(this.score)`](daikon-output.txt#L1235) | Correct but trivial |
| [1236](daikon-output.txt#L1236) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L1236) | Correct but trivial |
| [1237](daikon-output.txt#L1237) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L1237) | Correct but trivial |
| [1238](daikon-output.txt#L1238) | [`this.winningValue one of { 1024, 2048 }`](daikon-output.txt#L1238) | Too strong / likely spurious |
| [1239](daikon-output.txt#L1239) | [`this.size one of { 4, 8 }`](daikon-output.txt#L1239) | Too strong / likely spurious |
| [1240](daikon-output.txt#L1240) | [`this.grid != null`](daikon-output.txt#L1240) | Correct but trivial |
| [1241](daikon-output.txt#L1241) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L1241) | Too strong / likely spurious |
| [1242](daikon-output.txt#L1242) | [`this.rngStrategy != null`](daikon-output.txt#L1242) | Correct but trivial |
| [1243](daikon-output.txt#L1243) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L1243) | Incorrect |
| [1244](daikon-output.txt#L1244) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L1244) | Correct but trivial |
| [1245](daikon-output.txt#L1245) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L1245) | Too strong / likely spurious |
| [1246](daikon-output.txt#L1246) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L1246) | Incorrect |
| [1247](daikon-output.txt#L1247) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L1247) | Incorrect |
| [1248](daikon-output.txt#L1248) | [`this.winningValue > this.size`](daikon-output.txt#L1248) | Incorrect |
| [1249](daikon-output.txt#L1249) | [`this.winningValue > this.score`](daikon-output.txt#L1249) | Incorrect |
| [1250](daikon-output.txt#L1250) | [`this.winningValue > orig(row)`](daikon-output.txt#L1250) | Incorrect |
| [1251](daikon-output.txt#L1251) | [`this.winningValue > orig(col)`](daikon-output.txt#L1251) | Incorrect |
| [1252](daikon-output.txt#L1252) | [`this.score % this.size == 0`](daikon-output.txt#L1252) | Too strong / likely spurious |
| [1253](daikon-output.txt#L1253) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L1253) | Too strong / likely spurious |
| [1254](daikon-output.txt#L1254) | [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L1254) | Correct but trivial |
| [1255](daikon-output.txt#L1255) | [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L1255) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell:::CLASS`](daikon-output.txt#L1257)
**Kind:** CLASS INVARIANT

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1258](daikon-output.txt#L1258) | [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L1258) | Correct but trivial |
| [1259](daikon-output.txt#L1259) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L1259) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell:::OBJECT`](daikon-output.txt#L1261)
**Kind:** OBJECT INVARIANT

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1262](daikon-output.txt#L1262) | [`this.value >= 0`](daikon-output.txt#L1262) | Correct and useful |
| [1263](daikon-output.txt#L1263) | [`this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1263) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.Cell(int):::ENTER`](daikon-output.txt#L1265)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1266](daikon-output.txt#L1266) | [`value >= 0`](daikon-output.txt#L1266) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.Cell(int):::EXIT`](daikon-output.txt#L1268)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1269](daikon-output.txt#L1269) | [`this.value == orig(value)`](daikon-output.txt#L1269) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1271)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1272](daikon-output.txt#L1272) | [`other != null`](daikon-output.txt#L1272) | Correct but trivial |
| [1273](daikon-output.txt#L1273) | [`other.value >= 0`](daikon-output.txt#L1273) | Correct and useful |
| [1274](daikon-output.txt#L1274) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= other.value`](daikon-output.txt#L1274) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT70`](daikon-output.txt#L1276)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1277](daikon-output.txt#L1277) | [`this.value == ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1277) | Correct but trivial |
| [1278](daikon-output.txt#L1278) | [`this.value == other.value`](daikon-output.txt#L1278) | Correct and useful |
| [1279](daikon-output.txt#L1279) | [`this.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1279) | Correct but trivial |
| [1280](daikon-output.txt#L1280) | [`this.value == orig(other.value)`](daikon-output.txt#L1280) | Correct but trivial |
| [1281](daikon-output.txt#L1281) | [`this.value == 0`](daikon-output.txt#L1281) | Correct but trivial |
| [1282](daikon-output.txt#L1282) | [`return == false`](daikon-output.txt#L1282) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT72`](daikon-output.txt#L1286)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1287](daikon-output.txt#L1287) | [`(return == false)  <==>  (this.value != other.value)`](daikon-output.txt#L1287) | Correct and useful |
| [1288](daikon-output.txt#L1288) | [`(return == true)  <==>  (this.value == other.value)`](daikon-output.txt#L1288) | Correct and useful |
| [1289](daikon-output.txt#L1289) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Cell.EMPTY.value < other.value)`](daikon-output.txt#L1289) | Correct and useful |
| [1290](daikon-output.txt#L1290) | [`(return == true)  ==>  (other.value is a power of 2)`](daikon-output.txt#L1290) | Correct but trivial |
| [1291](daikon-output.txt#L1291) | [`(return == true)  ==>  (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1291) | Correct and useful |
| [1292](daikon-output.txt#L1292) | [`(return == true)  ==>  (this.value is a power of 2)`](daikon-output.txt#L1292) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT72;condition="not(return == true)"`](daikon-output.txt#L1296)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1297](daikon-output.txt#L1297) | [`this.value != other.value`](daikon-output.txt#L1297) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1299)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1300](daikon-output.txt#L1300) | [`this.value == orig(this.value)`](daikon-output.txt#L1300) | Correct but trivial |
| [1301](daikon-output.txt#L1301) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1301) | Correct but trivial |
| [1302](daikon-output.txt#L1302) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1302) | Correct but trivial |
| [1303](daikon-output.txt#L1303) | [`other.value == orig(other.value)`](daikon-output.txt#L1303) | Correct but trivial |
| [1304](daikon-output.txt#L1304) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Cell.EMPTY.value < other.value)`](daikon-output.txt#L1304) | Correct and useful |
| [1305](daikon-output.txt#L1305) | [`(return == true)  ==>  (other.value is a power of 2)`](daikon-output.txt#L1305) | Correct but trivial |
| [1306](daikon-output.txt#L1306) | [`(return == true)  ==>  (this.value == other.value)`](daikon-output.txt#L1306) | Correct and useful |
| [1307](daikon-output.txt#L1307) | [`(return == true)  ==>  (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1307) | Correct and useful |
| [1308](daikon-output.txt#L1308) | [`(return == true)  ==>  (this.value is a power of 2)`](daikon-output.txt#L1308) | Correct but trivial |
| [1309](daikon-output.txt#L1309) | [`other.value >= 0`](daikon-output.txt#L1309) | Correct but trivial |
| [1310](daikon-output.txt#L1310) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= other.value`](daikon-output.txt#L1310) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT;condition="return == true"`](daikon-output.txt#L1312)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1313](daikon-output.txt#L1313) | [`this.value == other.value`](daikon-output.txt#L1313) | Correct and useful |
| [1314](daikon-output.txt#L1314) | [`this.value == orig(other.value)`](daikon-output.txt#L1314) | Correct but trivial |
| [1315](daikon-output.txt#L1315) | [`this.value is a power of 2`](daikon-output.txt#L1315) | Correct but trivial |
| [1316](daikon-output.txt#L1316) | [`return == true`](daikon-output.txt#L1316) | Correct but trivial |
| [1317](daikon-output.txt#L1317) | [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1317) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.canMergeWith(ar.edu.unrc.game2048.Cell):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1319)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1320](daikon-output.txt#L1320) | [`return == false`](daikon-output.txt#L1320) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT114`](daikon-output.txt#L1324)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1325](daikon-output.txt#L1325) | [`orig(this) == orig(o)`](daikon-output.txt#L1325) | Correct and useful |
| [1326](daikon-output.txt#L1326) | [`this.value one of { 0, 2, 4 }`](daikon-output.txt#L1326) | Too strong / likely spurious |
| [1327](daikon-output.txt#L1327) | [`return == true`](daikon-output.txt#L1327) | Correct but trivial |
| [1328](daikon-output.txt#L1328) | [`orig(o) != null`](daikon-output.txt#L1328) | Correct and useful |
| [1329](daikon-output.txt#L1329) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1329) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT116`](daikon-output.txt#L1333)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1334](daikon-output.txt#L1334) | [`this.value one of { 0, 1, 2 }`](daikon-output.txt#L1334) | Too strong / likely spurious |
| [1335](daikon-output.txt#L1335) | [`return == false`](daikon-output.txt#L1335) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT118`](daikon-output.txt#L1339)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1340](daikon-output.txt#L1340) | [`(return == true)  ==>  (this.value one of { 0, 2, 4 })`](daikon-output.txt#L1340) | Too strong / likely spurious |
| [1341](daikon-output.txt#L1341) | [`orig(o) != null`](daikon-output.txt#L1341) | Correct and useful |
| [1342](daikon-output.txt#L1342) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1342) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT`](daikon-output.txt#L1348)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1349](daikon-output.txt#L1349) | [`this.value == orig(this.value)`](daikon-output.txt#L1349) | Correct but trivial |
| [1350](daikon-output.txt#L1350) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1350) | Correct but trivial |
| [1351](daikon-output.txt#L1351) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1351) | Correct but trivial |
| [1352](daikon-output.txt#L1352) | [`(return == true)  ==>  (orig(o) != null)`](daikon-output.txt#L1352) | Correct and useful |
| [1353](daikon-output.txt#L1353) | [`(return == true)  ==>  (orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class)`](daikon-output.txt#L1353) | Correct but trivial |
| [1354](daikon-output.txt#L1354) | [`(return == true)  ==>  (this.value one of { 0, 2, 4 })`](daikon-output.txt#L1354) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT;condition="return == true"`](daikon-output.txt#L1356)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1357](daikon-output.txt#L1357) | [`this.value one of { 0, 2, 4 }`](daikon-output.txt#L1357) | Too strong / likely spurious |
| [1358](daikon-output.txt#L1358) | [`return == true`](daikon-output.txt#L1358) | Too strong / likely spurious |
| [1359](daikon-output.txt#L1359) | [`orig(o) != null`](daikon-output.txt#L1359) | Correct and useful |
| [1360](daikon-output.txt#L1360) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L1360) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.equals(java.lang.Object):::EXIT;condition="not(return == true)"`](daikon-output.txt#L1362)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1363](daikon-output.txt#L1363) | [`return == false`](daikon-output.txt#L1363) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Cell.getValue():::EXIT`](daikon-output.txt#L1367)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1368](daikon-output.txt#L1368) | [`this.value == return`](daikon-output.txt#L1368) | Correct and useful |
| [1369](daikon-output.txt#L1369) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1369) | Correct but trivial |
| [1370](daikon-output.txt#L1370) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1370) | Correct but trivial |
| [1371](daikon-output.txt#L1371) | [`return == orig(this.value)`](daikon-output.txt#L1371) | Correct but trivial |
| [1372](daikon-output.txt#L1372) | [`return >= 0`](daikon-output.txt#L1372) | Correct but trivial |
| [1373](daikon-output.txt#L1373) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= return`](daikon-output.txt#L1373) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT`](daikon-output.txt#L1377)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1378](daikon-output.txt#L1378) | [`this.value == orig(this.value)`](daikon-output.txt#L1378) | Correct but trivial |
| [1379](daikon-output.txt#L1379) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1379) | Correct but trivial |
| [1380](daikon-output.txt#L1380) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1380) | Correct but trivial |
| [1381](daikon-output.txt#L1381) | [`(this.value == 0)  <==>  (return == true)`](daikon-output.txt#L1381) | Correct and useful |
| [1382](daikon-output.txt#L1382) | [`(this.value == 0)  <==>  (this.value == ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1382) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT;condition="return == true"`](daikon-output.txt#L1384)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1385](daikon-output.txt#L1385) | [`this.value == ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1385) | Correct and useful |
| [1386](daikon-output.txt#L1386) | [`this.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1386) | Correct but trivial |
| [1387](daikon-output.txt#L1387) | [`this.value == 0`](daikon-output.txt#L1387) | Correct and useful |
| [1388](daikon-output.txt#L1388) | [`return == true`](daikon-output.txt#L1388) | Correct but trivial |

### [`ar.edu.unrc.game2048.Cell.isEmpty():::EXIT;condition="not(return == true)"`](daikon-output.txt#L1390)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1391](daikon-output.txt#L1391) | [`this.value is a power of 2`](daikon-output.txt#L1391) | Correct and useful |
| [1392](daikon-output.txt#L1392) | [`return == false`](daikon-output.txt#L1392) | Correct but trivial |
| [1393](daikon-output.txt#L1393) | [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1393) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.mergeWith(ar.edu.unrc.game2048.Cell):::ENTER`](daikon-output.txt#L1395)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1396](daikon-output.txt#L1396) | [`this.value == other.value`](daikon-output.txt#L1396) | Correct and useful |
| [1397](daikon-output.txt#L1397) | [`this.value is a power of 2`](daikon-output.txt#L1397) | Correct but trivial |
| [1398](daikon-output.txt#L1398) | [`other != null`](daikon-output.txt#L1398) | Correct but trivial |
| [1399](daikon-output.txt#L1399) | [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1399) | Correct and useful |

### [`ar.edu.unrc.game2048.Cell.mergeWith(ar.edu.unrc.game2048.Cell):::EXIT`](daikon-output.txt#L1401)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1402](daikon-output.txt#L1402) | [`this.value == other.value`](daikon-output.txt#L1402) | Correct but trivial |
| [1403](daikon-output.txt#L1403) | [`this.value == orig(this.value)`](daikon-output.txt#L1403) | Correct but trivial |
| [1404](daikon-output.txt#L1404) | [`this.value == orig(other.value)`](daikon-output.txt#L1404) | Correct but trivial |
| [1405](daikon-output.txt#L1405) | [`ar.edu.unrc.game2048.Cell.EMPTY == orig(ar.edu.unrc.game2048.Cell.EMPTY)`](daikon-output.txt#L1405) | Correct but trivial |
| [1406](daikon-output.txt#L1406) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == orig(ar.edu.unrc.game2048.Cell.EMPTY.value)`](daikon-output.txt#L1406) | Correct but trivial |
| [1407](daikon-output.txt#L1407) | [`this.value is a power of 2`](daikon-output.txt#L1407) | Correct but trivial |
| [1408](daikon-output.txt#L1408) | [`return != null`](daikon-output.txt#L1408) | Correct but trivial |
| [1409](daikon-output.txt#L1409) | [`return.value is a power of 2`](daikon-output.txt#L1409) | Correct but trivial |
| [1410](daikon-output.txt#L1410) | [`this.value > ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L1410) | Correct but trivial |
| [1411](daikon-output.txt#L1411) | [`2 * this.value - return.value == 0`](daikon-output.txt#L1411) | Correct and useful |
| [1412](daikon-output.txt#L1412) | [`this.value < return.value`](daikon-output.txt#L1412) | Correct and useful |
| [1413](daikon-output.txt#L1413) | [`ar.edu.unrc.game2048.Cell.EMPTY.value < return.value`](daikon-output.txt#L1413) | Correct but trivial |

### [`ar.edu.unrc.game2048.MathUtils.isPowerOfTwo(int):::ENTER`](daikon-output.txt#L1429)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1430](daikon-output.txt#L1430) | [`value >= 2`](daikon-output.txt#L1430) | Correct and useful |
| [1431](daikon-output.txt#L1431) | [`value is a power of 2`](daikon-output.txt#L1431) | Correct and useful |

### [`ar.edu.unrc.game2048.MathUtils.isPowerOfTwo(int):::EXIT`](daikon-output.txt#L1433)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [1434](daikon-output.txt#L1434) | [`return == true`](daikon-output.txt#L1434) | Correct but trivial |


# Daikon Invariants Annotation Report

Generated from [`daikon-output.txt`](daikon-output.txt).

## Summary

- **Total Invariants**: 1134
- **Commented**: 1087 (95.9%)
- **Pending**: 47

### Breakdown by Scope Category

- **Object Invariants**: 16 / 17 commented (94.1%)
- **Class Invariants**: 2 / 2 commented (100.0%)
- **Preconditions (ENTER)**: 236 / 240 commented (98.3%)
- **Postconditions (EXIT)**: 833 / 875 commented (95.2%)

## Annotated Invariants by Scope

### [`ar.edu.unrc.game2048.Board:::OBJECT`](daikon-output.txt#L4)
**Kind:** OBJECT INVARIANT

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [6](daikon-output.txt#L6) | [`this.winningValue >= 1`](daikon-output.txt#L6) | Correct but trivial |
| [7](daikon-output.txt#L7) | [`this.winningValue is a power of 2`](daikon-output.txt#L7) | Correct and useful |
| [8](daikon-output.txt#L8) | [`this.size >= 0`](daikon-output.txt#L8) | Correct but trivial |
| [9](daikon-output.txt#L9) | [`this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class`](daikon-output.txt#L9) | Correct but trivial |
| [10](daikon-output.txt#L10) | [`this.grid[] elements != null`](daikon-output.txt#L10) | Correct but trivial |
| [11](daikon-output.txt#L11) | [`this.score >= 0`](daikon-output.txt#L11) | Correct but trivial |
| [12](daikon-output.txt#L12) | [`size(this.grid[]) >= 1`](daikon-output.txt#L12) | Correct but trivial |
| [13](daikon-output.txt#L13) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.winningValue`](daikon-output.txt#L13) | Incorrect |
| [14](daikon-output.txt#L14) | [`this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L14) | Incorrect |
| [15](daikon-output.txt#L15) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.size`](daikon-output.txt#L15) | Too strong / likely spurious |
| [16](daikon-output.txt#L16) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.score`](daikon-output.txt#L16) | Incorrect |
| [17](daikon-output.txt#L17) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= size(this.grid[])`](daikon-output.txt#L17) | Too strong / likely spurious |
| [18](daikon-output.txt#L18) | [`this.winningValue != size(this.grid[])-1`](daikon-output.txt#L18) | Incorrect |
| [19](daikon-output.txt#L19) | [`this.grid.getClass().getName() != this.rngStrategy.getClass().getName()`](daikon-output.txt#L19) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board():::EXIT`](daikon-output.txt#L21)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [22](daikon-output.txt#L22) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L22) | Correct but trivial |
| [23](daikon-output.txt#L23) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L23) | Correct but trivial |
| [24](daikon-output.txt#L24) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L24) | Correct but trivial |
| [25](daikon-output.txt#L25) | [`this.grid != null`](daikon-output.txt#L25) | Correct but trivial |
| [26](daikon-output.txt#L26) | [`this.score == 0`](daikon-output.txt#L26) | Correct but trivial |
| [27](daikon-output.txt#L27) | [`this.rngStrategy != null`](daikon-output.txt#L27) | Incorrect |
| [28](daikon-output.txt#L28) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L28) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.Board):::ENTER`](daikon-output.txt#L30)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [31](daikon-output.txt#L31) | [`other.size == size(other.grid[])`](daikon-output.txt#L31) | Correct but trivial |
| [32](daikon-output.txt#L32) | [`other != null`](daikon-output.txt#L32) | Correct but trivial |
| [33](daikon-output.txt#L33) | [`other.winningValue >= 1`](daikon-output.txt#L33) | Correct but trivial |
| [34](daikon-output.txt#L34) | [`other.winningValue is a power of 2`](daikon-output.txt#L34) | Correct but trivial |
| [35](daikon-output.txt#L35) | [`other.grid != null`](daikon-output.txt#L35) | Correct but trivial |
| [36](daikon-output.txt#L36) | [`other.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class`](daikon-output.txt#L36) | Correct but trivial |
| [37](daikon-output.txt#L37) | [`other.grid[] elements != null`](daikon-output.txt#L37) | Correct but trivial |
| [38](daikon-output.txt#L38) | [`other.score >= 0`](daikon-output.txt#L38) | Correct but trivial |
| [39](daikon-output.txt#L39) | [`other.rngStrategy != null`](daikon-output.txt#L39) | Correct but trivial |
| [40](daikon-output.txt#L40) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != other.winningValue`](daikon-output.txt#L40) | Incorrect |
| [41](daikon-output.txt#L41) | [`other.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L41) | Incorrect |
| [42](daikon-output.txt#L42) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > other.size`](daikon-output.txt#L42) | Too strong / likely spurious |
| [43](daikon-output.txt#L43) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > other.score`](daikon-output.txt#L43) | Incorrect |
| [44](daikon-output.txt#L44) | [`other.winningValue >= other.size`](daikon-output.txt#L44) | Correct but trivial |
| [45](daikon-output.txt#L45) | [`other.grid.getClass().getName() != other.rngStrategy.getClass().getName()`](daikon-output.txt#L45) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.Board):::EXIT`](daikon-output.txt#L47)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [48](daikon-output.txt#L48) | [`this.winningValue == other.winningValue`](daikon-output.txt#L48) | Correct but trivial |
| [49](daikon-output.txt#L49) | [`this.winningValue == orig(other.winningValue)`](daikon-output.txt#L49) | Correct but trivial |
| [50](daikon-output.txt#L50) | [`this.size == other.size`](daikon-output.txt#L50) | Correct but trivial |
| [51](daikon-output.txt#L51) | [`this.size == orig(other.size)`](daikon-output.txt#L51) | Correct but trivial |
| [52](daikon-output.txt#L52) | [`this.size == size(other.grid[])`](daikon-output.txt#L52) | Correct but trivial |
| [53](daikon-output.txt#L53) | [`this.size == orig(size(other.grid[]))`](daikon-output.txt#L53) | Correct but trivial |
| [54](daikon-output.txt#L54) | [`this.grid.getClass().getName() == other.grid.getClass().getName()`](daikon-output.txt#L54) | Correct but trivial |
| [55](daikon-output.txt#L55) | [`this.grid.getClass().getName() == orig(other.grid.getClass().getName())`](daikon-output.txt#L55) | Correct but trivial |
| [56](daikon-output.txt#L56) | [`this.score == other.score`](daikon-output.txt#L56) | Correct but trivial |
| [57](daikon-output.txt#L57) | [`this.score == orig(other.score)`](daikon-output.txt#L57) | Correct but trivial |
| [58](daikon-output.txt#L58) | [`this.rngStrategy == other.rngStrategy`](daikon-output.txt#L58) | Correct but trivial |
| [59](daikon-output.txt#L59) | [`this.rngStrategy == orig(other.rngStrategy)`](daikon-output.txt#L59) | Correct but trivial |
| [60](daikon-output.txt#L60) | [`this.rngStrategy.getClass().getName() == other.rngStrategy.getClass().getName()`](daikon-output.txt#L60) | Correct but trivial |
| [61](daikon-output.txt#L61) | [`this.rngStrategy.getClass().getName() == orig(other.rngStrategy.getClass().getName())`](daikon-output.txt#L61) | Correct but trivial |
| [62](daikon-output.txt#L62) | [`other.grid == orig(other.grid)`](daikon-output.txt#L62) | Correct but trivial |
| [63](daikon-output.txt#L63) | [`other.grid[] == orig(other.grid[])`](daikon-output.txt#L63) | Correct but trivial |
| [64](daikon-output.txt#L64) | [`this.grid != null`](daikon-output.txt#L64) | Correct but trivial |
| [65](daikon-output.txt#L65) | [`this.rngStrategy != null`](daikon-output.txt#L65) | Correct but trivial |
| [66](daikon-output.txt#L66) | [`other.grid != null`](daikon-output.txt#L66) | Correct but trivial |
| [67](daikon-output.txt#L67) | [`other.grid[] elements != null`](daikon-output.txt#L67) | Correct but trivial |
| [68](daikon-output.txt#L68) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L68) | Too strong / likely spurious |
| [69](daikon-output.txt#L69) | [`this.winningValue >= this.size`](daikon-output.txt#L69) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.RNGStrategy, int, int):::ENTER`](daikon-output.txt#L71)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [72](daikon-output.txt#L72) | [`rng != null`](daikon-output.txt#L72) | Correct but trivial |
| [73](daikon-output.txt#L73) | [`size >= 1`](daikon-output.txt#L73) | Correct but trivial |
| [74](daikon-output.txt#L74) | [`winningValue >= 1`](daikon-output.txt#L74) | Correct but trivial |
| [75](daikon-output.txt#L75) | [`winningValue is a power of 2`](daikon-output.txt#L75) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(ar.edu.unrc.game2048.RNGStrategy, int, int):::EXIT`](daikon-output.txt#L77)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [78](daikon-output.txt#L78) | [`this.winningValue == orig(winningValue)`](daikon-output.txt#L78) | Correct but trivial |
| [79](daikon-output.txt#L79) | [`this.size == orig(size)`](daikon-output.txt#L79) | Correct but trivial |
| [80](daikon-output.txt#L80) | [`this.rngStrategy == orig(rng)`](daikon-output.txt#L80) | Correct but trivial |
| [81](daikon-output.txt#L81) | [`this.rngStrategy.getClass().getName() == orig(rng.getClass().getName())`](daikon-output.txt#L81) | Correct but trivial |
| [82](daikon-output.txt#L82) | [`this.size >= 1`](daikon-output.txt#L82) | Correct but trivial |
| [83](daikon-output.txt#L83) | [`this.grid != null`](daikon-output.txt#L83) | Correct but trivial |
| [84](daikon-output.txt#L84) | [`this.score == 0`](daikon-output.txt#L84) | Correct but trivial |
| [85](daikon-output.txt#L85) | [`this.rngStrategy != null`](daikon-output.txt#L85) | Correct but trivial |
| [86](daikon-output.txt#L86) | [`this.winningValue > this.score`](daikon-output.txt#L86) | Incorrect |
| [87](daikon-output.txt#L87) | [`this.score <= size(this.grid[])-1`](daikon-output.txt#L87) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board(int):::EXIT`](daikon-output.txt#L91)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [92](daikon-output.txt#L92) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L92) | Correct but trivial |
| [93](daikon-output.txt#L93) | [`this.size == orig(size)`](daikon-output.txt#L93) | Incorrect |
| [94](daikon-output.txt#L94) | [`this.grid != null`](daikon-output.txt#L94) | Correct but trivial |
| [95](daikon-output.txt#L95) | [`this.score == 0`](daikon-output.txt#L95) | Correct but trivial |
| [96](daikon-output.txt#L96) | [`this.rngStrategy != null`](daikon-output.txt#L96) | Correct but trivial |
| [97](daikon-output.txt#L97) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L97) | Correct but trivial |
| [98](daikon-output.txt#L98) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L98) | Incorrect |
| [99](daikon-output.txt#L99) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L99) | Correct but trivial |
| [100](daikon-output.txt#L100) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L100) | Incorrect |
| [101](daikon-output.txt#L101) | [`this.score < size(this.grid[])-1`](daikon-output.txt#L101) | Incorrect |

### [`ar.edu.unrc.game2048.Board.Board(int, int):::ENTER`](daikon-output.txt#L103)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [104](daikon-output.txt#L104) | [`size >= 1`](daikon-output.txt#L104) | Correct but trivial |
| [105](daikon-output.txt#L105) | [`winningValue >= 1`](daikon-output.txt#L105) | Correct but trivial |
| [106](daikon-output.txt#L106) | [`winningValue is a power of 2`](daikon-output.txt#L106) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.Board(int, int):::EXIT`](daikon-output.txt#L108)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [109](daikon-output.txt#L109) | [`this.winningValue == orig(winningValue)`](daikon-output.txt#L109) | Incorrect |
| [110](daikon-output.txt#L110) | [`this.size == orig(size)`](daikon-output.txt#L110) | Incorrect |
| [111](daikon-output.txt#L111) | [`this.size >= 1`](daikon-output.txt#L111) | Correct but trivial |
| [112](daikon-output.txt#L112) | [`this.grid != null`](daikon-output.txt#L112) | Correct but trivial |
| [113](daikon-output.txt#L113) | [`this.score == 0`](daikon-output.txt#L113) | Correct but trivial |
| [114](daikon-output.txt#L114) | [`this.rngStrategy != null`](daikon-output.txt#L114) | Correct but trivial |
| [115](daikon-output.txt#L115) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L115) | Correct but trivial |
| [116](daikon-output.txt#L116) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L116) | Incorrect |
| [117](daikon-output.txt#L117) | [`this.winningValue > this.score`](daikon-output.txt#L117) | Correct but trivial |
| [118](daikon-output.txt#L118) | [`this.score <= size(this.grid[])-1`](daikon-output.txt#L118) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::ENTER`](daikon-output.txt#L120)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [121](daikon-output.txt#L121) | [`this.size >= 1`](daikon-output.txt#L121) | Correct but trivial |
| [122](daikon-output.txt#L122) | [`this.grid != null`](daikon-output.txt#L122) | Correct but trivial |
| [123](daikon-output.txt#L123) | [`this.rngStrategy != null`](daikon-output.txt#L123) | Correct but trivial |
| [124](daikon-output.txt#L124) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L124) | Too strong / likely spurious |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT507`](daikon-output.txt#L126)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [127](daikon-output.txt#L127) | [`this.score == size(this.grid[])-1`](daikon-output.txt#L127) | Incorrect |
| [128](daikon-output.txt#L128) | [`this.score == orig(size(this.grid[]))-1`](daikon-output.txt#L128) | Incorrect |
| [129](daikon-output.txt#L129) | [`this.grid[this.size-1] == this.grid[this.score]`](daikon-output.txt#L129) | Incorrect |
| [130](daikon-output.txt#L130) | [`orig(this.grid[post(this.size)-1]) == this.grid[this.score]`](daikon-output.txt#L130) | Incorrect |
| [131](daikon-output.txt#L131) | [`this.grid[this.score] == this.grid[orig(this.size)-1]`](daikon-output.txt#L131) | Incorrect |
| [132](daikon-output.txt#L132) | [`this.grid[this.score] == orig(this.grid[this.size-1])`](daikon-output.txt#L132) | Incorrect |
| [133](daikon-output.txt#L133) | [`this.winningValue one of { 1, 2 }`](daikon-output.txt#L133) | Too strong / likely spurious |
| [134](daikon-output.txt#L134) | [`this.size == 1`](daikon-output.txt#L134) | Too strong / likely spurious |
| [135](daikon-output.txt#L135) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L135) | Correct but trivial |
| [136](daikon-output.txt#L136) | [`return == false`](daikon-output.txt#L136) | Incorrect |
| [137](daikon-output.txt#L137) | [`this.grid[] elements == this.grid[this.score]`](daikon-output.txt#L137) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT518`](daikon-output.txt#L141)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [142](daikon-output.txt#L142) | [`return == true`](daikon-output.txt#L142) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT`](daikon-output.txt#L146)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [147](daikon-output.txt#L147) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L147) | Correct but trivial |
| [148](daikon-output.txt#L148) | [`this.size == orig(this.size)`](daikon-output.txt#L148) | Correct but trivial |
| [149](daikon-output.txt#L149) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L149) | Correct but trivial |
| [150](daikon-output.txt#L150) | [`this.grid == orig(this.grid)`](daikon-output.txt#L150) | Correct but trivial |
| [151](daikon-output.txt#L151) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L151) | Correct but trivial |
| [152](daikon-output.txt#L152) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L152) | Correct but trivial |
| [153](daikon-output.txt#L153) | [`this.score == orig(this.score)`](daikon-output.txt#L153) | Correct but trivial |
| [154](daikon-output.txt#L154) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L154) | Correct but trivial |
| [155](daikon-output.txt#L155) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L155) | Correct but trivial |
| [156](daikon-output.txt#L156) | [`(return == false)  ==>  (this.grid[] elements == orig(this.grid[post(this.score)]))`](daikon-output.txt#L156) | Incorrect |
| [157](daikon-output.txt#L157) | [`(return == false)  ==>  (this.grid[] elements == orig(this.grid[this.score]))`](daikon-output.txt#L157) | Incorrect |
| [158](daikon-output.txt#L158) | [`(return == false)  ==>  (this.grid[] elements == this.grid[orig(this.score)])`](daikon-output.txt#L158) | Incorrect |
| [159](daikon-output.txt#L159) | [`(return == false)  ==>  (this.grid[] elements == this.grid[this.score])`](daikon-output.txt#L159) | Incorrect |
| [160](daikon-output.txt#L160) | [`(return == false)  ==>  (this.grid[] elements == this.grid[this.size-1])`](daikon-output.txt#L160) | Incorrect |
| [161](daikon-output.txt#L161) | [`(return == false)  ==>  (this.grid[this.size-1] == this.grid[this.score])`](daikon-output.txt#L161) | Incorrect |
| [162](daikon-output.txt#L162) | [`(return == false)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L162) | Correct but trivial |
| [163](daikon-output.txt#L163) | [`(return == false)  ==>  (this.score == size(this.grid[])-1)`](daikon-output.txt#L163) | Incorrect |
| [164](daikon-output.txt#L164) | [`(return == false)  ==>  (this.size == 1)`](daikon-output.txt#L164) | Too strong / likely spurious |
| [165](daikon-output.txt#L165) | [`(return == false)  ==>  (this.winningValue one of { 1, 2 })`](daikon-output.txt#L165) | Too strong / likely spurious |
| [166](daikon-output.txt#L166) | [`this.size >= 1`](daikon-output.txt#L166) | Correct but trivial |
| [167](daikon-output.txt#L167) | [`this.grid != null`](daikon-output.txt#L167) | Correct but trivial |
| [168](daikon-output.txt#L168) | [`this.rngStrategy != null`](daikon-output.txt#L168) | Correct but trivial |
| [169](daikon-output.txt#L169) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L169) | Incorrect |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT;condition="return == true"`](daikon-output.txt#L171)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [172](daikon-output.txt#L172) | [`return == true`](daikon-output.txt#L172) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.addRandomTile():::EXIT;condition="not(return == true)"`](daikon-output.txt#L174)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [175](daikon-output.txt#L175) | [`this.score == size(this.grid[])-1`](daikon-output.txt#L175) | Incorrect |
| [176](daikon-output.txt#L176) | [`this.score == orig(size(this.grid[]))-1`](daikon-output.txt#L176) | Incorrect |
| [177](daikon-output.txt#L177) | [`this.grid[this.size-1] == this.grid[this.score]`](daikon-output.txt#L177) | Incorrect |
| [178](daikon-output.txt#L178) | [`orig(this.grid[post(this.size)-1]) == this.grid[this.score]`](daikon-output.txt#L178) | Incorrect |
| [179](daikon-output.txt#L179) | [`this.grid[this.score] == this.grid[orig(this.size)-1]`](daikon-output.txt#L179) | Incorrect |
| [180](daikon-output.txt#L180) | [`this.grid[this.score] == orig(this.grid[this.size-1])`](daikon-output.txt#L180) | Incorrect |
| [181](daikon-output.txt#L181) | [`this.winningValue one of { 1, 2 }`](daikon-output.txt#L181) | Too strong / likely spurious |
| [182](daikon-output.txt#L182) | [`this.size == 1`](daikon-output.txt#L182) | Too strong / likely spurious |
| [183](daikon-output.txt#L183) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L183) | Correct but trivial |
| [184](daikon-output.txt#L184) | [`return == false`](daikon-output.txt#L184) | Correct but trivial |
| [185](daikon-output.txt#L185) | [`this.grid[] elements == this.grid[this.score]`](daikon-output.txt#L185) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::ENTER`](daikon-output.txt#L187)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [188](daikon-output.txt#L188) | [`this.grid != null`](daikon-output.txt#L188) | Correct but trivial |
| [189](daikon-output.txt#L189) | [`this.rngStrategy != null`](daikon-output.txt#L189) | Correct but trivial |
| [190](daikon-output.txt#L190) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L190) | Too strong / likely spurious |
| [191](daikon-output.txt#L191) | [`this.winningValue >= this.size`](daikon-output.txt#L191) | Correct but trivial |
| [192](daikon-output.txt#L192) | [`this.grid.getClass().getName() != o.getClass().getName()`](daikon-output.txt#L192) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT533`](daikon-output.txt#L194)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [195](daikon-output.txt#L195) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L195) | Too strong / likely spurious |
| [196](daikon-output.txt#L196) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L196) | Too strong / likely spurious |
| [197](daikon-output.txt#L197) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L197) | Too strong / likely spurious |
| [198](daikon-output.txt#L198) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L198) | Too strong / likely spurious |
| [199](daikon-output.txt#L199) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L199) | Too strong / likely spurious |
| [200](daikon-output.txt#L200) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L200) | Too strong / likely spurious |
| [201](daikon-output.txt#L201) | [`orig(this) == orig(o)`](daikon-output.txt#L201) | Incorrect |
| [202](daikon-output.txt#L202) | [`this.score == 0`](daikon-output.txt#L202) | Incorrect |
| [203](daikon-output.txt#L203) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L203) | Incorrect |
| [204](daikon-output.txt#L204) | [`return == true`](daikon-output.txt#L204) | Incorrect |
| [205](daikon-output.txt#L205) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L205) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT535`](daikon-output.txt#L209)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [210](daikon-output.txt#L210) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L210) | Too strong / likely spurious |
| [211](daikon-output.txt#L211) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L211) | Too strong / likely spurious |
| [212](daikon-output.txt#L212) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L212) | Too strong / likely spurious |
| [213](daikon-output.txt#L213) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L213) | Too strong / likely spurious |
| [214](daikon-output.txt#L214) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L214) | Too strong / likely spurious |
| [215](daikon-output.txt#L215) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L215) | Too strong / likely spurious |
| [216](daikon-output.txt#L216) | [`this.score one of { 0, 4, 16 }`](daikon-output.txt#L216) | Too strong / likely spurious |
| [217](daikon-output.txt#L217) | [`return == false`](daikon-output.txt#L217) | Incorrect |
| [218](daikon-output.txt#L218) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L218) | Incorrect |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT537`](daikon-output.txt#L222)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [223](daikon-output.txt#L223) | [`(return == true)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L223) | Incorrect |
| [224](daikon-output.txt#L224) | [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L224) | Correct but trivial |
| [225](daikon-output.txt#L225) | [`orig(o) != null`](daikon-output.txt#L225) | Incorrect |
| [226](daikon-output.txt#L226) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L226) | Correct but trivial |
| [227](daikon-output.txt#L227) | [`this.rngStrategy.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L227) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT`](daikon-output.txt#L233)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [234](daikon-output.txt#L234) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L234) | Correct but trivial |
| [235](daikon-output.txt#L235) | [`this.size == orig(this.size)`](daikon-output.txt#L235) | Correct but trivial |
| [236](daikon-output.txt#L236) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L236) | Correct but trivial |
| [237](daikon-output.txt#L237) | [`this.grid == orig(this.grid)`](daikon-output.txt#L237) | Correct but trivial |
| [238](daikon-output.txt#L238) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L238) | Correct but trivial |
| [239](daikon-output.txt#L239) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L239) | Correct but trivial |
| [240](daikon-output.txt#L240) | [`this.score == orig(this.score)`](daikon-output.txt#L240) | Correct but trivial |
| [241](daikon-output.txt#L241) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L241) | Correct but trivial |
| [242](daikon-output.txt#L242) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L242) | Correct but trivial |
| [243](daikon-output.txt#L243) | [`(return == true)  ==>  (orig(o) != null)`](daikon-output.txt#L243) | Correct but trivial |
| [244](daikon-output.txt#L244) | [`(return == true)  ==>  (orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class)`](daikon-output.txt#L244) | Correct but trivial |
| [245](daikon-output.txt#L245) | [`(return == true)  ==>  (this.rngStrategy.getClass().getName() != orig(o.getClass().getName()))`](daikon-output.txt#L245) | Correct but trivial |
| [246](daikon-output.txt#L246) | [`(return == true)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L246) | Incorrect |
| [247](daikon-output.txt#L247) | [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L247) | Correct but trivial |
| [248](daikon-output.txt#L248) | [`this.grid != null`](daikon-output.txt#L248) | Correct but trivial |
| [249](daikon-output.txt#L249) | [`this.rngStrategy != null`](daikon-output.txt#L249) | Correct but trivial |
| [250](daikon-output.txt#L250) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L250) | Too strong / likely spurious |
| [251](daikon-output.txt#L251) | [`this.winningValue >= this.size`](daikon-output.txt#L251) | Correct but trivial |
| [252](daikon-output.txt#L252) | [`this.grid.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L252) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT;condition="return == true"`](daikon-output.txt#L254)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [255](daikon-output.txt#L255) | [`return == true`](daikon-output.txt#L255) | Correct but trivial |
| [256](daikon-output.txt#L256) | [`orig(o) != null`](daikon-output.txt#L256) | Correct but trivial |
| [257](daikon-output.txt#L257) | [`orig(o.getClass().getName()) == ar.edu.unrc.game2048.Board.class`](daikon-output.txt#L257) | Correct but trivial |
| [258](daikon-output.txt#L258) | [`this.winningValue != this.score`](daikon-output.txt#L258) | Incorrect |
| [259](daikon-output.txt#L259) | [`this.rngStrategy.getClass().getName() != orig(o.getClass().getName())`](daikon-output.txt#L259) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.equals(java.lang.Object):::EXIT;condition="not(return == true)"`](daikon-output.txt#L261)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [262](daikon-output.txt#L262) | [`return == false`](daikon-output.txt#L262) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getCell(int, int):::ENTER`](daikon-output.txt#L264)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [265](daikon-output.txt#L265) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L265) | Too strong / likely spurious |
| [266](daikon-output.txt#L266) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L266) | Too strong / likely spurious |
| [267](daikon-output.txt#L267) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L267) | Too strong / likely spurious |
| [268](daikon-output.txt#L268) | [`this.grid != null`](daikon-output.txt#L268) | Correct but trivial |
| [269](daikon-output.txt#L269) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L269) | Too strong / likely spurious |
| [270](daikon-output.txt#L270) | [`this.rngStrategy != null`](daikon-output.txt#L270) | Correct but trivial |
| [271](daikon-output.txt#L271) | [`row >= 0`](daikon-output.txt#L271) | Correct but trivial |
| [272](daikon-output.txt#L272) | [`col >= 0`](daikon-output.txt#L272) | Correct but trivial |
| [273](daikon-output.txt#L273) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > row`](daikon-output.txt#L273) | Correct but trivial |
| [274](daikon-output.txt#L274) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > col`](daikon-output.txt#L274) | Correct but trivial |
| [275](daikon-output.txt#L275) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L275) | Incorrect |
| [276](daikon-output.txt#L276) | [`row <= size(this.grid[])-1`](daikon-output.txt#L276) | Correct but trivial |
| [277](daikon-output.txt#L277) | [`col <= size(this.grid[])-1`](daikon-output.txt#L277) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getCell(int, int):::EXIT`](daikon-output.txt#L279)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [280](daikon-output.txt#L280) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L280) | Too strong / likely spurious |
| [281](daikon-output.txt#L281) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L281) | Too strong / likely spurious |
| [282](daikon-output.txt#L282) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L282) | Too strong / likely spurious |
| [283](daikon-output.txt#L283) | [`this.grid == orig(this.grid)`](daikon-output.txt#L283) | Correct but trivial |
| [284](daikon-output.txt#L284) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L284) | Correct but trivial |
| [285](daikon-output.txt#L285) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L285) | Correct but trivial |
| [286](daikon-output.txt#L286) | [`this.score == orig(this.score)`](daikon-output.txt#L286) | Correct but trivial |
| [287](daikon-output.txt#L287) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L287) | Correct but trivial |
| [288](daikon-output.txt#L288) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L288) | Correct but trivial |
| [289](daikon-output.txt#L289) | [`this.grid != null`](daikon-output.txt#L289) | Correct but trivial |
| [290](daikon-output.txt#L290) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L290) | Too strong / likely spurious |
| [291](daikon-output.txt#L291) | [`this.rngStrategy != null`](daikon-output.txt#L291) | Correct but trivial |
| [292](daikon-output.txt#L292) | [`return != null`](daikon-output.txt#L292) | Correct but trivial |
| [293](daikon-output.txt#L293) | [`return.value >= 0`](daikon-output.txt#L293) | Correct but trivial |
| [294](daikon-output.txt#L294) | [`ar.edu.unrc.game2048.Cell.EMPTY != null`](daikon-output.txt#L294) | Correct but trivial |
| [295](daikon-output.txt#L295) | [`ar.edu.unrc.game2048.Cell.EMPTY.value == 0`](daikon-output.txt#L295) | Correct but trivial |
| [296](daikon-output.txt#L296) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return.value`](daikon-output.txt#L296) | Too strong / likely spurious |
| [297](daikon-output.txt#L297) | [`this.score >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L297) | Correct but trivial |
| [298](daikon-output.txt#L298) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L298) | Correct but trivial |
| [299](daikon-output.txt#L299) | [`return.value >= ar.edu.unrc.game2048.Cell.EMPTY.value`](daikon-output.txt#L299) | Correct but trivial |
| [300](daikon-output.txt#L300) | [`return.value != size(this.grid[])-1`](daikon-output.txt#L300) | Correct but trivial |
| [301](daikon-output.txt#L301) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(row)`](daikon-output.txt#L301) | Correct but trivial |
| [302](daikon-output.txt#L302) | [`ar.edu.unrc.game2048.Cell.EMPTY.value <= orig(col)`](daikon-output.txt#L302) | Correct but trivial |
| [303](daikon-output.txt#L303) | [`orig(row) <= size(this.grid[])-1`](daikon-output.txt#L303) | Correct but trivial |
| [304](daikon-output.txt#L304) | [`orig(col) <= size(this.grid[])-1`](daikon-output.txt#L304) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getEmptyPositions():::ENTER`](daikon-output.txt#L306)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [307](daikon-output.txt#L307) | [`this.size >= 1`](daikon-output.txt#L307) | Correct but trivial |
| [308](daikon-output.txt#L308) | [`this.grid != null`](daikon-output.txt#L308) | Correct but trivial |
| [309](daikon-output.txt#L309) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L309) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getEmptyPositions():::EXIT`](daikon-output.txt#L311)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [312](daikon-output.txt#L312) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L312) | Correct but trivial |
| [313](daikon-output.txt#L313) | [`this.size == orig(this.size)`](daikon-output.txt#L313) | Correct but trivial |
| [314](daikon-output.txt#L314) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L314) | Correct but trivial |
| [315](daikon-output.txt#L315) | [`this.grid == orig(this.grid)`](daikon-output.txt#L315) | Correct but trivial |
| [316](daikon-output.txt#L316) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L316) | Correct but trivial |
| [317](daikon-output.txt#L317) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L317) | Correct but trivial |
| [318](daikon-output.txt#L318) | [`this.score == orig(this.score)`](daikon-output.txt#L318) | Correct but trivial |
| [319](daikon-output.txt#L319) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L319) | Correct but trivial |
| [320](daikon-output.txt#L320) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L320) | Correct but trivial |
| [321](daikon-output.txt#L321) | [`this.size >= 1`](daikon-output.txt#L321) | Correct but trivial |
| [322](daikon-output.txt#L322) | [`this.grid != null`](daikon-output.txt#L322) | Correct but trivial |
| [323](daikon-output.txt#L323) | [`return != null`](daikon-output.txt#L323) | Correct but trivial |
| [324](daikon-output.txt#L324) | [`return.getClass().getName() == java.util.HashSet.class`](daikon-output.txt#L324) | Correct but trivial |
| [325](daikon-output.txt#L325) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L325) | Too strong / likely spurious |
| [326](daikon-output.txt#L326) | [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L326) | Correct but trivial |
| [327](daikon-output.txt#L327) | [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L327) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.getScore():::ENTER`](daikon-output.txt#L329)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [330](daikon-output.txt#L330) | [`this.grid != null`](daikon-output.txt#L330) | Correct but trivial |
| [331](daikon-output.txt#L331) | [`this.rngStrategy != null`](daikon-output.txt#L331) | Correct but trivial |
| [332](daikon-output.txt#L332) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L332) | Correct but trivial |
| [333](daikon-output.txt#L333) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L333) | Incorrect |
| [334](daikon-output.txt#L334) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L334) | Correct but trivial |
| [335](daikon-output.txt#L335) | [`this.winningValue >= this.size`](daikon-output.txt#L335) | Correct but trivial |
| [336](daikon-output.txt#L336) | [`this.winningValue != this.score`](daikon-output.txt#L336) | Correct but trivial |
| [337](daikon-output.txt#L337) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L337) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getScore():::EXIT`](daikon-output.txt#L339)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [340](daikon-output.txt#L340) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L340) | Correct but trivial |
| [341](daikon-output.txt#L341) | [`this.size == orig(this.size)`](daikon-output.txt#L341) | Correct but trivial |
| [342](daikon-output.txt#L342) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L342) | Correct but trivial |
| [343](daikon-output.txt#L343) | [`this.grid == orig(this.grid)`](daikon-output.txt#L343) | Correct but trivial |
| [344](daikon-output.txt#L344) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L344) | Correct but trivial |
| [345](daikon-output.txt#L345) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L345) | Correct but trivial |
| [346](daikon-output.txt#L346) | [`this.score == return`](daikon-output.txt#L346) | Correct but trivial |
| [347](daikon-output.txt#L347) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L347) | Correct but trivial |
| [348](daikon-output.txt#L348) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L348) | Correct but trivial |
| [349](daikon-output.txt#L349) | [`return == orig(this.score)`](daikon-output.txt#L349) | Correct but trivial |
| [350](daikon-output.txt#L350) | [`this.grid != null`](daikon-output.txt#L350) | Correct but trivial |
| [351](daikon-output.txt#L351) | [`this.rngStrategy != null`](daikon-output.txt#L351) | Correct but trivial |
| [352](daikon-output.txt#L352) | [`return >= 0`](daikon-output.txt#L352) | Correct but trivial |
| [353](daikon-output.txt#L353) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L353) | Correct but trivial |
| [354](daikon-output.txt#L354) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L354) | Incorrect |
| [355](daikon-output.txt#L355) | [`return % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L355) | Incorrect |
| [356](daikon-output.txt#L356) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L356) | Too strong / likely spurious |
| [357](daikon-output.txt#L357) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return`](daikon-output.txt#L357) | Too strong / likely spurious |
| [358](daikon-output.txt#L358) | [`this.winningValue >= this.size`](daikon-output.txt#L358) | Correct but trivial |
| [359](daikon-output.txt#L359) | [`this.winningValue != return`](daikon-output.txt#L359) | Correct but trivial |
| [360](daikon-output.txt#L360) | [`return != size(this.grid[])-1`](daikon-output.txt#L360) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getSize():::ENTER`](daikon-output.txt#L362)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [363](daikon-output.txt#L363) | [`this.grid != null`](daikon-output.txt#L363) | Correct but trivial |
| [364](daikon-output.txt#L364) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L364) | Too strong / likely spurious |
| [365](daikon-output.txt#L365) | [`this.rngStrategy != null`](daikon-output.txt#L365) | Correct but trivial |
| [366](daikon-output.txt#L366) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L366) | Incorrect |
| [367](daikon-output.txt#L367) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L367) | Too strong / likely spurious |
| [368](daikon-output.txt#L368) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L368) | Too strong / likely spurious |
| [369](daikon-output.txt#L369) | [`this.winningValue >= this.size`](daikon-output.txt#L369) | Correct but trivial |
| [370](daikon-output.txt#L370) | [`this.winningValue > this.score`](daikon-output.txt#L370) | Incorrect |

### [`ar.edu.unrc.game2048.Board.getSize():::EXIT`](daikon-output.txt#L372)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [373](daikon-output.txt#L373) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L373) | Correct but trivial |
| [374](daikon-output.txt#L374) | [`this.size == return`](daikon-output.txt#L374) | Correct but trivial |
| [375](daikon-output.txt#L375) | [`this.grid == orig(this.grid)`](daikon-output.txt#L375) | Correct but trivial |
| [376](daikon-output.txt#L376) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L376) | Correct but trivial |
| [377](daikon-output.txt#L377) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L377) | Correct but trivial |
| [378](daikon-output.txt#L378) | [`this.score == orig(this.score)`](daikon-output.txt#L378) | Correct but trivial |
| [379](daikon-output.txt#L379) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L379) | Correct but trivial |
| [380](daikon-output.txt#L380) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L380) | Correct but trivial |
| [381](daikon-output.txt#L381) | [`return == orig(this.size)`](daikon-output.txt#L381) | Correct but trivial |
| [382](daikon-output.txt#L382) | [`return == size(this.grid[])`](daikon-output.txt#L382) | Correct but trivial |
| [383](daikon-output.txt#L383) | [`return == orig(size(this.grid[]))`](daikon-output.txt#L383) | Correct but trivial |
| [384](daikon-output.txt#L384) | [`this.grid != null`](daikon-output.txt#L384) | Correct but trivial |
| [385](daikon-output.txt#L385) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L385) | Too strong / likely spurious |
| [386](daikon-output.txt#L386) | [`this.rngStrategy != null`](daikon-output.txt#L386) | Correct but trivial |
| [387](daikon-output.txt#L387) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L387) | Incorrect |
| [388](daikon-output.txt#L388) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L388) | Too strong / likely spurious |
| [389](daikon-output.txt#L389) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > return`](daikon-output.txt#L389) | Too strong / likely spurious |
| [390](daikon-output.txt#L390) | [`this.winningValue > this.score`](daikon-output.txt#L390) | Incorrect |
| [391](daikon-output.txt#L391) | [`this.winningValue >= return`](daikon-output.txt#L391) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::ENTER`](daikon-output.txt#L393)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [394](daikon-output.txt#L394) | [`this.grid != null`](daikon-output.txt#L394) | Correct but trivial |
| [395](daikon-output.txt#L395) | [`this.rngStrategy != null`](daikon-output.txt#L395) | Correct but trivial |
| [396](daikon-output.txt#L396) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L396) | Too strong / likely spurious |
| [397](daikon-output.txt#L397) | [`this.winningValue >= this.size`](daikon-output.txt#L397) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT`](daikon-output.txt#L399)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [400](daikon-output.txt#L400) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L400) | Correct but trivial |
| [401](daikon-output.txt#L401) | [`this.size == orig(this.size)`](daikon-output.txt#L401) | Correct but trivial |
| [402](daikon-output.txt#L402) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L402) | Correct but trivial |
| [403](daikon-output.txt#L403) | [`this.grid == orig(this.grid)`](daikon-output.txt#L403) | Correct but trivial |
| [404](daikon-output.txt#L404) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L404) | Correct but trivial |
| [405](daikon-output.txt#L405) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L405) | Correct but trivial |
| [406](daikon-output.txt#L406) | [`this.score == orig(this.score)`](daikon-output.txt#L406) | Correct but trivial |
| [407](daikon-output.txt#L407) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L407) | Correct but trivial |
| [408](daikon-output.txt#L408) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L408) | Correct but trivial |
| [409](daikon-output.txt#L409) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score)`](daikon-output.txt#L409) | Incorrect |
| [410](daikon-output.txt#L410) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size)`](daikon-output.txt#L410) | Incorrect |
| [411](daikon-output.txt#L411) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE % this.winningValue == 0)`](daikon-output.txt#L411) | Incorrect |
| [412](daikon-output.txt#L412) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue)`](daikon-output.txt#L412) | Incorrect |
| [413](daikon-output.txt#L413) | [`(return == false)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L413) | Incorrect |
| [414](daikon-output.txt#L414) | [`(return == false)  ==>  (this.size != this.score)`](daikon-output.txt#L414) | Incorrect |
| [415](daikon-output.txt#L415) | [`(return == false)  ==>  (this.size one of { 1, 3, 4 })`](daikon-output.txt#L415) | Too strong / likely spurious |
| [416](daikon-output.txt#L416) | [`(return == false)  ==>  (this.winningValue > this.score)`](daikon-output.txt#L416) | Correct but trivial |
| [417](daikon-output.txt#L417) | [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L417) | Correct but trivial |
| [418](daikon-output.txt#L418) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L418) | Too strong / likely spurious |
| [419](daikon-output.txt#L419) | [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L419) | Incorrect |
| [420](daikon-output.txt#L420) | [`this.grid != null`](daikon-output.txt#L420) | Correct but trivial |
| [421](daikon-output.txt#L421) | [`this.rngStrategy != null`](daikon-output.txt#L421) | Correct but trivial |
| [422](daikon-output.txt#L422) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L422) | Too strong / likely spurious |
| [423](daikon-output.txt#L423) | [`this.winningValue >= this.size`](daikon-output.txt#L423) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT;condition="return == true"`](daikon-output.txt#L425)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [426](daikon-output.txt#L426) | [`return == true`](daikon-output.txt#L426) | Correct but trivial |
| [427](daikon-output.txt#L427) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L427) | Too strong / likely spurious |
| [428](daikon-output.txt#L428) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L428) | Incorrect |

### [`ar.edu.unrc.game2048.Board.hasEmptyCells():::EXIT;condition="not(return == true)"`](daikon-output.txt#L430)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [431](daikon-output.txt#L431) | [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L431) | Too strong / likely spurious |
| [432](daikon-output.txt#L432) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L432) | Correct but trivial |
| [433](daikon-output.txt#L433) | [`return == false`](daikon-output.txt#L433) | Correct but trivial |
| [434](daikon-output.txt#L434) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L434) | Too strong / likely spurious |
| [435](daikon-output.txt#L435) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L435) | Incorrect |
| [436](daikon-output.txt#L436) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE % this.winningValue == 0`](daikon-output.txt#L436) | Incorrect |
| [437](daikon-output.txt#L437) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L437) | Too strong / likely spurious |
| [438](daikon-output.txt#L438) | [`this.winningValue > this.score`](daikon-output.txt#L438) | Incorrect |
| [439](daikon-output.txt#L439) | [`this.size != this.score`](daikon-output.txt#L439) | Incorrect |

### [`ar.edu.unrc.game2048.Board.initializeEmpty():::ENTER`](daikon-output.txt#L441)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [442](daikon-output.txt#L442) | [`this.size >= 1`](daikon-output.txt#L442) | Correct but trivial |
| [443](daikon-output.txt#L443) | [`this.grid != null`](daikon-output.txt#L443) | Correct but trivial |
| [444](daikon-output.txt#L444) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L444) | Too strong / likely spurious |
| [445](daikon-output.txt#L445) | [`this.winningValue > this.score`](daikon-output.txt#L445) | Incorrect |

### [`ar.edu.unrc.game2048.Board.initializeEmpty():::EXIT`](daikon-output.txt#L447)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [448](daikon-output.txt#L448) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L448) | Correct but trivial |
| [449](daikon-output.txt#L449) | [`this.size == orig(this.size)`](daikon-output.txt#L449) | Correct but trivial |
| [450](daikon-output.txt#L450) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L450) | Correct but trivial |
| [451](daikon-output.txt#L451) | [`this.grid == orig(this.grid)`](daikon-output.txt#L451) | Correct but trivial |
| [452](daikon-output.txt#L452) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L452) | Correct but trivial |
| [453](daikon-output.txt#L453) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L453) | Correct but trivial |
| [454](daikon-output.txt#L454) | [`this.score == orig(this.score)`](daikon-output.txt#L454) | Correct but trivial |
| [455](daikon-output.txt#L455) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L455) | Correct but trivial |
| [456](daikon-output.txt#L456) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L456) | Correct but trivial |
| [457](daikon-output.txt#L457) | [`this.size >= 1`](daikon-output.txt#L457) | Correct but trivial |
| [458](daikon-output.txt#L458) | [`this.grid != null`](daikon-output.txt#L458) | Correct but trivial |
| [459](daikon-output.txt#L459) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L459) | Too strong / likely spurious |
| [460](daikon-output.txt#L460) | [`this.winningValue > this.score`](daikon-output.txt#L460) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::ENTER`](daikon-output.txt#L462)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [463](daikon-output.txt#L463) | [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L463) | Too strong / likely spurious |
| [464](daikon-output.txt#L464) | [`this.size one of { 1, 4, 32 }`](daikon-output.txt#L464) | Too strong / likely spurious |
| [465](daikon-output.txt#L465) | [`this.grid != null`](daikon-output.txt#L465) | Correct but trivial |
| [466](daikon-output.txt#L466) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L466) | Too strong / likely spurious |
| [467](daikon-output.txt#L467) | [`this.rngStrategy != null`](daikon-output.txt#L467) | Correct but trivial |
| [468](daikon-output.txt#L468) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L468) | Incorrect |
| [469](daikon-output.txt#L469) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L469) | Incorrect |
| [470](daikon-output.txt#L470) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L470) | Incorrect |
| [471](daikon-output.txt#L471) | [`this.winningValue % this.size == 0`](daikon-output.txt#L471) | Incorrect |
| [472](daikon-output.txt#L472) | [`this.winningValue >= this.size`](daikon-output.txt#L472) | Incorrect |
| [473](daikon-output.txt#L473) | [`this.winningValue > this.score`](daikon-output.txt#L473) | Incorrect |
| [474](daikon-output.txt#L474) | [`this.score % this.size == 0`](daikon-output.txt#L474) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT666`](daikon-output.txt#L481)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [482](daikon-output.txt#L482) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L482) | Incorrect |
| [483](daikon-output.txt#L483) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L483) | Incorrect |
| [484](daikon-output.txt#L484) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L484) | Incorrect |
| [485](daikon-output.txt#L485) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L485) | Incorrect |
| [486](daikon-output.txt#L486) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L486) | Incorrect |
| [487](daikon-output.txt#L487) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L487) | Incorrect |
| [488](daikon-output.txt#L488) | [`this.score one of { 0, 4 }`](daikon-output.txt#L488) | Too strong / likely spurious |
| [490](daikon-output.txt#L490) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score`](daikon-output.txt#L490) | Incorrect |
| [491](daikon-output.txt#L491) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L491) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT`](daikon-output.txt#L495)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [496](daikon-output.txt#L496) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L496) | Correct but trivial |
| [497](daikon-output.txt#L497) | [`this.size == orig(this.size)`](daikon-output.txt#L497) | Correct but trivial |
| [498](daikon-output.txt#L498) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L498) | Correct but trivial |
| [499](daikon-output.txt#L499) | [`this.grid == orig(this.grid)`](daikon-output.txt#L499) | Correct but trivial |
| [500](daikon-output.txt#L500) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L500) | Correct but trivial |
| [501](daikon-output.txt#L501) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L501) | Correct but trivial |
| [502](daikon-output.txt#L502) | [`this.score == orig(this.score)`](daikon-output.txt#L502) | Correct but trivial |
| [503](daikon-output.txt#L503) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L503) | Correct but trivial |
| [504](daikon-output.txt#L504) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L504) | Correct but trivial |
| [505](daikon-output.txt#L505) | [`(return == false)  ==>  (this.score one of { 0, 4, 8 })`](daikon-output.txt#L505) | Too strong / likely spurious |
| [506](daikon-output.txt#L506) | [`(return == false)  ==>  (this.size one of { 1, 4, 32 })`](daikon-output.txt#L506) | Too strong / likely spurious |
| [507](daikon-output.txt#L507) | [`(return == false)  ==>  (this.winningValue one of { 1, 32, 2048 })`](daikon-output.txt#L507) | Too strong / likely spurious |
| [508](daikon-output.txt#L508) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L508) | Incorrect |
| [509](daikon-output.txt#L509) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size)`](daikon-output.txt#L509) | Incorrect |
| [510](daikon-output.txt#L510) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score)`](daikon-output.txt#L510) | Incorrect |
| [511](daikon-output.txt#L511) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue)`](daikon-output.txt#L511) | Incorrect |
| [512](daikon-output.txt#L512) | [`(return == true)  ==>  (this.score != size(this.grid[])-1)`](daikon-output.txt#L512) | Incorrect |
| [513](daikon-output.txt#L513) | [`(return == true)  ==>  (this.score one of { 0, 4 })`](daikon-output.txt#L513) | Too strong / likely spurious |
| [514](daikon-output.txt#L514) | [`(return == true)  ==>  (this.size >= this.score)`](daikon-output.txt#L514) | Correct but trivial |
| [515](daikon-output.txt#L515) | [`(return == true)  ==>  (this.winningValue > this.size)`](daikon-output.txt#L515) | Incorrect |
| [516](daikon-output.txt#L516) | [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L516) | Too strong / likely spurious |
| [517](daikon-output.txt#L517) | [`this.size one of { 1, 4, 32 }`](daikon-output.txt#L517) | Too strong / likely spurious |
| [518](daikon-output.txt#L518) | [`this.grid != null`](daikon-output.txt#L518) | Correct but trivial |
| [519](daikon-output.txt#L519) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L519) | Too strong / likely spurious |
| [520](daikon-output.txt#L520) | [`this.rngStrategy != null`](daikon-output.txt#L520) | Correct but trivial |
| [521](daikon-output.txt#L521) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L521) | Incorrect |
| [522](daikon-output.txt#L522) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L522) | Incorrect |
| [523](daikon-output.txt#L523) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L523) | Incorrect |
| [524](daikon-output.txt#L524) | [`this.winningValue % this.size == 0`](daikon-output.txt#L524) | Incorrect |
| [525](daikon-output.txt#L525) | [`this.winningValue >= this.size`](daikon-output.txt#L525) | Incorrect |
| [526](daikon-output.txt#L526) | [`this.winningValue > this.score`](daikon-output.txt#L526) | Incorrect |
| [527](daikon-output.txt#L527) | [`this.score % this.size == 0`](daikon-output.txt#L527) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isEmpty():::EXIT;condition="return == true"`](daikon-output.txt#L529)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [530](daikon-output.txt#L530) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size`](daikon-output.txt#L530) | Incorrect |
| [531](daikon-output.txt#L531) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(this.size)`](daikon-output.txt#L531) | Incorrect |
| [532](daikon-output.txt#L532) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])`](daikon-output.txt#L532) | Incorrect |
| [533](daikon-output.txt#L533) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE == orig(size(this.grid[]))`](daikon-output.txt#L533) | Incorrect |
| [534](daikon-output.txt#L534) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue`](daikon-output.txt#L534) | Incorrect |
| [535](daikon-output.txt#L535) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == orig(this.winningValue)`](daikon-output.txt#L535) | Incorrect |
| [536](daikon-output.txt#L536) | [`this.score one of { 0, 4 }`](daikon-output.txt#L536) | Too strong / likely spurious |
| [538](daikon-output.txt#L538) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score`](daikon-output.txt#L538) | Incorrect |
| [539](daikon-output.txt#L539) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L539) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::ENTER`](daikon-output.txt#L544)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [545](daikon-output.txt#L545) | [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L545) | Too strong / likely spurious |
| [546](daikon-output.txt#L546) | [`this.grid != null`](daikon-output.txt#L546) | Correct but trivial |
| [547](daikon-output.txt#L547) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L547) | Too strong / likely spurious |
| [548](daikon-output.txt#L548) | [`this.rngStrategy != null`](daikon-output.txt#L548) | Correct but trivial |
| [549](daikon-output.txt#L549) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L549) | Incorrect |
| [550](daikon-output.txt#L550) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L550) | Incorrect |
| [551](daikon-output.txt#L551) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L551) | Incorrect |
| [552](daikon-output.txt#L552) | [`this.winningValue >= this.size`](daikon-output.txt#L552) | Incorrect |
| [553](daikon-output.txt#L553) | [`this.winningValue > this.score`](daikon-output.txt#L553) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT`](daikon-output.txt#L555)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [556](daikon-output.txt#L556) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L556) | Correct but trivial |
| [557](daikon-output.txt#L557) | [`this.size == orig(this.size)`](daikon-output.txt#L557) | Correct but trivial |
| [558](daikon-output.txt#L558) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L558) | Correct but trivial |
| [559](daikon-output.txt#L559) | [`this.grid == orig(this.grid)`](daikon-output.txt#L559) | Correct but trivial |
| [560](daikon-output.txt#L560) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L560) | Correct but trivial |
| [561](daikon-output.txt#L561) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L561) | Correct but trivial |
| [562](daikon-output.txt#L562) | [`this.score == orig(this.score)`](daikon-output.txt#L562) | Correct but trivial |
| [563](daikon-output.txt#L563) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L563) | Correct but trivial |
| [564](daikon-output.txt#L564) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L564) | Correct but trivial |
| [565](daikon-output.txt#L565) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L565) | Incorrect |
| [566](daikon-output.txt#L566) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size)`](daikon-output.txt#L566) | Incorrect |
| [567](daikon-output.txt#L567) | [`(return == false)  ==>  (this.score != size(this.grid[])-1)`](daikon-output.txt#L567) | Incorrect |
| [568](daikon-output.txt#L568) | [`(return == false)  ==>  (this.score one of { 0, 4, 8 })`](daikon-output.txt#L568) | Too strong / likely spurious |
| [569](daikon-output.txt#L569) | [`(return == false)  ==>  (this.size one of { 4, 28, 32 })`](daikon-output.txt#L569) | Too strong / likely spurious |
| [570](daikon-output.txt#L570) | [`(return == false)  ==>  (this.winningValue one of { 32, 2048 })`](daikon-output.txt#L570) | Too strong / likely spurious |
| [571](daikon-output.txt#L571) | [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L571) | Incorrect |
| [572](daikon-output.txt#L572) | [`(return == true)  ==>  (this.score == 0)`](daikon-output.txt#L572) | Incorrect |
| [573](daikon-output.txt#L573) | [`(return == true)  ==>  (this.size one of { 1, 4 })`](daikon-output.txt#L573) | Too strong / likely spurious |
| [574](daikon-output.txt#L574) | [`(return == true)  ==>  (this.winningValue one of { 1, 2048 })`](daikon-output.txt#L574) | Too strong / likely spurious |
| [575](daikon-output.txt#L575) | [`this.winningValue one of { 1, 32, 2048 }`](daikon-output.txt#L575) | Too strong / likely spurious |
| [576](daikon-output.txt#L576) | [`this.grid != null`](daikon-output.txt#L576) | Correct but trivial |
| [577](daikon-output.txt#L577) | [`this.score one of { 0, 4, 8 }`](daikon-output.txt#L577) | Too strong / likely spurious |
| [578](daikon-output.txt#L578) | [`this.rngStrategy != null`](daikon-output.txt#L578) | Correct but trivial |
| [579](daikon-output.txt#L579) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1`](daikon-output.txt#L579) | Incorrect |
| [580](daikon-output.txt#L580) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L580) | Incorrect |
| [581](daikon-output.txt#L581) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L581) | Incorrect |
| [582](daikon-output.txt#L582) | [`this.winningValue >= this.size`](daikon-output.txt#L582) | Incorrect |
| [583](daikon-output.txt#L583) | [`this.winningValue > this.score`](daikon-output.txt#L583) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT;condition="return == true"`](daikon-output.txt#L585)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [586](daikon-output.txt#L586) | [`this.winningValue one of { 1, 2048 }`](daikon-output.txt#L586) | Too strong / likely spurious |
| [587](daikon-output.txt#L587) | [`this.size one of { 1, 4 }`](daikon-output.txt#L587) | Too strong / likely spurious |
| [588](daikon-output.txt#L588) | [`this.score == 0`](daikon-output.txt#L588) | Incorrect |
| [589](daikon-output.txt#L589) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L589) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isFull():::EXIT;condition="not(return == true)"`](daikon-output.txt#L592)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [593](daikon-output.txt#L593) | [`this.winningValue one of { 32, 2048 }`](daikon-output.txt#L593) | Too strong / likely spurious |
| [594](daikon-output.txt#L594) | [`this.size one of { 4, 28, 32 }`](daikon-output.txt#L594) | Too strong / likely spurious |
| [596](daikon-output.txt#L596) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L596) | Incorrect |
| [597](daikon-output.txt#L597) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE <= this.size`](daikon-output.txt#L597) | Incorrect |
| [598](daikon-output.txt#L598) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L598) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::ENTER`](daikon-output.txt#L600)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [601](daikon-output.txt#L601) | [`this.grid != null`](daikon-output.txt#L601) | Correct but trivial |
| [602](daikon-output.txt#L602) | [`this.rngStrategy != null`](daikon-output.txt#L602) | Correct but trivial |
| [603](daikon-output.txt#L603) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L603) | Incorrect |
| [604](daikon-output.txt#L604) | [`this.winningValue >= this.size`](daikon-output.txt#L604) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT280`](daikon-output.txt#L606)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [608](daikon-output.txt#L608) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L608) | Incorrect |
| [609](daikon-output.txt#L609) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L609) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT289`](daikon-output.txt#L613)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [614](daikon-output.txt#L614) | [`this.winningValue one of { 256, 512, 2048 }`](daikon-output.txt#L614) | Too strong / likely spurious |
| [615](daikon-output.txt#L615) | [`this.size one of { 3, 4 }`](daikon-output.txt#L615) | Too strong / likely spurious |
| [616](daikon-output.txt#L616) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L616) | Incorrect |
| [618](daikon-output.txt#L618) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L618) | Incorrect |
| [619](daikon-output.txt#L619) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L619) | Incorrect |
| [620](daikon-output.txt#L620) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L620) | Incorrect |
| [621](daikon-output.txt#L621) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L621) | Incorrect |
| [622](daikon-output.txt#L622) | [`this.winningValue > this.size`](daikon-output.txt#L622) | Incorrect |
| [623](daikon-output.txt#L623) | [`this.winningValue > this.score`](daikon-output.txt#L623) | Incorrect |
| [624](daikon-output.txt#L624) | [`this.size != this.score`](daikon-output.txt#L624) | Incorrect |
| [625](daikon-output.txt#L625) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L625) | Incorrect |
| [626](daikon-output.txt#L626) | [`this.score % size(this.grid[])-1 == 0`](daikon-output.txt#L626) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT293`](daikon-output.txt#L630)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [631](daikon-output.txt#L631) | [`this.winningValue one of { 256, 512, 2048 }`](daikon-output.txt#L631) | Too strong / likely spurious |
| [632](daikon-output.txt#L632) | [`this.size one of { 3, 4 }`](daikon-output.txt#L632) | Too strong / likely spurious |
| [633](daikon-output.txt#L633) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L633) | Correct but trivial |
| [635](daikon-output.txt#L635) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L635) | Incorrect |
| [636](daikon-output.txt#L636) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L636) | Incorrect |
| [637](daikon-output.txt#L637) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L637) | Incorrect |
| [638](daikon-output.txt#L638) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L638) | Incorrect |
| [639](daikon-output.txt#L639) | [`this.winningValue > this.size`](daikon-output.txt#L639) | Incorrect |
| [640](daikon-output.txt#L640) | [`this.winningValue > this.score`](daikon-output.txt#L640) | Incorrect |
| [641](daikon-output.txt#L641) | [`this.size != this.score`](daikon-output.txt#L641) | Incorrect |
| [642](daikon-output.txt#L642) | [`this.score != size(this.grid[])-1`](daikon-output.txt#L642) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT297`](daikon-output.txt#L646)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [647](daikon-output.txt#L647) | [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L647) | Too strong / likely spurious |
| [648](daikon-output.txt#L648) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L648) | Correct but trivial |
| [650](daikon-output.txt#L650) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L650) | Incorrect |
| [651](daikon-output.txt#L651) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L651) | Incorrect |
| [652](daikon-output.txt#L652) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L652) | Incorrect |
| [653](daikon-output.txt#L653) | [`this.winningValue > this.score`](daikon-output.txt#L653) | Incorrect |
| [654](daikon-output.txt#L654) | [`this.size != this.score`](daikon-output.txt#L654) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT`](daikon-output.txt#L658)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [659](daikon-output.txt#L659) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L659) | Correct but trivial |
| [660](daikon-output.txt#L660) | [`this.size == orig(this.size)`](daikon-output.txt#L660) | Correct but trivial |
| [661](daikon-output.txt#L661) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L661) | Correct but trivial |
| [662](daikon-output.txt#L662) | [`this.grid == orig(this.grid)`](daikon-output.txt#L662) | Correct but trivial |
| [663](daikon-output.txt#L663) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L663) | Correct but trivial |
| [664](daikon-output.txt#L664) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L664) | Correct but trivial |
| [665](daikon-output.txt#L665) | [`this.score == orig(this.score)`](daikon-output.txt#L665) | Correct but trivial |
| [666](daikon-output.txt#L666) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L666) | Correct but trivial |
| [667](daikon-output.txt#L667) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L667) | Correct but trivial |
| [668](daikon-output.txt#L668) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L668) | Incorrect |
| [669](daikon-output.txt#L669) | [`(return == false)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L669) | Correct but trivial |
| [670](daikon-output.txt#L670) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score)`](daikon-output.txt#L670) | Incorrect |
| [671](daikon-output.txt#L671) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size)`](daikon-output.txt#L671) | Incorrect |
| [672](daikon-output.txt#L672) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue)`](daikon-output.txt#L672) | Incorrect |
| [673](daikon-output.txt#L673) | [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L673) | Correct but trivial |
| [674](daikon-output.txt#L674) | [`(return == true)  ==>  (this.size != this.score)`](daikon-output.txt#L674) | Incorrect |
| [675](daikon-output.txt#L675) | [`(return == true)  ==>  (this.size one of { 1, 3, 4 })`](daikon-output.txt#L675) | Too strong / likely spurious |
| [676](daikon-output.txt#L676) | [`(return == true)  ==>  (this.winningValue > this.score)`](daikon-output.txt#L676) | Incorrect |
| [677](daikon-output.txt#L677) | [`(return == true)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L677) | Correct but trivial |
| [678](daikon-output.txt#L678) | [`this.grid != null`](daikon-output.txt#L678) | Correct but trivial |
| [679](daikon-output.txt#L679) | [`this.rngStrategy != null`](daikon-output.txt#L679) | Correct but trivial |
| [680](daikon-output.txt#L680) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L680) | Incorrect |
| [681](daikon-output.txt#L681) | [`this.winningValue >= this.size`](daikon-output.txt#L681) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT;condition="return == true"`](daikon-output.txt#L683)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [684](daikon-output.txt#L684) | [`this.size one of { 1, 3, 4 }`](daikon-output.txt#L684) | Too strong / likely spurious |
| [685](daikon-output.txt#L685) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L685) | Correct but trivial |
| [687](daikon-output.txt#L687) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.size`](daikon-output.txt#L687) | Incorrect |
| [688](daikon-output.txt#L688) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.score`](daikon-output.txt#L688) | Incorrect |
| [689](daikon-output.txt#L689) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE >= this.winningValue`](daikon-output.txt#L689) | Incorrect |
| [690](daikon-output.txt#L690) | [`this.winningValue > this.score`](daikon-output.txt#L690) | Incorrect |
| [691](daikon-output.txt#L691) | [`this.size != this.score`](daikon-output.txt#L691) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isLosingBoard():::EXIT;condition="not(return == true)"`](daikon-output.txt#L693)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [695](daikon-output.txt#L695) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L695) | Incorrect |
| [696](daikon-output.txt#L696) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L696) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::ENTER`](daikon-output.txt#L698)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [699](daikon-output.txt#L699) | [`this.grid != null`](daikon-output.txt#L699) | Correct but trivial |
| [700](daikon-output.txt#L700) | [`this.rngStrategy != null`](daikon-output.txt#L700) | Correct but trivial |
| [701](daikon-output.txt#L701) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L701) | Incorrect |
| [702](daikon-output.txt#L702) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L702) | Incorrect |
| [703](daikon-output.txt#L703) | [`this.winningValue >= this.size`](daikon-output.txt#L703) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT264`](daikon-output.txt#L705)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [706](daikon-output.txt#L706) | [`this.winningValue one of { 2, 2048 }`](daikon-output.txt#L706) | Too strong / likely spurious |
| [707](daikon-output.txt#L707) | [`this.size one of { 2, 4 }`](daikon-output.txt#L707) | Too strong / likely spurious |
| [708](daikon-output.txt#L708) | [`this.score one of { 0, 4 }`](daikon-output.txt#L708) | Too strong / likely spurious |
| [709](daikon-output.txt#L709) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L709) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT`](daikon-output.txt#L719)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [720](daikon-output.txt#L720) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L720) | Correct but trivial |
| [721](daikon-output.txt#L721) | [`this.size == orig(this.size)`](daikon-output.txt#L721) | Correct but trivial |
| [722](daikon-output.txt#L722) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L722) | Correct but trivial |
| [723](daikon-output.txt#L723) | [`this.grid == orig(this.grid)`](daikon-output.txt#L723) | Correct but trivial |
| [724](daikon-output.txt#L724) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L724) | Correct but trivial |
| [725](daikon-output.txt#L725) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L725) | Correct but trivial |
| [726](daikon-output.txt#L726) | [`this.score == orig(this.score)`](daikon-output.txt#L726) | Correct but trivial |
| [727](daikon-output.txt#L727) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L727) | Correct but trivial |
| [728](daikon-output.txt#L728) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L728) | Correct but trivial |
| [729](daikon-output.txt#L729) | [`(return == true)  ==>  (this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class)`](daikon-output.txt#L729) | Correct but trivial |
| [730](daikon-output.txt#L730) | [`(return == true)  ==>  (this.score one of { 0, 4 })`](daikon-output.txt#L730) | Too strong / likely spurious |
| [731](daikon-output.txt#L731) | [`(return == true)  ==>  (this.size one of { 2, 4 })`](daikon-output.txt#L731) | Too strong / likely spurious |
| [732](daikon-output.txt#L732) | [`(return == true)  ==>  (this.winningValue one of { 2, 2048 })`](daikon-output.txt#L732) | Too strong / likely spurious |
| [733](daikon-output.txt#L733) | [`this.grid != null`](daikon-output.txt#L733) | Correct but trivial |
| [734](daikon-output.txt#L734) | [`this.rngStrategy != null`](daikon-output.txt#L734) | Correct but trivial |
| [735](daikon-output.txt#L735) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L735) | Incorrect |
| [736](daikon-output.txt#L736) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L736) | Incorrect |
| [737](daikon-output.txt#L737) | [`this.winningValue >= this.size`](daikon-output.txt#L737) | Incorrect |

### [`ar.edu.unrc.game2048.Board.isWinningBoard():::EXIT;condition="return == true"`](daikon-output.txt#L739)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [740](daikon-output.txt#L740) | [`this.winningValue one of { 2, 2048 }`](daikon-output.txt#L740) | Too strong / likely spurious |
| [741](daikon-output.txt#L741) | [`this.size one of { 2, 4 }`](daikon-output.txt#L741) | Too strong / likely spurious |
| [742](daikon-output.txt#L742) | [`this.score one of { 0, 4 }`](daikon-output.txt#L742) | Too strong / likely spurious |
| [743](daikon-output.txt#L743) | [`this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class`](daikon-output.txt#L743) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.mergeAdjacentEqualsCells(java.util.List):::ENTER`](daikon-output.txt#L749)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [750](daikon-output.txt#L750) | [`this.grid != null`](daikon-output.txt#L750) | Correct but trivial |
| [751](daikon-output.txt#L751) | [`this.rngStrategy != null`](daikon-output.txt#L751) | Correct but trivial |
| [752](daikon-output.txt#L752) | [`nonEmpty != null`](daikon-output.txt#L752) | Correct but trivial |
| [753](daikon-output.txt#L753) | [`nonEmpty[] elements != null`](daikon-output.txt#L753) | Correct but trivial |
| [754](daikon-output.txt#L754) | [`nonEmpty[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L754) | Correct but trivial |
| [755](daikon-output.txt#L755) | [`nonEmpty.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L755) | Correct but trivial |
| [756](daikon-output.txt#L756) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(nonEmpty[])-1`](daikon-output.txt#L756) | Correct but trivial |
| [757](daikon-output.txt#L757) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L757) | Incorrect |
| [758](daikon-output.txt#L758) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(nonEmpty[])`](daikon-output.txt#L758) | Incorrect |
| [759](daikon-output.txt#L759) | [`this.winningValue >= this.size`](daikon-output.txt#L759) | Incorrect |
| [760](daikon-output.txt#L760) | [`this.winningValue >= size(nonEmpty[])`](daikon-output.txt#L760) | Incorrect |
| [761](daikon-output.txt#L761) | [`this.size >= size(nonEmpty[])`](daikon-output.txt#L761) | Correct but trivial |
| [762](daikon-output.txt#L762) | [`this.grid.getClass().getName() != nonEmpty.getClass().getName()`](daikon-output.txt#L762) | Correct but trivial |
| [763](daikon-output.txt#L763) | [`this.rngStrategy.getClass().getName() != nonEmpty.getClass().getName()`](daikon-output.txt#L763) | Correct but trivial |
| [764](daikon-output.txt#L764) | [`size(this.grid[])-1 >= size(nonEmpty[])-1`](daikon-output.txt#L764) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.mergeAdjacentEqualsCells(java.util.List):::EXIT`](daikon-output.txt#L766)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [767](daikon-output.txt#L767) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L767) | Correct but trivial |
| [768](daikon-output.txt#L768) | [`this.size == orig(this.size)`](daikon-output.txt#L768) | Correct but trivial |
| [769](daikon-output.txt#L769) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L769) | Correct but trivial |
| [770](daikon-output.txt#L770) | [`this.grid == orig(this.grid)`](daikon-output.txt#L770) | Correct but trivial |
| [771](daikon-output.txt#L771) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L771) | Correct but trivial |
| [772](daikon-output.txt#L772) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L772) | Correct but trivial |
| [773](daikon-output.txt#L773) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L773) | Correct but trivial |
| [774](daikon-output.txt#L774) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L774) | Correct but trivial |
| [775](daikon-output.txt#L775) | [`nonEmpty[] == orig(nonEmpty[])`](daikon-output.txt#L775) | Correct but trivial |
| [776](daikon-output.txt#L776) | [`return.getClass().getName() == orig(nonEmpty.getClass().getName())`](daikon-output.txt#L776) | Correct but trivial |
| [777](daikon-output.txt#L777) | [`this.grid != null`](daikon-output.txt#L777) | Correct but trivial |
| [778](daikon-output.txt#L778) | [`this.rngStrategy != null`](daikon-output.txt#L778) | Correct but trivial |
| [779](daikon-output.txt#L779) | [`nonEmpty[] elements != null`](daikon-output.txt#L779) | Correct but trivial |
| [780](daikon-output.txt#L780) | [`nonEmpty[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L780) | Correct but trivial |
| [781](daikon-output.txt#L781) | [`return != null`](daikon-output.txt#L781) | Correct but trivial |
| [782](daikon-output.txt#L782) | [`return[] elements != null`](daikon-output.txt#L782) | Correct but trivial |
| [783](daikon-output.txt#L783) | [`return[].getClass().getName() elements == ar.edu.unrc.game2048.Cell.class`](daikon-output.txt#L783) | Correct but trivial |
| [784](daikon-output.txt#L784) | [`return.getClass().getName() == java.util.ArrayList.class`](daikon-output.txt#L784) | Correct but trivial |
| [785](daikon-output.txt#L785) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(nonEmpty[])-1`](daikon-output.txt#L785) | Incorrect |
| [786](daikon-output.txt#L786) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(return[])-1`](daikon-output.txt#L786) | Incorrect |
| [787](daikon-output.txt#L787) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L787) | Incorrect |
| [788](daikon-output.txt#L788) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > size(return[])`](daikon-output.txt#L788) | Incorrect |
| [789](daikon-output.txt#L789) | [`this.winningValue >= this.size`](daikon-output.txt#L789) | Incorrect |
| [790](daikon-output.txt#L790) | [`this.winningValue >= size(return[])`](daikon-output.txt#L790) | Incorrect |
| [791](daikon-output.txt#L791) | [`this.winningValue >= orig(size(nonEmpty[]))`](daikon-output.txt#L791) | Incorrect |
| [792](daikon-output.txt#L792) | [`this.size >= size(return[])`](daikon-output.txt#L792) | Correct but trivial |
| [793](daikon-output.txt#L793) | [`this.size >= orig(size(nonEmpty[]))`](daikon-output.txt#L793) | Correct but trivial |
| [794](daikon-output.txt#L794) | [`this.grid.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L794) | Correct but trivial |
| [795](daikon-output.txt#L795) | [`this.score >= orig(this.score)`](daikon-output.txt#L795) | Correct and useful |
| [796](daikon-output.txt#L796) | [`this.rngStrategy.getClass().getName() != return.getClass().getName()`](daikon-output.txt#L796) | Correct but trivial |
| [797](daikon-output.txt#L797) | [`size(this.grid[])-1 >= size(nonEmpty[])-1`](daikon-output.txt#L797) | Correct but trivial |
| [798](daikon-output.txt#L798) | [`size(this.grid[])-1 >= size(return[])-1`](daikon-output.txt#L798) | Correct but trivial |
| [799](daikon-output.txt#L799) | [`size(nonEmpty[])-1 >= size(return[])-1`](daikon-output.txt#L799) | Correct but trivial |
| [800](daikon-output.txt#L800) | [`size(return[]) <= orig(size(nonEmpty[]))`](daikon-output.txt#L800) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveDown():::ENTER`](daikon-output.txt#L802)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [803](daikon-output.txt#L803) | [`this.grid != null`](daikon-output.txt#L803) | Correct but trivial |
| [804](daikon-output.txt#L804) | [`this.rngStrategy != null`](daikon-output.txt#L804) | Correct but trivial |
| [805](daikon-output.txt#L805) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L805) | Incorrect |
| [806](daikon-output.txt#L806) | [`this.winningValue >= this.size`](daikon-output.txt#L806) | Incorrect |
| [807](daikon-output.txt#L807) | [`this.winningValue != this.score`](daikon-output.txt#L807) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveDown():::EXIT`](daikon-output.txt#L809)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [810](daikon-output.txt#L810) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L810) | Correct but trivial |
| [811](daikon-output.txt#L811) | [`this.size == orig(this.size)`](daikon-output.txt#L811) | Correct but trivial |
| [812](daikon-output.txt#L812) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L812) | Correct but trivial |
| [813](daikon-output.txt#L813) | [`this.grid == orig(this.grid)`](daikon-output.txt#L813) | Correct but trivial |
| [814](daikon-output.txt#L814) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L814) | Correct but trivial |
| [815](daikon-output.txt#L815) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L815) | Incorrect |
| [816](daikon-output.txt#L816) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L816) | Correct but trivial |
| [817](daikon-output.txt#L817) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L817) | Correct but trivial |
| [818](daikon-output.txt#L818) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L818) | Correct but trivial |
| [819](daikon-output.txt#L819) | [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L819) | Correct and useful |
| [820](daikon-output.txt#L820) | [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L820) | Correct but trivial |
| [821](daikon-output.txt#L821) | [`this.grid != null`](daikon-output.txt#L821) | Correct but trivial |
| [822](daikon-output.txt#L822) | [`this.rngStrategy != null`](daikon-output.txt#L822) | Correct but trivial |
| [823](daikon-output.txt#L823) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L823) | Incorrect |
| [824](daikon-output.txt#L824) | [`this.winningValue >= this.size`](daikon-output.txt#L824) | Incorrect |
| [825](daikon-output.txt#L825) | [`this.winningValue != this.score`](daikon-output.txt#L825) | Incorrect |
| [826](daikon-output.txt#L826) | [`this.winningValue != orig(this.score)`](daikon-output.txt#L826) | Incorrect |
| [827](daikon-output.txt#L827) | [`this.score >= orig(this.score)`](daikon-output.txt#L827) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveDown():::EXIT;condition="not(return == true)"`](daikon-output.txt#L832)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [833](daikon-output.txt#L833) | [`this.score == orig(this.score)`](daikon-output.txt#L833) | Correct and useful |
| [835](daikon-output.txt#L835) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L835) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::ENTER`](daikon-output.txt#L837)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [838](daikon-output.txt#L838) | [`this.grid != null`](daikon-output.txt#L838) | Correct but trivial |
| [839](daikon-output.txt#L839) | [`this.rngStrategy != null`](daikon-output.txt#L839) | Correct but trivial |
| [840](daikon-output.txt#L840) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L840) | Incorrect |
| [841](daikon-output.txt#L841) | [`this.winningValue >= this.size`](daikon-output.txt#L841) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT`](daikon-output.txt#L843)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [844](daikon-output.txt#L844) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L844) | Correct but trivial |
| [845](daikon-output.txt#L845) | [`this.size == orig(this.size)`](daikon-output.txt#L845) | Correct but trivial |
| [846](daikon-output.txt#L846) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L846) | Correct but trivial |
| [847](daikon-output.txt#L847) | [`this.grid == orig(this.grid)`](daikon-output.txt#L847) | Incorrect |
| [848](daikon-output.txt#L848) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L848) | Correct but trivial |
| [849](daikon-output.txt#L849) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L849) | Incorrect |
| [850](daikon-output.txt#L850) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L850) | Correct but trivial |
| [851](daikon-output.txt#L851) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L851) | Correct but trivial |
| [852](daikon-output.txt#L852) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L852) | Incorrect |
| [853](daikon-output.txt#L853) | [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L853) | Correct and useful |
| [854](daikon-output.txt#L854) | [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L854) | Incorrect |
| [855](daikon-output.txt#L855) | [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L855) | Incorrect |
| [856](daikon-output.txt#L856) | [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L856) | Correct but trivial |
| [857](daikon-output.txt#L857) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L857) | Incorrect |
| [858](daikon-output.txt#L858) | [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L858) | Correct but trivial |
| [859](daikon-output.txt#L859) | [`this.grid != null`](daikon-output.txt#L859) | Correct but trivial |
| [860](daikon-output.txt#L860) | [`this.rngStrategy != null`](daikon-output.txt#L860) | Correct but trivial |
| [861](daikon-output.txt#L861) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L861) | Incorrect |
| [862](daikon-output.txt#L862) | [`this.winningValue >= this.size`](daikon-output.txt#L862) | Incorrect |
| [863](daikon-output.txt#L863) | [`this.score >= orig(this.score)`](daikon-output.txt#L863) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT;condition="return == true"`](daikon-output.txt#L865)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [867](daikon-output.txt#L867) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L867) | Incorrect |
| [868](daikon-output.txt#L868) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L868) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveLeft():::EXIT;condition="not(return == true)"`](daikon-output.txt#L870)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [871](daikon-output.txt#L871) | [`this.score == orig(this.score)`](daikon-output.txt#L871) | Correct and useful |
| [873](daikon-output.txt#L873) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L873) | Incorrect |
| [874](daikon-output.txt#L874) | [`this.winningValue != this.score`](daikon-output.txt#L874) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveRight():::ENTER`](daikon-output.txt#L876)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [877](daikon-output.txt#L877) | [`this.grid != null`](daikon-output.txt#L877) | Correct but trivial |
| [878](daikon-output.txt#L878) | [`this.rngStrategy != null`](daikon-output.txt#L878) | Correct but trivial |
| [879](daikon-output.txt#L879) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L879) | Incorrect |
| [880](daikon-output.txt#L880) | [`this.winningValue >= this.size`](daikon-output.txt#L880) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT`](daikon-output.txt#L882)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [883](daikon-output.txt#L883) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L883) | Correct but trivial |
| [884](daikon-output.txt#L884) | [`this.size == orig(this.size)`](daikon-output.txt#L884) | Correct but trivial |
| [885](daikon-output.txt#L885) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L885) | Correct but trivial |
| [886](daikon-output.txt#L886) | [`this.grid == orig(this.grid)`](daikon-output.txt#L886) | Incorrect |
| [887](daikon-output.txt#L887) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L887) | Correct but trivial |
| [888](daikon-output.txt#L888) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L888) | Incorrect |
| [889](daikon-output.txt#L889) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L889) | Correct but trivial |
| [890](daikon-output.txt#L890) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L890) | Correct but trivial |
| [891](daikon-output.txt#L891) | [`(return == false)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L891) | Incorrect |
| [892](daikon-output.txt#L892) | [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L892) | Correct and useful |
| [893](daikon-output.txt#L893) | [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L893) | Incorrect |
| [894](daikon-output.txt#L894) | [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L894) | Incorrect |
| [895](daikon-output.txt#L895) | [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L895) | Correct but trivial |
| [896](daikon-output.txt#L896) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue)`](daikon-output.txt#L896) | Incorrect |
| [897](daikon-output.txt#L897) | [`(return == true)  ==>  (this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0)`](daikon-output.txt#L897) | Correct but trivial |
| [898](daikon-output.txt#L898) | [`this.grid != null`](daikon-output.txt#L898) | Correct but trivial |
| [899](daikon-output.txt#L899) | [`this.rngStrategy != null`](daikon-output.txt#L899) | Correct but trivial |
| [900](daikon-output.txt#L900) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L900) | Incorrect |
| [901](daikon-output.txt#L901) | [`this.winningValue >= this.size`](daikon-output.txt#L901) | Incorrect |
| [902](daikon-output.txt#L902) | [`this.score >= orig(this.score)`](daikon-output.txt#L902) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT;condition="return == true"`](daikon-output.txt#L904)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [906](daikon-output.txt#L906) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE < this.winningValue`](daikon-output.txt#L906) | Incorrect |
| [907](daikon-output.txt#L907) | [`this.winningValue % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0`](daikon-output.txt#L907) | Correct but trivial |

### [`ar.edu.unrc.game2048.Board.moveRight():::EXIT;condition="not(return == true)"`](daikon-output.txt#L909)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [910](daikon-output.txt#L910) | [`this.score == orig(this.score)`](daikon-output.txt#L910) | Correct and useful |
| [912](daikon-output.txt#L912) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L912) | Incorrect |
| [913](daikon-output.txt#L913) | [`this.winningValue != this.score`](daikon-output.txt#L913) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::ENTER`](daikon-output.txt#L915)
**Kind:** PRECONDITION (ENTER)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [916](daikon-output.txt#L916) | [`this.grid != null`](daikon-output.txt#L916) | Correct but trivial |
| [917](daikon-output.txt#L917) | [`this.rngStrategy != null`](daikon-output.txt#L917) | Correct but trivial |
| [918](daikon-output.txt#L918) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L918) | Incorrect |
| [919](daikon-output.txt#L919) | [`this.winningValue >= this.size`](daikon-output.txt#L919) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT`](daikon-output.txt#L921)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [922](daikon-output.txt#L922) | [`this.winningValue == orig(this.winningValue)`](daikon-output.txt#L922) | Correct but trivial |
| [923](daikon-output.txt#L923) | [`this.size == orig(this.size)`](daikon-output.txt#L923) | Correct but trivial |
| [924](daikon-output.txt#L924) | [`this.size == orig(size(this.grid[]))`](daikon-output.txt#L924) | Correct but trivial |
| [925](daikon-output.txt#L925) | [`this.grid == orig(this.grid)`](daikon-output.txt#L925) | Correct but trivial |
| [926](daikon-output.txt#L926) | [`this.grid.getClass().getName() == orig(this.grid.getClass().getName())`](daikon-output.txt#L926) | Correct but trivial |
| [927](daikon-output.txt#L927) | [`this.grid[] == orig(this.grid[])`](daikon-output.txt#L927) | Incorrect |
| [928](daikon-output.txt#L928) | [`this.rngStrategy == orig(this.rngStrategy)`](daikon-output.txt#L928) | Correct but trivial |
| [929](daikon-output.txt#L929) | [`this.rngStrategy.getClass().getName() == orig(this.rngStrategy.getClass().getName())`](daikon-output.txt#L929) | Correct but trivial |
| [930](daikon-output.txt#L930) | [`(return == false)  ==>  (this.score == orig(this.score))`](daikon-output.txt#L930) | Correct and useful |
| [931](daikon-output.txt#L931) | [`(return == false)  ==>  (this.winningValue != orig(this.score))`](daikon-output.txt#L931) | Incorrect |
| [932](daikon-output.txt#L932) | [`(return == false)  ==>  (this.winningValue != this.score)`](daikon-output.txt#L932) | Incorrect |
| [933](daikon-output.txt#L933) | [`(return == false)  ==>  (this.winningValue >= 1)`](daikon-output.txt#L933) | Correct but trivial |
| [934](daikon-output.txt#L934) | [`(return == true)  ==>  (ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1)`](daikon-output.txt#L934) | Incorrect |
| [935](daikon-output.txt#L935) | [`this.grid != null`](daikon-output.txt#L935) | Correct but trivial |
| [936](daikon-output.txt#L936) | [`this.rngStrategy != null`](daikon-output.txt#L936) | Correct but trivial |
| [937](daikon-output.txt#L937) | [`ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE > this.size`](daikon-output.txt#L937) | Incorrect |
| [938](daikon-output.txt#L938) | [`this.winningValue >= this.size`](daikon-output.txt#L938) | Incorrect |
| [939](daikon-output.txt#L939) | [`this.score >= orig(this.score)`](daikon-output.txt#L939) | Correct and useful |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT;condition="return == true"`](daikon-output.txt#L941)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [943](daikon-output.txt#L943) | [`ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1`](daikon-output.txt#L943) | Incorrect |

### [`ar.edu.unrc.game2048.Board.moveUp():::EXIT;condition="not(return == true)"`](daikon-output.txt#L945)
**Kind:** POSTCONDITION (EXIT)

| Line | Invariant Property | Comment / Analysis |
| :---: | :--- | :--- |
| [946](daikon-output.txt#L946) | [`this.score == orig(this.score)`](daikon-output.txt#L946) | Correct and useful |
| [948](daikon-output.txt#L948) | [`this.winningValue != this.score`](daikon-output.txt#L948) | Incorrect |

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


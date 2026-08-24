package tetris

class PlacementTests extends TetrisTestSuiteBase {

  weightedTest("testPlacementI") {
    checkGame(List(TestFrame(0,
      """.......
        |..IIII.
        |.......
        |.......""")), hint = "See Readme.md for how to place tetrominos")
  }

  weightedTest("testPlacementIEven") {
    checkGame( List(
      TestFrame(0,
        """......
          |.IIII.
          |......
          |......"""),
    ), hint = "See Readme.md for how to place tetrominos")
  }


  weightedTest("testPlacementJ") {
    checkGame( List(
      TestFrame(1,
        """..J....
          |..JJJ..
          |......."""),
    ), hint = "See Readme.md for how to place tetrominos")
  }

  weightedTest("testPlacementL") {
    checkGame( List(
      TestFrame(2,
        """...L..
          |.LLL..
          |......"""),
    ), hint = "See Readme.md for how to place tetrominos")
  }

  weightedTest("testPlacementO") {
    checkGame( List(
      TestFrame(3,
        """...OO..
          |...OO..
          |......."""),
    ), hint = "See Readme.md for how to place tetrominos")
  }

  weightedTest("testPlacementOEven") {
    checkGame( List(
      TestFrame(3,
        """..OO..
          |..OO..
          |......"""),
    ), hint = "See Readme.md for how to place tetrominos")
  }

  weightedTest("testPlacementS") {
    checkGame(  List(
      TestFrame(4,
        """..SS.
          |.SS..
          |....."""),
    ), hint = "See ReadMe.md for how to place tetrominos")
  }

  weightedTest("testPlacementT") {
    checkGame(   List(
      TestFrame(5,
        """...T....
          |..TTT...
          |........"""),
    ), hint = "See ReadMe.md for how to place tetrominos")
  }

  weightedTest("testPlacementZ") {
    checkGame(  List(
      TestFrame(6,
        """.ZZ...
          |..ZZ..
          |......"""),
    ), hint = "See ReadMe.md for how to place tetrominos")
  }
}

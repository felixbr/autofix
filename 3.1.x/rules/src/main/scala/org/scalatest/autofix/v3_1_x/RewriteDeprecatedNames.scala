package org.scalatest.autofix.v3_1_x

import metaconfig.Configured
import scalafix.v1._
import scala.meta._

class RewriteDeprecatedNames extends SemanticRule("RewriteDeprecatedNames") {

  override def fix(implicit doc: SemanticDocument): Patch = {
    val replaceDeprecatedClassesPatch =
      Patch.replaceSymbols(
      "org.scalatest.FunSuiteLike" -> "org.scalatest.funsuite.AnyFunSuiteLike",
      "org.scalatest.FunSuite" -> "org.scalatest.funsuite.AnyFunSuite",
      "org.scalatest.AsyncFunSuiteLike" -> "org.scalatest.funsuite.AsyncFunSuiteLike",
      "org.scalatest.AsyncFunSuite" -> "org.scalatest.funsuite.AsyncFunSuite",
      "org.scalatest.FeatureSpecLike" -> "org.scalatest.featurespec.AnyFeatureSpecLike",
      "org.scalatest.FeatureSpec" -> "org.scalatest.featurespec.AnyFeatureSpec",
      "org.scalatest.AsyncFeatureSpecLike" -> "org.scalatest.featurespec.AsyncFeatureSpecLike",
      "org.scalatest.AsyncFeatureSpec" -> "org.scalatest.featurespec.AsyncFeatureSpec",
      "org.scalatest.FunSpecLike" -> "org.scalatest.funspec.AnyFunSpecLike",
      "org.scalatest.FunSpec" -> "org.scalatest.funspec.AnyFunSpec",
      "org.scalatest.AsyncFunSpecLike" -> "org.scalatest.funspec.AsyncFunSpecLike",
      "org.scalatest.AsyncFunSpec" -> "org.scalatest.funspec.AsyncFunSpec",
      "org.scalatest.FreeSpecLike" -> "org.scalatest.freespec.AnyFreeSpecLike",
      "org.scalatest.FreeSpec" -> "org.scalatest.freespec.AnyFreeSpec",
      "org.scalatest.AsyncFreeSpecLike" -> "org.scalatest.freespec.AsyncFreeSpecLike",
      "org.scalatest.AsyncFreeSpec" -> "org.scalatest.freespec.AsyncFreeSpec",
      "org.scalatest.FlatSpecLike" -> "org.scalatest.flatspec.AnyFlatSpecLike",
      "org.scalatest.FlatSpec" -> "org.scalatest.flatspec.AnyFlatSpec",
      "org.scalatest.AsyncFlatSpecLike" -> "org.scalatest.flatspec.AsyncFlatSpecLike",
      "org.scalatest.AsyncFlatSpec" -> "org.scalatest.flatspec.AsyncFlatSpec",
      "org.scalatest.PropSpecLike" -> "org.scalatest.propspec.AnyPropSpecLike",
      "org.scalatest.PropSpec" -> "org.scalatest.propspec.AnyPropSpec",
      "org.scalatest.WordSpecLike" -> "org.scalatest.wordspec.AnyWordSpecLike",
      "org.scalatest.WordSpec" -> "org.scalatest.wordspec.AnyWordSpec",
      "org.scalatest.AsyncWordSpecLike" -> "org.scalatest.wordspec.AsyncWordSpecLike",
      "org.scalatest.AsyncWordSpec" -> "org.scalatest.wordspec.AsyncWordSpec",
      "org.scalatest.Matchers" -> "org.scalatest.matchers.should.Matchers",
      "org.scalatest.MustMatchers" -> "org.scalatest.matchers.must.Matchers",
      "org.scalatest.DiagrammedAssertions" -> "org.scalatest.diagrams.Diagrams",
      "org.scalatest.path.FreeSpecLike" -> "org.scalatest.freespec.PathAnyFreeSpecLike",
      "org.scalatest.path.FunSpecLike" -> "org.scalatest.funspec.PathAnyFunSpecLike",
      "org.scalatest.path.FreeSpec" -> "org.scalatest.freespec.PathAnyFreeSpec",
      "org.scalatest.path.FunSpec" -> "org.scalatest.funspec.PathAnyFunSpec",
      "org.scalatest.fixture.FunSuiteLike" -> "org.scalatest.funsuite.FixtureAnyFunSuiteLike",
      "org.scalatest.fixture.FunSuite" -> "org.scalatest.funsuite.FixtureAnyFunSuite",
      "org.scalatest.fixture.AsyncFunSuiteLike" -> "org.scalatest.funsuite.FixtureAsyncFunSuiteLike",
      "org.scalatest.fixture.AsyncFunSuite" -> "org.scalatest.funsuite.FixtureAsyncFunSuite",
      "org.scalatest.fixture.FeatureSpecLike" -> "org.scalatest.featurespec.FixtureAnyFeatureSpecLike",
      "org.scalatest.fixture.FeatureSpec" -> "org.scalatest.featurespec.FixtureAnyFeatureSpec",
      "org.scalatest.fixture.AsyncFeatureSpecLike" -> "org.scalatest.featurespec.FixtureAsyncFeatureSpecLike",
      "org.scalatest.fixture.AsyncFeatureSpec" -> "org.scalatest.featurespec.FixtureAsyncFeatureSpec",
      "org.scalatest.fixture.FunSpecLike" -> "org.scalatest.funspec.FixtureAnyFunSpecLike",
      "org.scalatest.fixture.FunSpec" -> "org.scalatest.funspec.FixtureAnyFunSpec",
      "org.scalatest.fixture.AsyncFunSpecLike" -> "org.scalatest.funspec.FixtureAsyncFunSpecLike",
      "org.scalatest.fixture.AsyncFunSpec" -> "org.scalatest.funspec.FixtureAsyncFunSpec",
      "org.scalatest.fixture.FreeSpecLike" -> "org.scalatest.freespec.FixtureAnyFreeSpecLike",
      "org.scalatest.fixture.FreeSpec" -> "org.scalatest.freespec.FixtureAnyFreeSpec",
      "org.scalatest.fixture.AsyncFreeSpecLike" -> "org.scalatest.freespec.FixtureAsyncFreeSpecLike",
      "org.scalatest.fixture.AsyncFreeSpec" -> "org.scalatest.freespec.FixtureAsyncFreeSpec",
      "org.scalatest.fixture.FlatSpecLike" -> "org.scalatest.flatspec.FixtureAnyFlatSpecLike",
      "org.scalatest.fixture.FlatSpec" -> "org.scalatest.flatspec.FixtureAnyFlatSpec",
      "org.scalatest.fixture.AsyncFlatSpecLike" -> "org.scalatest.flatspec.FixtureAsyncFlatSpecLike",
      "org.scalatest.fixture.AsyncFlatSpec" -> "org.scalatest.flatspec.FixtureAsyncFlatSpec",
      "org.scalatest.fixture.PropSpecLike" -> "org.scalatest.propspec.FixtureAnyPropSpecLike",
      "org.scalatest.fixture.PropSpec" -> "org.scalatest.propspec.FixtureAnyPropSpec",
      "org.scalatest.fixture.WordSpec" -> "org.scalatest.wordspec.FixtureAnyWordSpec",
      "org.scalatest.fixture.WordSpecLike" -> "org.scalatest.wordspec.FixtureAnyWordSpecLike",
      "org.scalatest.fixture.AsyncWordSpecLike" -> "org.scalatest.wordspec.FixtureAsyncWordSpecLike",
      "org.scalatest.fixture.AsyncWordSpec" -> "org.scalatest.wordspec.FixtureAsyncWordSpec",
      "org.scalatest.fixture.AsyncTestRegistration" -> "org.scalatest.FixtureAsyncTestRegistration",
      "org.scalatest.fixture.AsyncTestSuite" -> "org.scalatest.FixtureAsyncTestSuite",
      "org.scalatest.fixture.Suite" -> "org.scalatest.FixtureSuite",
      "org.scalatest.fixture.TestRegistration" -> "org.scalatest.FixtureTestRegistration",
      "org.scalatest.fixture.TestSuite" -> "org.scalatest.FixtureTestSuite",
      "org.scalatest.words.BeWord" -> "org.scalatest.matchers.dsl.BeWord",
      "org.scalatest.words.ContainWord" -> "org.scalatest.matchers.dsl.ContainWord",
      "org.scalatest.words.DefinedWord" -> "org.scalatest.matchers.dsl.DefinedWord",
      "org.scalatest.words.EmptyWord" -> "org.scalatest.matchers.dsl.EmptyWord",
      "org.scalatest.words.EndWithWord" -> "org.scalatest.matchers.dsl.EndWithWord",
      "org.scalatest.words.ExistWord" -> "org.scalatest.matchers.dsl.ExistWord",
      "org.scalatest.words.FullyMatchWord" -> "org.scalatest.matchers.dsl.FullyMatchWord",
      "org.scalatest.words.HaveWord" -> "org.scalatest.matchers.dsl.HaveWord",
      "org.scalatest.words.IncludeWord" -> "org.scalatest.matchers.dsl.IncludeWord",
      "org.scalatest.words.LengthWord" -> "org.scalatest.matchers.dsl.LengthWord",
      "org.scalatest.words.MatchPatternWord" -> "org.scalatest.matchers.dsl.MatchPatternWord",
      "org.scalatest.words.MatcherWords" -> "org.scalatest.matchers.dsl.MatcherWords",
      "org.scalatest.words.NoExceptionWord" -> "org.scalatest.matchers.dsl.NoExceptionWord",
      "org.scalatest.words.NotWord" -> "org.scalatest.matchers.dsl.NotWord",
      "org.scalatest.words.PleaseUseNoExceptionShouldSyntaxInstead" -> "org.scalatest.matchers.dsl.PleaseUseNoExceptionShouldSyntaxInstead",
      "org.scalatest.words.ReadableWord" -> "org.scalatest.matchers.dsl.ReadableWord",
      "org.scalatest.words.RegexWithGroups" -> "org.scalatest.matchers.dsl.RegexWithGroups",
      "org.scalatest.words.ResultOfATypeInvocation" -> "org.scalatest.matchers.dsl.ResultOfATypeInvocation",
      "org.scalatest.words.ResultOfAWordToAMatcherApplication" -> "org.scalatest.matchers.dsl.ResultOfAWordToAMatcherApplication",
      "org.scalatest.words.ResultOfAWordToBePropertyMatcherApplication" -> "org.scalatest.matchers.dsl.ResultOfAWordToBePropertyMatcherApplication",
      "org.scalatest.words.ResultOfAWordToSymbolApplication" -> "org.scalatest.matchers.dsl.ResultOfAWordToSymbolApplication",
      "org.scalatest.words.ResultOfAllElementsOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAllElementsOfApplication",
      "org.scalatest.words.ResultOfAllOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAllOfApplication",
      "org.scalatest.words.ResultOfAnTypeInvocation" -> "org.scalatest.matchers.dsl.ResultOfAnTypeInvocation",
      "org.scalatest.words.ResultOfAnWordToAnMatcherApplication" -> "org.scalatest.matchers.dsl.ResultOfAnWordToAnMatcherApplication",
      "org.scalatest.words.ResultOfAnWordToBePropertyMatcherApplication" -> "org.scalatest.matchers.dsl.ResultOfAnWordToBePropertyMatcherApplication",
      "org.scalatest.words.ResultOfAnWordToSymbolApplication" -> "org.scalatest.matchers.dsl.ResultOfAnWordToSymbolApplication",
      "org.scalatest.words.ResultOfAtLeastOneElementOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAtLeastOneElementOfApplication",
      "org.scalatest.words.ResultOfAtLeastOneOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAtLeastOneOfApplication",
      "org.scalatest.words.ResultOfAtMostOneElementOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAtMostOneElementOfApplication",
      "org.scalatest.words.ResultOfAtMostOneOfApplication" -> "org.scalatest.matchers.dsl.ResultOfAtMostOneOfApplication",
      "org.scalatest.words.ResultOfBeThrownBy" -> "org.scalatest.matchers.dsl.ResultOfBeThrownBy",
      "org.scalatest.words.ResultOfBeWordForAType" -> "org.scalatest.matchers.dsl.ResultOfBeWordForAType",
      "org.scalatest.words.ResultOfBeWordForAnType" -> "org.scalatest.matchers.dsl.ResultOfBeWordForAnType",
      "org.scalatest.words.ResultOfBeWordForNoException" -> "org.scalatest.matchers.dsl.ResultOfBeWordForNoException",
      "org.scalatest.words.ResultOfContainWord" -> "org.scalatest.matchers.dsl.ResultOfContainWord",
      "org.scalatest.words.ResultOfDefinedAt" -> "org.scalatest.matchers.dsl.ResultOfDefinedAt",
      "org.scalatest.words.ResultOfGreaterThanComparison" -> "org.scalatest.matchers.dsl.ResultOfGreaterThanComparison",
      "org.scalatest.words.ResultOfGreaterThanOrEqualToComparison" -> "org.scalatest.matchers.dsl.ResultOfGreaterThanOrEqualToComparison",
      "org.scalatest.words.ResultOfInOrderApplication" -> "org.scalatest.matchers.dsl.ResultOfInOrderApplication",
      "org.scalatest.words.ResultOfInOrderElementsOfApplication" -> "org.scalatest.matchers.dsl.ResultOfInOrderElementsOfApplication",
      "org.scalatest.words.ResultOfInOrderOnlyApplication" -> "org.scalatest.matchers.dsl.ResultOfInOrderOnlyApplication",
      "org.scalatest.words.ResultOfKeyWordApplication" -> "org.scalatest.matchers.dsl.ResultOfKeyWordApplication",
      "org.scalatest.words.ResultOfLengthWordApplication" -> "org.scalatest.matchers.dsl.ResultOfLengthWordApplication",
      "org.scalatest.words.ResultOfLessThanComparison" -> "org.scalatest.matchers.dsl.ResultOfLessThanComparison",
      "org.scalatest.words.ResultOfLessThanOrEqualToComparison" -> "org.scalatest.matchers.dsl.ResultOfLessThanOrEqualToComparison",
      "org.scalatest.words.ResultOfMessageWordApplication" -> "org.scalatest.matchers.dsl.ResultOfMessageWordApplication",
      "org.scalatest.words.ResultOfNoElementsOfApplication" -> "org.scalatest.matchers.dsl.ResultOfNoElementsOfApplication",
      "org.scalatest.words.ResultOfNoneOfApplication" -> "org.scalatest.matchers.dsl.ResultOfNoneOfApplication",
      "org.scalatest.words.ResultOfNotExist" -> "org.scalatest.matchers.dsl.ResultOfNotExist",
      "org.scalatest.words.ResultOfNotWordForAny" -> "org.scalatest.matchers.dsl.ResultOfNotWordForAny",
      "org.scalatest.words.ResultOfOfTypeInvocation" -> "org.scalatest.matchers.dsl.ResultOfOfTypeInvocation",
      "org.scalatest.words.ResultOfOneElementOfApplication" -> "org.scalatest.matchers.dsl.ResultOfOneElementOfApplication",
      "org.scalatest.words.ResultOfOneOfApplication" -> "org.scalatest.matchers.dsl.ResultOfOneOfApplication",
      "org.scalatest.words.ResultOfOnlyApplication" -> "org.scalatest.matchers.dsl.ResultOfOnlyApplication",
      "org.scalatest.words.ResultOfRegexWordApplication" -> "org.scalatest.matchers.dsl.ResultOfRegexWordApplication",
      "org.scalatest.words.ResultOfSizeWordApplication" -> "org.scalatest.matchers.dsl.ResultOfSizeWordApplication",
      "org.scalatest.words.ResultOfTheSameElementsAsApplication" -> "org.scalatest.matchers.dsl.ResultOfTheSameElementsAsApplication",
      "org.scalatest.words.ResultOfTheSameElementsInOrderAsApplication" -> "org.scalatest.matchers.dsl.ResultOfTheSameElementsInOrderAsApplication",
      "org.scalatest.words.ResultOfTheSameInstanceAsApplication" -> "org.scalatest.matchers.dsl.ResultOfTheSameInstanceAsApplication",
      "org.scalatest.words.ResultOfTheTypeInvocation" -> "org.scalatest.matchers.dsl.ResultOfTheTypeInvocation",
      "org.scalatest.words.ResultOfThrownByApplication" -> "org.scalatest.matchers.dsl.ResultOfThrownByApplication",
      "org.scalatest.words.ResultOfValueWordApplication" -> "org.scalatest.matchers.dsl.ResultOfValueWordApplication",
      "org.scalatest.words.SizeWord" -> "org.scalatest.matchers.dsl.SizeWord",
      "org.scalatest.words.SortedWord" -> "org.scalatest.matchers.dsl.SortedWord",
      "org.scalatest.words.StartWithWord" -> "org.scalatest.matchers.dsl.StartWithWord",
      "org.scalatest.words.WritableWord" -> "org.scalatest.matchers.dsl.WritableWord",
      "org.scalatest.words.BehaveWord" -> "org.scalatest.verbs.BehaveWord",
      "org.scalatest.words.CanVerb" -> "org.scalatest.verbs.CanVerb",
      "org.scalatest.words.CompileWord" -> "org.scalatest.verbs.CompileWord",
      "org.scalatest.words.MustVerb" -> "org.scalatest.verbs.MustVerb",
      "org.scalatest.words.ResultOfAfterWordApplication" -> "org.scalatest.verbs.ResultOfAfterWordApplication",
      "org.scalatest.words.ResultOfStringPassedToVerb" -> "org.scalatest.verbs.ResultOfStringPassedToVerb",
      "org.scalatest.words.ResultOfTaggedAsInvocation" -> "org.scalatest.verbs.ResultOfTaggedAsInvocation",
      "org.scalatest.words.ShouldVerb" -> "org.scalatest.verbs.ShouldVerb",
      "org.scalatest.words.StringVerbBehaveLikeInvocation" -> "org.scalatest.verbs.StringVerbBehaveLikeInvocation",
      "org.scalatest.words.StringVerbBlockRegistration" -> "org.scalatest.verbs.StringVerbBlockRegistration",
      "org.scalatest.words.StringVerbStringInvocation" -> "org.scalatest.verbs.StringVerbStringInvocation",
      "org.scalatest.words.SubjectWithAfterWordRegistration" -> "org.scalatest.verbs.SubjectWithAfterWordRegistration",
      "org.scalatest.words.TypeCheckWord" -> "org.scalatest.verbs.TypeCheckWord",
      "org.scalactic.Chain" -> "org.scalactic.anyvals.NonEmptyList",
      "org.scalactic.End" -> "org.scalactic.anyvals.End"
    )

    def replaceFunctions(renames: ((String, String), String)*): Patch =
      renames.map { case ((className, deprecatedFunName), funName) =>
        doc.tree.collect {
          case t: Term.Apply if t.symbol.displayName == deprecatedFunName && t.symbol.owner.value == className =>
            Patch.renameSymbol(t.symbol, funName)
        }.asPatch
      }.foldLeft(Patch.empty)(_ + _)

    val replaceDeprecatedMethodsPatch = replaceFunctions(
      "org/scalatest/featurespec/AnyFeatureSpecLike#" -> "feature" -> "Feature",
      "org/scalatest/featurespec/AnyFeatureSpecLike#" -> "scenario" -> "Scenario",
      "org/scalatest/featurespec/FixtureAnyFeatureSpecLike#" -> "feature" -> "Feature",
      "org/scalatest/featurespec/FixtureAnyFeatureSpecLike#" -> "scenario" -> "Scenario",
      "org/scalatest/featurespec/AsyncFeatureSpecLike#" -> "feature" -> "Feature",
      "org/scalatest/featurespec/AsyncFeatureSpecLike#" -> "scenario" -> "Scenario",
      "org/scalatest/featurespec/FixtureAsyncFeatureSpecLike#" -> "feature" -> "Feature",
      "org/scalatest/featurespec/FixtureAsyncFeatureSpecLike#" -> "scenario" -> "Scenario"
    )

    replaceDeprecatedClassesPatch + replaceDeprecatedMethodsPatch
  }
}

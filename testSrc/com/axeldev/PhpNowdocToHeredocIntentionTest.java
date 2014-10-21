package com.axeldev;

public class PhpNowdocToHeredocIntentionTest extends Php1UpLightCodeInsightFixtureTestCase {

    private static final String TEST_INTENTION_NAME = PhpNowdocToHeredocIntention.INTENTION_NAME;

    public void testIntentionDescriptionExample() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testSimpleString() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testEscapeSequences() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testStringEndingWithBackslash() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testVariableVariable() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testExcessiveBackslashBeforeSingleQuoteEscaping() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

    public void testEscapingSeveralBackslashesMissesLast() {
        launchPhpIntentionTest(getTestName(false), TEST_INTENTION_NAME);
    }

}
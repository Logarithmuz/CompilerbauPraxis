/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testsuite für Antlr-Parser
 * 
 * **********************************************
 */
package de.dhbw.compiler.antlrxtreegrammar.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAntlrXScanner1.class, TestAntlrXScanner2.class, TestAntlrXScanner3.class, TestAntlrXParser1.class, TestAntlrXParser2.class })
public class TestAntlrXParser {

}

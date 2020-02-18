/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package de.cofinpro.intellij.acfeplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementType;
import de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>FormulaEngine.flex</tt>
 */
public class FormulaEngineLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1040 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\177\200");

  /* The ZZ_CMAP_A table has 256 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\2\1\1\0\2\1\22\0\1\1\7\0\1\4\1\5\6\0\12\3\3\0\1\10\3\0\32\2\4\0\1\2"+
    "\1\0\1\21\1\23\1\14\1\27\1\24\1\11\1\22\1\2\1\16\2\2\1\20\1\2\1\13\1\17\2"+
    "\2\1\25\1\26\1\15\1\12\3\2\1\30\1\2\1\6\1\0\1\7\202\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\23\3\1\11\5\3\1\12\3\3\1\13\2\3"+
    "\1\14\4\3\1\15\1\16\1\3\1\17\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\62\0\113\0\62\0\62\0\62"+
    "\0\62\0\62\0\144\0\175\0\226\0\257\0\310\0\341"+
    "\0\372\0\u0113\0\u012c\0\u0145\0\u015e\0\u0177\0\u0190\0\u01a9"+
    "\0\u01c2\0\u01db\0\u01f4\0\u020d\0\u0226\0\113\0\u023f\0\u0258"+
    "\0\u0271\0\u028a\0\u02a3\0\113\0\u02bc\0\u02d5\0\u02ee\0\113"+
    "\0\u0307\0\u0320\0\113\0\u0339\0\u0352\0\u036b\0\u0384\0\113"+
    "\0\113\0\u039d\0\113\0\113";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\3\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\4\5\1\14\1\5\1\15\1\16\1\17"+
    "\3\5\1\20\1\21\1\5\31\3\33\0\2\5\5\0"+
    "\20\5\2\0\2\5\5\0\1\5\1\22\16\5\2\0"+
    "\2\5\5\0\2\5\1\23\15\5\2\0\2\5\5\0"+
    "\5\5\1\24\1\25\11\5\2\0\2\5\5\0\2\5"+
    "\1\26\15\5\2\0\2\5\5\0\7\5\1\27\10\5"+
    "\2\0\2\5\5\0\4\5\1\30\13\5\2\0\2\5"+
    "\5\0\5\5\1\31\12\5\2\0\2\5\5\0\2\5"+
    "\1\32\15\5\2\0\2\5\5\0\4\5\1\33\13\5"+
    "\2\0\2\5\5\0\15\5\1\34\2\5\2\0\2\5"+
    "\5\0\3\5\1\35\14\5\2\0\2\5\5\0\17\5"+
    "\1\36\2\0\2\5\5\0\6\5\1\37\11\5\2\0"+
    "\2\5\5\0\14\5\1\40\3\5\2\0\2\5\5\0"+
    "\3\5\1\41\14\5\2\0\2\5\5\0\3\5\1\42"+
    "\14\5\2\0\2\5\5\0\13\5\1\43\4\5\2\0"+
    "\2\5\5\0\4\5\1\44\13\5\2\0\2\5\5\0"+
    "\10\5\1\45\7\5\2\0\2\5\5\0\12\5\1\46"+
    "\5\5\2\0\2\5\5\0\5\5\1\47\12\5\2\0"+
    "\2\5\5\0\4\5\1\50\13\5\2\0\2\5\5\0"+
    "\4\5\1\51\13\5\2\0\2\5\5\0\11\5\1\52"+
    "\6\5\2\0\2\5\5\0\7\5\1\53\10\5\2\0"+
    "\2\5\5\0\10\5\1\54\7\5\2\0\2\5\5\0"+
    "\2\5\1\55\15\5\2\0\2\5\5\0\5\5\1\56"+
    "\12\5\2\0\2\5\5\0\13\5\1\57\4\5\2\0"+
    "\2\5\5\0\7\5\1\60\10\5\2\0\2\5\5\0"+
    "\11\5\1\61\6\5\2\0\2\5\5\0\6\5\1\62"+
    "\11\5\2\0\2\5\5\0\14\5\1\63\3\5\2\0"+
    "\2\5\5\0\2\5\1\64\15\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[950];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\1\1\5\11\52\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FormulaEngineLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 17: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 18: break;
          case 3: 
            { return FormulaEngineElementTypes.IDENTIFIER;
            } 
            // fall through
          case 19: break;
          case 4: 
            { return FormulaEngineElementTypes.LEFT_PARENTHESIS;
            } 
            // fall through
          case 20: break;
          case 5: 
            { return FormulaEngineElementTypes.RIGHT_PARENTHESIS;
            } 
            // fall through
          case 21: break;
          case 6: 
            { return FormulaEngineElementTypes.LEFT_CURLY_BRACE;
            } 
            // fall through
          case 22: break;
          case 7: 
            { return FormulaEngineElementTypes.RIGHT_CURLY_BRACE;
            } 
            // fall through
          case 23: break;
          case 8: 
            { return FormulaEngineElementTypes.OPERATOR_EQUALS;
            } 
            // fall through
          case 24: break;
          case 9: 
            { return FormulaEngineElementTypes.ANY;
            } 
            // fall through
          case 25: break;
          case 10: 
            { return FormulaEngineElementTypes.LIST;
            } 
            // fall through
          case 26: break;
          case 11: 
            { return FormulaEngineElementTypes.DICT;
            } 
            // fall through
          case 27: break;
          case 12: 
            { return FormulaEngineElementTypes.LOCAL;
            } 
            // fall through
          case 28: break;
          case 13: 
            { return FormulaEngineElementTypes.GLOBAL;
            } 
            // fall through
          case 29: break;
          case 14: 
            { return FormulaEngineElementTypes.STRING;
            } 
            // fall through
          case 30: break;
          case 15: 
            { return FormulaEngineElementTypes.INTEGER;
            } 
            // fall through
          case 31: break;
          case 16: 
            { return FormulaEngineElementTypes.FUNCTION;
            } 
            // fall through
          case 32: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

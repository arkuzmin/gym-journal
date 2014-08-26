// ============================================================================
//
// Copyright (c) 2006-2013, Talend Inc.
//
// This source code has been automatically generated by_Talend Open Studio for MDM
// / Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// ============================================================================
package routines;

public class DataOperation {

    /**
     * CHAR() Converts a numeric value to its ASCII character string equivalent.
     * 
     * {talendTypes} char | Character
     * 
     * {Category} DataOperation
     * 
     * {param} int(1) i: numeric value
     * 
     * {example} CHAR(1):int
     * 
     */
    public static char CHAR(int i) {
        return Character.forDigit(i, 10);
    }

    /**
     * DTX( ) Converts a decimal integer into its hexadecimal equivalent.
     * 
     * {talendTypes} String
     * 
     * {Category} DataOperation
     * 
     * {param} int(1) i:decimal integer
     * 
     * {example} DTX(1)
     * 
     */
    public static String DTX(int i) {
        return Integer.toHexString(i);
    }

    /**
     * FIX(double) Rounds a number of type Double to a number of type Long with the precision specified in the PRECISION
     * statement.
     * 
     * {talendTypes} long | Long
     * 
     * {Category} DataOperation
     * 
     * {param} double (0.0) d:double number
     * 
     * {example} FIX(3.14)
     * 
     */
    public static long FIX(double d) {
        return Math.round(d);
    }

    /**
     * XTD( ) Converts a hexadecimal string into its decimal equivalent.
     * 
     * {talendTypes} int | Integer
     * 
     * {Category} DataOperation
     * 
     * {param} string ("0") text: hexadecimal string
     * 
     * {example} XTD(\"1\")
     * 
     */
    public static int XTD(String text) {
        return Integer.valueOf(text, 16);
    }
}

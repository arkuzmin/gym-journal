package org.talend.designer.codegen.translators.databases.hsqldb;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class THSQLDbRowBeginJava
{
  protected static String nl;
  public static synchronized THSQLDbRowBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    THSQLDbRowBeginJava result = new THSQLDbRowBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "String url_";
  protected final String TEXT_3 = " = null;" + NL;
  protected final String TEXT_4 = NL + "\t\t\turl_";
  protected final String TEXT_5 = " = \"jdbc:hsqldb:hsqls://\" + ";
  protected final String TEXT_6 = " + \":\" + ";
  protected final String TEXT_7 = " + \"/\" + ";
  protected final String TEXT_8 = ";" + NL + "\t\t";
  protected final String TEXT_9 = NL + "\t\t\turl_";
  protected final String TEXT_10 = " = \"jdbc:hsqldb:hsql://\" + ";
  protected final String TEXT_11 = " + \":\" + ";
  protected final String TEXT_12 = " + \"/\" + ";
  protected final String TEXT_13 = ";" + NL + "\t\t";
  protected final String TEXT_14 = NL + "\t\t\turl_";
  protected final String TEXT_15 = " = \"jdbc:hsqldb:https://\" + ";
  protected final String TEXT_16 = " + \":\" + ";
  protected final String TEXT_17 = " + \"/\" + ";
  protected final String TEXT_18 = ";" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\t\turl_";
  protected final String TEXT_20 = " = \"jdbc:hsqldb:http://\" + ";
  protected final String TEXT_21 = " + \":\" + ";
  protected final String TEXT_22 = " + \"/\" + ";
  protected final String TEXT_23 = ";" + NL + "\t\t";
  protected final String TEXT_24 = NL + "\t\turl_";
  protected final String TEXT_25 = " = \"jdbc:hsqldb:file:\" + ";
  protected final String TEXT_26 = " + \"/\" + ";
  protected final String TEXT_27 = " ;" + NL + "\t\t";
  protected final String TEXT_28 = NL + "\t\turl_";
  protected final String TEXT_29 = " = \"jdbc:hsqldb:mem:\" + ";
  protected final String TEXT_30 = " ;" + NL + "\t\t";
  protected final String TEXT_31 = NL + "\t\turl_";
  protected final String TEXT_32 = " += \";\" + ";
  protected final String TEXT_33 = ";";
  protected final String TEXT_34 = NL + NL + "java.lang.Class.forName(\"org.hsqldb.jdbcDriver\");" + NL + "" + NL + "String dbUser_";
  protected final String TEXT_35 = " = ";
  protected final String TEXT_36 = ";";
  protected final String TEXT_37 = NL;
  protected final String TEXT_38 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_39 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_40 = ");";
  protected final String TEXT_41 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_42 = " = ";
  protected final String TEXT_43 = "; ";
  protected final String TEXT_44 = NL + NL + "String dbPwd_";
  protected final String TEXT_45 = " = decryptedPassword_";
  protected final String TEXT_46 = ";" + NL + "" + NL + "" + NL + "java.sql.Connection conn_";
  protected final String TEXT_47 = " = java.sql.DriverManager.getConnection(url_";
  protected final String TEXT_48 = ",dbUser_";
  protected final String TEXT_49 = ",dbPwd_";
  protected final String TEXT_50 = ");" + NL + "" + NL + "boolean whetherReject_";
  protected final String TEXT_51 = " = false;" + NL;
  protected final String TEXT_52 = NL + NL + "int commitEvery_";
  protected final String TEXT_53 = " = ";
  protected final String TEXT_54 = ";" + NL + "" + NL + "int commitCounter_";
  protected final String TEXT_55 = " = 0;" + NL + "" + NL + "conn_";
  protected final String TEXT_56 = ".setAutoCommit(false);";
  protected final String TEXT_57 = NL + "\tjava.sql.PreparedStatement pstmt_";
  protected final String TEXT_58 = " = conn_";
  protected final String TEXT_59 = ".prepareStatement(";
  protected final String TEXT_60 = ");\t";
  protected final String TEXT_61 = NL + "\tjava.sql.Statement stmt_";
  protected final String TEXT_62 = " = conn_";
  protected final String TEXT_63 = ".createStatement();";
  protected final String TEXT_64 = NL + "String query_";
  protected final String TEXT_65 = " = \"\";";
  protected final String TEXT_66 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
	CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
	INode node = (INode)codeGenArgument.getArgument();
	String cid = node.getUniqueName();
	
	String dbhost = ElementParameterParser.getValue(node, "__HOST__");
	String dbport = ElementParameterParser.getValue(node, "__PORT__");
	String dbalias = ElementParameterParser.getValue(node, "__DATABASE_ALIAS__");
	String dbpath = ElementParameterParser.getValue(node, "__DBPATH__");
	String dbname= ElementParameterParser.getValue(node, "__DBNAME__");
	String dbuser= ElementParameterParser.getValue(node, "__USER__");
    String commitEvery = ElementParameterParser.getValue(node, "__COMMIT_EVERY__");
    String dbquery= ElementParameterParser.getValue(node, "__QUERY__");
	       
    	   dbquery = org.talend.core.model.utils.NodeUtil.replaceCRLFInMEMO_SQL(dbquery);
    
	boolean usePrepareStatement = "true".equals(ElementParameterParser.getValue(node,"__USE_PREPAREDSTATEMENT__"));
	
	String dbproperties = ElementParameterParser.getValue(node, "__PROPERTIES__");

    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
	String runningMode = ElementParameterParser.getValue(node, "__RUNNING_MODE__");
	String tls = ElementParameterParser.getValue(node, "__TLS__");
	if(("HSQLDB_SERVER").equals(runningMode))
	{
		if(("true").equals(tls))
		{
		
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(dbhost);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(dbport);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(dbalias);
    stringBuffer.append(TEXT_8);
    
		}
		else
		{
		
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(dbhost);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(dbport);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(dbalias);
    stringBuffer.append(TEXT_13);
    
		}
	}
	else if(("HSQLDB_WEBSERVER").equals(runningMode))
	{
		if(("true").equals(tls))
		{
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(dbhost);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(dbport);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(dbalias);
    stringBuffer.append(TEXT_18);
    
		}
		else
		{
		
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(dbhost);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(dbport);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(dbalias);
    stringBuffer.append(TEXT_23);
    
		}
	}
	else if(("HSQLDB_INPROGRESS_PERSISTENT").equals(runningMode))
	{
		
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(dbpath);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(dbname);
    stringBuffer.append(TEXT_27);
    
	} else if(("HSQLDB_IN_MEMORY").equals(runningMode)) {
		
    stringBuffer.append(TEXT_28);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(dbname);
    stringBuffer.append(TEXT_30);
    
	}

	if(dbproperties != null && !("\"\"").equals(dbproperties) && !("").equals(dbproperties)) {

    stringBuffer.append(TEXT_31);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(dbproperties);
    stringBuffer.append(TEXT_33);
    
	}
	

    stringBuffer.append(TEXT_34);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(dbuser);
    stringBuffer.append(TEXT_36);
    
String passwordFieldName = "__PASS__";

    stringBuffer.append(TEXT_37);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_40);
    } else {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_42);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_45);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_51);
    
if(!("").equals(commitEvery)&&!("0").equals(commitEvery)){

    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(commitEvery);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_56);
    
}

    
	if (usePrepareStatement ) {

    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(dbquery);
    stringBuffer.append(TEXT_60);
    
	} else {

    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_63);
    
	}

    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_65);
    stringBuffer.append(TEXT_66);
    return stringBuffer.toString();
  }
}

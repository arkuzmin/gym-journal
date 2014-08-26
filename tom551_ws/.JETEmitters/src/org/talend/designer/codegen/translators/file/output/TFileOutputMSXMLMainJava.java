package org.talend.designer.codegen.translators.file.output;

import org.talend.core.model.process.INode;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.ElementParameterParser;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.utils.NodeUtil;
import org.talend.core.model.process.EConnectionType;

/**
 * add by xzhang
 */
public class TFileOutputMSXMLMainJava {

  protected static String nl;
  public static synchronized TFileOutputMSXMLMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TFileOutputMSXMLMainJava result = new TFileOutputMSXMLMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\t\tvalueMap_";
  protected final String TEXT_3 = ".get(\"";
  protected final String TEXT_4 = "\")";
  protected final String TEXT_5 = NL + "\t(";
  protected final String TEXT_6 = NL + "\t\t";
  protected final String TEXT_7 = ".";
  protected final String TEXT_8 = " != null?";
  protected final String TEXT_9 = NL + "    \t\tFormatterUtils.format_Number(String.valueOf(";
  protected final String TEXT_10 = "), ";
  protected final String TEXT_11 = ",";
  protected final String TEXT_12 = ")\t\t\t\t\t";
  protected final String TEXT_13 = NL + "    \t\tFormatterUtils.format_Number(String.valueOf(";
  protected final String TEXT_14 = ".";
  protected final String TEXT_15 = "), ";
  protected final String TEXT_16 = ",";
  protected final String TEXT_17 = ")\t\t\t\t\t\t";
  protected final String TEXT_18 = NL + "            String.valueOf(";
  protected final String TEXT_19 = ".";
  protected final String TEXT_20 = ")";
  protected final String TEXT_21 = NL + "            FormatterUtils.format_Date(";
  protected final String TEXT_22 = ".";
  protected final String TEXT_23 = ",";
  protected final String TEXT_24 = ")";
  protected final String TEXT_25 = NL + "\t\t\t";
  protected final String TEXT_26 = ".";
  protected final String TEXT_27 = NL + "\t\t\tString.valueOf(";
  protected final String TEXT_28 = ")";
  protected final String TEXT_29 = NL + "            ";
  protected final String TEXT_30 = ".";
  protected final String TEXT_31 = ".toString()";
  protected final String TEXT_32 = ":";
  protected final String TEXT_33 = "null";
  protected final String TEXT_34 = NL + "\t\t)";
  protected final String TEXT_35 = NL + "\t\t";
  protected final String TEXT_36 = "_";
  protected final String TEXT_37 = NL + "\t\torg.dom4j.Element ";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = " = org.dom4j.DocumentHelper.createElement(qname_";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = ");";
  protected final String TEXT_42 = NL + "\t\torg.dom4j.Element ";
  protected final String TEXT_43 = "_";
  protected final String TEXT_44 = " = null;";
  protected final String TEXT_45 = NL + "\t\t";
  protected final String TEXT_46 = "_";
  protected final String TEXT_47 = " = ";
  protected final String TEXT_48 = "_";
  protected final String TEXT_49 = ".addElement(\"";
  protected final String TEXT_50 = "\");";
  protected final String TEXT_51 = NL + "\t\t";
  protected final String TEXT_52 = "_";
  protected final String TEXT_53 = " = ";
  protected final String TEXT_54 = "_";
  protected final String TEXT_55 = ".addElement(\"";
  protected final String TEXT_56 = "\");";
  protected final String TEXT_57 = NL + "\t\tsubTreeRootParent_";
  protected final String TEXT_58 = " = ";
  protected final String TEXT_59 = "_";
  protected final String TEXT_60 = ";";
  protected final String TEXT_61 = NL + "\t\torg.dom4j.Element subTreeRootParent_";
  protected final String TEXT_62 = " = null;";
  protected final String TEXT_63 = NL + "\t\tsubTreeRootParent_";
  protected final String TEXT_64 = "= root_";
  protected final String TEXT_65 = "_";
  protected final String TEXT_66 = ";";
  protected final String TEXT_67 = NL + "\t\tsubTreeRootParent_";
  protected final String TEXT_68 = " =  tempElem;";
  protected final String TEXT_69 = NL + "\t\tnameToElement_";
  protected final String TEXT_70 = ".get(\"";
  protected final String TEXT_71 = "\")";
  protected final String TEXT_72 = NL + "\t\t((org.dom4j.Element)(nameToElement_";
  protected final String TEXT_73 = ".get(\"";
  protected final String TEXT_74 = "\")))";
  protected final String TEXT_75 = NL + "\t\tnameToElement_";
  protected final String TEXT_76 = ".put(\"";
  protected final String TEXT_77 = "\",org.dom4j.DocumentHelper.createElement(qname_";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "));";
  protected final String TEXT_80 = NL + "\t\tnameToElement_";
  protected final String TEXT_81 = ".put(\"";
  protected final String TEXT_82 = "\",";
  protected final String TEXT_83 = ".addElement(\"";
  protected final String TEXT_84 = "\"));";
  protected final String TEXT_85 = NL + "\t\tnameToElement_";
  protected final String TEXT_86 = ".put(\"";
  protected final String TEXT_87 = "\",";
  protected final String TEXT_88 = ".addElement(\"";
  protected final String TEXT_89 = "\"));";
  protected final String TEXT_90 = NL + "\t\tnameToElement_";
  protected final String TEXT_91 = ".put(\"subTreeRootParent\",";
  protected final String TEXT_92 = ");";
  protected final String TEXT_93 = NL + "\t\tnameToElement_";
  protected final String TEXT_94 = ".put(\"subTreeRootParent\",null);";
  protected final String TEXT_95 = NL + "\t\tnameToElement_";
  protected final String TEXT_96 = ".put(\"subTreeRootParent\",root_";
  protected final String TEXT_97 = "_";
  protected final String TEXT_98 = ");";
  protected final String TEXT_99 = NL + "\t\tnameToElement_";
  protected final String TEXT_100 = ".put(\"root_";
  protected final String TEXT_101 = "\",root_";
  protected final String TEXT_102 = "_";
  protected final String TEXT_103 = ");";
  protected final String TEXT_104 = NL + "\t\tnameToElement_";
  protected final String TEXT_105 = ".put(\"subTreeRootParent\",tempElem);";
  protected final String TEXT_106 = NL + "\t\tnameToElement_";
  protected final String TEXT_107 = ".put(\"doc\",doc_";
  protected final String TEXT_108 = ");";
  protected final String TEXT_109 = NL;
  protected final String TEXT_110 = NL + "\t\t\tclass TalendXMLGenerateTool_";
  protected final String TEXT_111 = "_";
  protected final String TEXT_112 = " {";
  protected final String TEXT_113 = NL + "\t\t\t}";
  protected final String TEXT_114 = NL + "\t\t\t\tpublic void generateDocument_";
  protected final String TEXT_115 = "() throws java.lang.Exception{";
  protected final String TEXT_116 = NL + "\t\t\t\t}" + NL + "\t\t\t\tpublic void generateDocument_";
  protected final String TEXT_117 = "() throws java.lang.Exception{";
  protected final String TEXT_118 = NL + "\t\t\tTalendXMLGenerateTool_";
  protected final String TEXT_119 = "_";
  protected final String TEXT_120 = " talendXMLGenerateTool_";
  protected final String TEXT_121 = "_";
  protected final String TEXT_122 = " = new TalendXMLGenerateTool_";
  protected final String TEXT_123 = "_";
  protected final String TEXT_124 = "();";
  protected final String TEXT_125 = NL + "\t\t\t\t\ttalendXMLGenerateTool_";
  protected final String TEXT_126 = "_";
  protected final String TEXT_127 = ".generateDocument_";
  protected final String TEXT_128 = "();";
  protected final String TEXT_129 = NL;
  protected final String TEXT_130 = NL + "\t\t\t";
  protected final String TEXT_131 = ".setQName(org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_132 = "\",";
  protected final String TEXT_133 = ".getNamespaceForPrefix(\"";
  protected final String TEXT_134 = "\")));";
  protected final String TEXT_135 = NL + "\t\t\tif (";
  protected final String TEXT_136 = ".content().size() == 0 " + NL + "\t\t\t\t&& ";
  protected final String TEXT_137 = ".attributes().size() == 0 " + NL + "\t\t\t\t&& ";
  protected final String TEXT_138 = ".declaredNamespaces().size() == 0) {";
  protected final String TEXT_139 = ".remove(";
  protected final String TEXT_140 = ");" + NL + "            }\t\t\t";
  protected final String TEXT_141 = NL + "\t\torg.dom4j.QName qname_";
  protected final String TEXT_142 = "_";
  protected final String TEXT_143 = " = org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_144 = "\",org.dom4j.DocumentHelper.createNamespace(\"";
  protected final String TEXT_145 = "\",\"";
  protected final String TEXT_146 = "\"));" + NL + "\t\t";
  protected final String TEXT_147 = NL + "\t\t" + NL + "\t\tjava.util.List<org.dom4j.Element> allElements_";
  protected final String TEXT_148 = "_";
  protected final String TEXT_149 = " = ";
  protected final String TEXT_150 = ".elements();" + NL + "\t\tjava.util.List<org.dom4j.Element> elements_";
  protected final String TEXT_151 = "_";
  protected final String TEXT_152 = " = ";
  protected final String TEXT_153 = ".elements(qname_";
  protected final String TEXT_154 = "_";
  protected final String TEXT_155 = ");" + NL + "\t\tint order_";
  protected final String TEXT_156 = "_";
  protected final String TEXT_157 = " = allElements_";
  protected final String TEXT_158 = "_";
  protected final String TEXT_159 = ".size();" + NL + "\t\tint app_size_";
  protected final String TEXT_160 = " = elements_";
  protected final String TEXT_161 = "_";
  protected final String TEXT_162 = ".size();" + NL + "\t\tif(app_size_";
  protected final String TEXT_163 = " > 0){" + NL + "\t\t\torder_";
  protected final String TEXT_164 = "_";
  protected final String TEXT_165 = " = 1 + allElements_";
  protected final String TEXT_166 = "_";
  protected final String TEXT_167 = ".indexOf(elements_";
  protected final String TEXT_168 = "_";
  protected final String TEXT_169 = ".get(app_size_";
  protected final String TEXT_170 = "-1));" + NL + "\t\t}else{";
  protected final String TEXT_171 = NL + "\t\t\torg.dom4j.QName qname_sibling_";
  protected final String TEXT_172 = "_";
  protected final String TEXT_173 = "_";
  protected final String TEXT_174 = " = org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_175 = "\",org.dom4j.DocumentHelper.createNamespace(\"";
  protected final String TEXT_176 = "\",\"";
  protected final String TEXT_177 = "\"));" + NL + "\t\t\torg.dom4j.Element sibling_";
  protected final String TEXT_178 = "_";
  protected final String TEXT_179 = "_";
  protected final String TEXT_180 = " = ";
  protected final String TEXT_181 = ".element(qname_sibling_";
  protected final String TEXT_182 = "_";
  protected final String TEXT_183 = "_";
  protected final String TEXT_184 = ");" + NL + "\t\t\tint index_sibling_";
  protected final String TEXT_185 = "_";
  protected final String TEXT_186 = "_";
  protected final String TEXT_187 = " = allElements_";
  protected final String TEXT_188 = "_";
  protected final String TEXT_189 = ".indexOf(sibling_";
  protected final String TEXT_190 = "_";
  protected final String TEXT_191 = "_";
  protected final String TEXT_192 = ");" + NL + "\t\t\tif(index_sibling_";
  protected final String TEXT_193 = "_";
  protected final String TEXT_194 = "_";
  protected final String TEXT_195 = " > -1) {" + NL + "\t\t\t\torder_";
  protected final String TEXT_196 = "_";
  protected final String TEXT_197 = " = index_sibling_";
  protected final String TEXT_198 = "_";
  protected final String TEXT_199 = "_";
  protected final String TEXT_200 = ";" + NL + "\t\t\t} else {";
  protected final String TEXT_201 = NL + "\t\t\t}";
  protected final String TEXT_202 = NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_203 = ".elements().add(order_";
  protected final String TEXT_204 = "_";
  protected final String TEXT_205 = ",";
  protected final String TEXT_206 = ");";
  protected final String TEXT_207 = NL + "\t\tif (";
  protected final String TEXT_208 = ".getNamespaceForPrefix(\"";
  protected final String TEXT_209 = "\") == null) {";
  protected final String TEXT_210 = NL + "        } else {" + NL + "        \t";
  protected final String TEXT_211 = NL + "        }";
  protected final String TEXT_212 = NL + "\t\t";
  protected final String TEXT_213 = NL + "\t\t";
  protected final String TEXT_214 = NL + "\t\tif(";
  protected final String TEXT_215 = "!=null){" + NL + "\t\t\tnestXMLTool_";
  protected final String TEXT_216 = " .parseAndAdd(";
  protected final String TEXT_217 = ",";
  protected final String TEXT_218 = ");" + NL + "\t\t}";
  protected final String TEXT_219 = NL + "\t\telse{" + NL + "\t\t\tnestXMLTool_";
  protected final String TEXT_220 = " .parseAndAdd(";
  protected final String TEXT_221 = ",\"\");" + NL + "\t\t\t";
  protected final String TEXT_222 = ".addAttribute(\"xsi:nil\",\"true\");" + NL + "\t\t}";
  protected final String TEXT_223 = NL + "\t\tif(";
  protected final String TEXT_224 = "!=null){" + NL + "\t\t\tnestXMLTool_";
  protected final String TEXT_225 = " .setText(";
  protected final String TEXT_226 = ",";
  protected final String TEXT_227 = ");" + NL + "\t\t}";
  protected final String TEXT_228 = NL + "\t\telse{" + NL + "\t\t\t";
  protected final String TEXT_229 = ".setText(\"\");" + NL + "\t\t\t";
  protected final String TEXT_230 = ".addAttribute(\"xsi:nil\",\"true\");" + NL + "\t\t}";
  protected final String TEXT_231 = NL + "\t\tnestXMLTool_";
  protected final String TEXT_232 = ".parseAndAdd(";
  protected final String TEXT_233 = ",\"";
  protected final String TEXT_234 = "\");" + NL;
  protected final String TEXT_235 = NL + "\t\tif(";
  protected final String TEXT_236 = "!=null){";
  protected final String TEXT_237 = NL + "\t\t\t";
  protected final String TEXT_238 = ".addAttribute(\"";
  protected final String TEXT_239 = "\",";
  protected final String TEXT_240 = ");";
  protected final String TEXT_241 = NL + "\t\t\t";
  protected final String TEXT_242 = ".addAttribute(org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_243 = "\",org.dom4j.DocumentHelper.createNamespace(\"";
  protected final String TEXT_244 = "\",\"";
  protected final String TEXT_245 = "\")),";
  protected final String TEXT_246 = ");";
  protected final String TEXT_247 = NL + "\t\t}";
  protected final String TEXT_248 = NL + "\t\t\t";
  protected final String TEXT_249 = ".addAttribute(\"";
  protected final String TEXT_250 = "\", \"";
  protected final String TEXT_251 = "\");";
  protected final String TEXT_252 = NL + "\t\t\t";
  protected final String TEXT_253 = ".addAttribute(org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_254 = "\",org.dom4j.DocumentHelper.createNamespace(\"";
  protected final String TEXT_255 = "\",\"";
  protected final String TEXT_256 = "\")),\"";
  protected final String TEXT_257 = "\");";
  protected final String TEXT_258 = NL + "\t\tif(";
  protected final String TEXT_259 = "!=null){" + NL + "\t\t\t";
  protected final String TEXT_260 = ".addNamespace(\"";
  protected final String TEXT_261 = "\",TalendString.replaceSpecialCharForXML(";
  protected final String TEXT_262 = "));";
  protected final String TEXT_263 = NL + "        \t";
  protected final String TEXT_264 = ".setQName(org.dom4j.DocumentHelper.createQName(";
  protected final String TEXT_265 = ".getName()," + NL + "        \torg.dom4j.DocumentHelper.createNamespace(\"\",TalendString.replaceSpecialCharForXML(";
  protected final String TEXT_266 = "))));";
  protected final String TEXT_267 = NL + "\t\t}";
  protected final String TEXT_268 = NL + "\t\t\t";
  protected final String TEXT_269 = ".addNamespace(\"";
  protected final String TEXT_270 = "\",TalendString.replaceSpecialCharForXML(\"";
  protected final String TEXT_271 = "\"));";
  protected final String TEXT_272 = NL + "        \t";
  protected final String TEXT_273 = ".setQName(org.dom4j.DocumentHelper.createQName(";
  protected final String TEXT_274 = ".getName()," + NL + "        \torg.dom4j.DocumentHelper.createNamespace(\"\",TalendString.replaceSpecialCharForXML(\"";
  protected final String TEXT_275 = "\"))));";
  protected final String TEXT_276 = "true";
  protected final String TEXT_277 = " && (";
  protected final String TEXT_278 = "(";
  protected final String TEXT_279 = "==null && ";
  protected final String TEXT_280 = " == null) || (true &&";
  protected final String TEXT_281 = NL + "\t";
  protected final String TEXT_282 = "!=null" + NL + " && ";
  protected final String TEXT_283 = ".getText()!=null" + NL + " &&";
  protected final String TEXT_284 = ".getText().equals(";
  protected final String TEXT_285 = ")";
  protected final String TEXT_286 = ")";
  protected final String TEXT_287 = NL + ")";
  protected final String TEXT_288 = " && (";
  protected final String TEXT_289 = "!=null" + NL + " && ";
  protected final String TEXT_290 = ".getText()!=null" + NL + " && ";
  protected final String TEXT_291 = ".getText().equals(\"";
  protected final String TEXT_292 = "\")" + NL + " )";
  protected final String TEXT_293 = " && (";
  protected final String TEXT_294 = "(";
  protected final String TEXT_295 = "==null && ";
  protected final String TEXT_296 = ".attribute(";
  protected final String TEXT_297 = ") == null) || (true && ";
  protected final String TEXT_298 = ".attribute(";
  protected final String TEXT_299 = ")!=null" + NL + "&& ";
  protected final String TEXT_300 = ".attribute(";
  protected final String TEXT_301 = ").getText()!=null" + NL + "&&";
  protected final String TEXT_302 = ".attribute(";
  protected final String TEXT_303 = ").getText().equals(";
  protected final String TEXT_304 = ")";
  protected final String TEXT_305 = ")";
  protected final String TEXT_306 = ")";
  protected final String TEXT_307 = " && (";
  protected final String TEXT_308 = ".attribute(";
  protected final String TEXT_309 = ")!=null" + NL + "&& ";
  protected final String TEXT_310 = ".attribute(";
  protected final String TEXT_311 = ").getText()!=null" + NL + "&&";
  protected final String TEXT_312 = ".attribute(";
  protected final String TEXT_313 = ").getText().equals(\"";
  protected final String TEXT_314 = "\")" + NL + " )";
  protected final String TEXT_315 = NL;
  protected final String TEXT_316 = ".element(org.dom4j.DocumentHelper.createQName(\"";
  protected final String TEXT_317 = "\",org.dom4j.DocumentHelper.createNamespace(\"";
  protected final String TEXT_318 = "\",\"";
  protected final String TEXT_319 = "\")))";
  protected final String TEXT_320 = ".element(\"";
  protected final String TEXT_321 = "\")";
  protected final String TEXT_322 = NL + "TalendWrapTool_";
  protected final String TEXT_323 = " talendWrapTool_";
  protected final String TEXT_324 = " = new TalendWrapTool_";
  protected final String TEXT_325 = "();";
  protected final String TEXT_326 = NL + "class TalendWrapTool_";
  protected final String TEXT_327 = " {";
  protected final String TEXT_328 = NL + "}";
  protected final String TEXT_329 = NL + "nb_line_";
  protected final String TEXT_330 = "++;";
  protected final String TEXT_331 = NL + "public void create";
  protected final String TEXT_332 = "Doc(";
  protected final String TEXT_333 = "Struct ";
  protected final String TEXT_334 = ") throws java.lang.Exception {";
  protected final String TEXT_335 = NL + "talendWrapTool_";
  protected final String TEXT_336 = ".create";
  protected final String TEXT_337 = "Doc(";
  protected final String TEXT_338 = ");";
  protected final String TEXT_339 = NL + "java.util.List<java.util.List<String>> groupbyList_";
  protected final String TEXT_340 = " = new java.util.ArrayList<java.util.List<String>>();" + NL + "final java.util.Map<String,String> valueMap_";
  protected final String TEXT_341 = " = new java.util.HashMap<String,String>();" + NL + "boolean isXML10Char_";
  protected final String TEXT_342 = " = true;" + NL + "" + NL + "// sort group root element for judgement of group" + NL + "java.util.List<org.dom4j.Element> groupElementList_";
  protected final String TEXT_343 = " = new java.util.ArrayList<org.dom4j.Element>();" + NL + "org.dom4j.Element root4Group_";
  protected final String TEXT_344 = " = null;";
  protected final String TEXT_345 = NL + "org.dom4j.Element root_";
  protected final String TEXT_346 = "_";
  protected final String TEXT_347 = " = null;" + NL + "//used to judge branch root tags" + NL + "boolean needRoot_";
  protected final String TEXT_348 = "_";
  protected final String TEXT_349 = "  = true;" + NL + "//namespace support" + NL + "java.util.Map<String,String> uriToPrefixForDefaultNamespace_";
  protected final String TEXT_350 = "_";
  protected final String TEXT_351 = " = new java.util.HashMap<String,String>();" + NL + "java.util.Map<String,String> prefixToUriForNamespace_";
  protected final String TEXT_352 = "_";
  protected final String TEXT_353 = " = new java.util.HashMap<String,String>();";
  protected final String TEXT_354 = NL + "\tvoid putValue_";
  protected final String TEXT_355 = "_";
  protected final String TEXT_356 = "(final ";
  protected final String TEXT_357 = "Struct ";
  protected final String TEXT_358 = "){";
  protected final String TEXT_359 = NL + "\t\tvalueMap_";
  protected final String TEXT_360 = ".put(\"";
  protected final String TEXT_361 = "\", ";
  protected final String TEXT_362 = ");" + NL + "\t\tif(isXML10Char_";
  protected final String TEXT_363 = ") {" + NL + "\t\t\tisXML10Char_";
  protected final String TEXT_364 = " = org.talend.util.xml.XMLText.isValid(";
  protected final String TEXT_365 = ");" + NL + "\t\t}";
  protected final String TEXT_366 = NL + "\t}";
  protected final String TEXT_367 = NL + "\t}";
  protected final String TEXT_368 = NL + "\t" + NL + "\tvalueMap_";
  protected final String TEXT_369 = ".clear();" + NL + "\t";
  protected final String TEXT_370 = NL + "\t";
  protected final String TEXT_371 = NL + "\tputValue_";
  protected final String TEXT_372 = "_";
  protected final String TEXT_373 = "(";
  protected final String TEXT_374 = ");";
  protected final String TEXT_375 = NL + "\t\t\tvalueMap_";
  protected final String TEXT_376 = ".put(\"";
  protected final String TEXT_377 = "\", ";
  protected final String TEXT_378 = ");" + NL + "\t\t\tif(isXML10Char_";
  protected final String TEXT_379 = ") {" + NL + "\t\t\t\tisXML10Char_";
  protected final String TEXT_380 = " = org.talend.util.xml.XMLText.isValid(";
  protected final String TEXT_381 = ");" + NL + "\t\t\t}";
  protected final String TEXT_382 = NL + "\t";
  protected final String TEXT_383 = NL + "\t";
  protected final String TEXT_384 = NL + "\t// build root xml tree " + NL + "\tif (needRoot_";
  protected final String TEXT_385 = "_";
  protected final String TEXT_386 = ") {" + NL + "\t\tneedRoot_";
  protected final String TEXT_387 = "_";
  protected final String TEXT_388 = " = false;";
  protected final String TEXT_389 = NL + "\t\troot_";
  protected final String TEXT_390 = "_";
  protected final String TEXT_391 = " = ";
  protected final String TEXT_392 = ";" + NL + "\t}else{" + NL + "\t\t";
  protected final String TEXT_393 = NL + "\t}";
  protected final String TEXT_394 = NL + "\t// build root xml tree " + NL + "\tif (needRoot_";
  protected final String TEXT_395 = "_";
  protected final String TEXT_396 = ") {" + NL + "\t\tneedRoot_";
  protected final String TEXT_397 = "_";
  protected final String TEXT_398 = " = false;" + NL + "\t\torg.dom4j.XPath xpath_";
  protected final String TEXT_399 = "_";
  protected final String TEXT_400 = " = doc_";
  protected final String TEXT_401 = ".createXPath(\"";
  protected final String TEXT_402 = "\");" + NL + "\t\txpath_";
  protected final String TEXT_403 = "_";
  protected final String TEXT_404 = ".setNamespaceURIs(prefixToUriForNamespace_";
  protected final String TEXT_405 = "_";
  protected final String TEXT_406 = ");" + NL + "\t\troot_";
  protected final String TEXT_407 = "_";
  protected final String TEXT_408 = " = " + NL + "\t\t\t(org.dom4j.Element)xpath_";
  protected final String TEXT_409 = "_";
  protected final String TEXT_410 = ".selectSingleNode(doc_";
  protected final String TEXT_411 = ");" + NL + "\t\tif(!DocumentHelper.isMatchAtRoot(root_";
  protected final String TEXT_412 = "_";
  protected final String TEXT_413 = ",prefixToUriForNamespace_";
  protected final String TEXT_414 = "_";
  protected final String TEXT_415 = ")) {" + NL + "\t\t\tSystem.err.println(\"warn:::the pre input source content is empty!\");" + NL + "\t\t\t";
  protected final String TEXT_416 = NL + "\t\t\t";
  protected final String TEXT_417 = NL + "\t\t\troot_";
  protected final String TEXT_418 = "_";
  protected final String TEXT_419 = " = (org.dom4j.Element)xpath_";
  protected final String TEXT_420 = "_";
  protected final String TEXT_421 = ".selectSingleNode(doc_";
  protected final String TEXT_422 = ");" + NL + "\t\t}" + NL + "\t}" + NL + "\t";
  protected final String TEXT_423 = NL + "\t// build root xml tree " + NL + "\tif (needRoot_";
  protected final String TEXT_424 = "_";
  protected final String TEXT_425 = ") {" + NL + "\t\tneedRoot_";
  protected final String TEXT_426 = "_";
  protected final String TEXT_427 = " = false;" + NL + "\t\torg.dom4j.XPath xpath_";
  protected final String TEXT_428 = "_";
  protected final String TEXT_429 = " = doc_";
  protected final String TEXT_430 = ".createXPath(\"";
  protected final String TEXT_431 = "\");" + NL + "\t\txpath_";
  protected final String TEXT_432 = "_";
  protected final String TEXT_433 = ".setNamespaceURIs(prefixToUriForNamespace_";
  protected final String TEXT_434 = "_";
  protected final String TEXT_435 = ");" + NL + "\t\troot_";
  protected final String TEXT_436 = "_";
  protected final String TEXT_437 = " = " + NL + "\t\t\t(org.dom4j.Element)xpath_";
  protected final String TEXT_438 = "_";
  protected final String TEXT_439 = ".selectSingleNode(doc_";
  protected final String TEXT_440 = ");" + NL + "\t\t";
  protected final String TEXT_441 = NL + "\t\t";
  protected final String TEXT_442 = NL + "\t\troot_";
  protected final String TEXT_443 = "_";
  protected final String TEXT_444 = " = ";
  protected final String TEXT_445 = ";" + NL + "\t}else{" + NL + "\t\t";
  protected final String TEXT_446 = NL + "\t}";
  protected final String TEXT_447 = NL + "\t" + NL + "\t// build group xml tree ";
  protected final String TEXT_448 = "\t\t" + NL + "\t\tboolean bl_";
  protected final String TEXT_449 = "= false;//true:find the insert node;false:not";
  protected final String TEXT_450 = NL + "\t\tif(bl_";
  protected final String TEXT_451 = "==false){" + NL + "\t\t\tjava.util.List<org.dom4j.Element> listNodes= ";
  protected final String TEXT_452 = ".elements();" + NL + "\t\t\tif(listNodes!=null && listNodes.size()>0){" + NL + "\t\t\t\tint j=0;" + NL + "\t\t\t\tfor(j=0;j<listNodes.size();j++){" + NL + "\t\t\t\t\torg.dom4j.Element tempElem =listNodes.get(j);" + NL + "\t\t\t\t\tjava.util.Map<String,String> currentDeclaredNamespacesMapping = null;" + NL + "\t\t\t\t\t";
  protected final String TEXT_453 = NL + "\t\t\t\t\tif(DocumentHelper.compareNodes(\"";
  protected final String TEXT_454 = "\",tempElem,uriToPrefixForDefaultNamespace_";
  protected final String TEXT_455 = "_";
  protected final String TEXT_456 = ",currentDeclaredNamespacesMapping,";
  protected final String TEXT_457 = "false";
  protected final String TEXT_458 = "true";
  protected final String TEXT_459 = ")){" + NL + "\t\t\t\t\t\tif(";
  protected final String TEXT_460 = "){" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_461 = NL + "\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\tif(j>=listNodes.size()){" + NL + "\t\t\t\t\tbl_";
  protected final String TEXT_462 = "=true;" + NL + "\t\t\t\t}" + NL + "\t\t\t}else{" + NL + "\t\t\t\tbl_";
  protected final String TEXT_463 = "=true;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif(bl_";
  protected final String TEXT_464 = "==true){";
  protected final String TEXT_465 = NL + "\t\t}";
  protected final String TEXT_466 = NL + "\t// build loop xml tree";
  protected final String TEXT_467 = NL;

    static class XMLNode {

        // table parameter of component
        public String name = null;

        public String path = null;

        public String type = null;
        
        public String sourceName=null;

        public String column = null;
        
        public String defaultValue = null;
        
        public int order = 0;
        
        public boolean hasDefaultValue = false;

        // special node
        public int special = 0; // 1 is subtree root, 2 is subtree root parent, 4 is main

        // column
        public IMetadataColumn relatedColumn = null;

        public List<IMetadataColumn> childrenColumnList = new ArrayList<IMetadataColumn>();

        // tree variable
        public XMLNode parent = null;

        public List<XMLNode> attributes = new LinkedList<XMLNode>();

        public List<XMLNode> namespaces = new LinkedList<XMLNode>();
        
        public List<XMLNode> branches = new LinkedList<XMLNode>();

        public List<XMLNode> elements = new LinkedList<XMLNode>(); // the main element is the last element

        public XMLNode(String path, String type, XMLNode parent, String column, String value,int order) {
        	this.order = order;
            this.path = path;
            this.parent = parent;
            this.type = type;
            this.column = column;
            this.defaultValue = value;
            
            if (column.indexOf(":") >= 0) {
                this.column = column.substring(column.indexOf(":") + 1);
                this.sourceName = column.substring(0, column.indexOf(":"));
            }else{
            	this.sourceName = column;
            } 
            if ("ELEMENT".equals(type)) {
                this.name = path.substring(path.lastIndexOf("/") + 1);
            } else if("ATTRIBUTE".equals(type)) {
            	this.name = path;
            	this.path = parent.path + "/@" + path;
            } else {
                this.name = path;
            }
        }
        
        public boolean isMainNode(){
            return 4 == (special & 4);
        }
        
        public boolean isSubTreeRoot(){
            return 1 == (special & 1);
        }
        
        public boolean isSubTreeParent(){
            return 2 == (special & 2);
        }
        
        public List<XMLNode> getNextSiblings() {
        	List<XMLNode> result = new ArrayList<XMLNode>();
        	if(parent!=null && parent.elements!=null){
        		for(XMLNode sibing : parent.elements){
        			if(order < sibing.order){
        				result.add(sibing);
        			}
        		}
        	}
        	return result;
        }
        
    }

    public XMLNode getInsertNode(XMLNode root, List<XMLNode> mainNode, List<String> listPreConns) {
        XMLNode returnNode = null;

        String[] existConns = root.sourceName.split("=");
        List<String> listExistConns = java.util.Arrays.asList(existConns);
        boolean isContains = false;
        if (listExistConns.contains(mainNode.get(0).sourceName)) {
            for (int i = 0; i < listPreConns.size(); i++) {
                if (listExistConns.contains(listPreConns.get(i))) {
                    isContains = true;
                    break;
                }
            }
        }

        if (isContains) {
            for (XMLNode node : root.elements) {
            	if(!node.isMainNode()) {
            		continue;
            	}
                returnNode = getInsertNode(node, mainNode, listPreConns);
                if (returnNode != null) {
                    break;
                }
            }
        }

        if (isContains && returnNode == null) {
            returnNode = root;
        }

        return returnNode;
    }

    // return [0] is root(XMLNode), [1] is groups(List<XMLNode>), [2] loop(XMLNode)
    public XMLNode getRootTree(List<Map<String, String>> rootTable) {

        XMLNode root = null;
        XMLNode tmpParent = null;

        List<Map<String, String>> tmpTable = new ArrayList<Map<String, String>>();

        Map<String, String> currMainMap = null; // used to save the current Main Map in tmpTable
        Map<String, String> currMainRootMap = null; // used to save the current main map in rootTable
        String sourceName;
        for (int i = 0; i < rootTable.size(); i++) {
            if (rootTable.get(i).get("COLUMN").indexOf(":") >= 0) {
                sourceName = rootTable.get(i).get("COLUMN").substring(0, rootTable.get(i).get("COLUMN").indexOf(":"));
            } else {
                sourceName = rootTable.get(i).get("COLUMN");
            }
            if (rootTable.get(i).get("ATTRIBUTE").equals("main") == true
                    || rootTable.get(i).get("ATTRIBUTE").equals("branch") == true) {
                currMainRootMap = rootTable.get(i);
            }
            if (i == 0) {
                Map<String, String> tmpMap = new HashMap<String, String>();
                tmpMap.put("PATH", rootTable.get(i).get("PATH"));
                tmpMap.put("COLUMN", rootTable.get(i).get("COLUMN"));
                tmpMap.put("VALUE", rootTable.get(i).get("VALUE"));
                tmpMap.put("ATTRIBUTE", rootTable.get(i).get("ATTRIBUTE"));
                tmpMap.put("ORDER", rootTable.get(i).get("ORDER"));
                tmpMap.put("SOURCE", sourceName);
                tmpTable.add(tmpMap);
            } else {
                int j = 0;
                for (j = 0; j < tmpTable.size(); j++) {
                    if (tmpTable.get(j).get("ATTRIBUTE").equals("main") == true
                            || tmpTable.get(j).get("ATTRIBUTE").equals("branch") == true) {
                        currMainMap = tmpTable.get(j); // save the current main node
                    }
                    if (currMainMap.get("PATH").equals(currMainRootMap.get("PATH"))) {
                        if (tmpTable.get(j).get("PATH").equals(rootTable.get(i).get("PATH"))) {
                            // use the character = to separate the source connection
                            tmpTable.get(j).put("SOURCE", tmpTable.get(j).get("SOURCE") + "=" + sourceName);
                        } else {
                            // add the attributes or namespaces of the node
                            Map<String, String> tmpMap = new HashMap<String, String>();
                            tmpMap.put("PATH", rootTable.get(i).get("PATH"));
                            tmpMap.put("COLUMN", rootTable.get(i).get("COLUMN"));
                            tmpMap.put("VALUE", rootTable.get(i).get("VALUE"));
                            tmpMap.put("ATTRIBUTE", rootTable.get(i).get("ATTRIBUTE"));
                            tmpMap.put("ORDER", rootTable.get(i).get("ORDER"));
                            tmpMap.put("SOURCE", sourceName);
                            tmpTable.add(tmpMap);
                        }
                        break;
                    } else {
                        // nothing to do
                    }
                }

                if (j >= tmpTable.size()) {// doesn't find the node in the tmpTable, then it is a new node
                    Map<String, String> tmpMap = new HashMap<String, String>();
                    tmpMap.put("PATH", rootTable.get(i).get("PATH"));
                    tmpMap.put("COLUMN", rootTable.get(i).get("COLUMN"));
                    tmpMap.put("VALUE", rootTable.get(i).get("VALUE"));
                    tmpMap.put("ATTRIBUTE", rootTable.get(i).get("ATTRIBUTE"));
                    tmpMap.put("ORDER", rootTable.get(i).get("ORDER"));
                    tmpMap.put("SOURCE", sourceName);
                    tmpTable.add(tmpMap);
                }

            }
        }

        if (tmpTable != null && tmpTable.size() > 0) {
            for (Map<String, String> tmpMap : tmpTable) {
                XMLNode tmpNew = null;
                
                int currOrder = 0;
                if(tmpMap.get("ORDER")!=null && !"".equals(tmpMap.get("ORDER").trim())){
            		currOrder = Integer.parseInt(tmpMap.get("ORDER"));
            	}
            	
                if (tmpMap.get("ATTRIBUTE").equals("attri")) {
                    tmpNew = new XMLNode(tmpMap.get("PATH"), "ATTRIBUTE", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                    tmpNew.sourceName = tmpMap.get("SOURCE");
                    tmpParent.attributes.add(tmpNew);
                } else if (tmpMap.get("ATTRIBUTE").equals("ns")) {
                    tmpNew = new XMLNode(tmpMap.get("PATH"), "NAMESPACE", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                    tmpNew.sourceName = tmpMap.get("SOURCE");
                    tmpParent.namespaces.add(tmpNew);
                } else {
                    if (tmpParent == null) {
                        tmpNew = new XMLNode(tmpMap.get("PATH"), "ELEMENT", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                        tmpNew.sourceName = tmpMap.get("SOURCE");
                        //tmpNew.special |= 1;
                        root = tmpNew;
                    } else {
                        String tmpParentPath = tmpMap.get("PATH").substring(0, tmpMap.get("PATH").lastIndexOf("/"));

                        while (tmpParent != null && !tmpParentPath.equals(tmpParent.path)) {
                            tmpParent = tmpParent.parent;
                        }

                        tmpNew = new XMLNode(tmpMap.get("PATH"), "ELEMENT", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                        tmpNew.sourceName = tmpMap.get("SOURCE");

                        tmpParent.elements.add(tmpNew);
                    }
                    if (tmpMap.get("ATTRIBUTE").equals("main")) {
                        tmpNew.special |= 4;
                    }
                    tmpParent = tmpNew;
                }
            }
            return root;
        }
        return null;
    }
    
  /**
     * 
     * distinguish the xml tags from different source node
     * 
     * @param rootTable
     * @param groupTable
     * @param loopTable
     * @param sourceNode
     * @return
     * @author wliu
     */
    public List<List<Map<String, String>>> getTables(List<Map<String, String>> rootTable, List<Map<String, String>> groupTable,
            List<Map<String, String>> loopTable, String sourceNode) {

        List<List<Map<String, String>>> tables = new ArrayList<List<Map<String, String>>>();

        tables.add(rootTable);
        tables.add(groupTable);
        tables.add(loopTable);

        List<Map<String, String>> resultRoot = new ArrayList<Map<String, String>>();
        List<Map<String, String>> resultGroup = new ArrayList<Map<String, String>>();
        List<Map<String, String>> resultLoop = new ArrayList<Map<String, String>>();

        List<List<Map<String, String>>> result = new ArrayList<List<Map<String, String>>>();
        result.add(resultRoot);
        result.add(resultGroup);
        result.add(resultLoop);

        for (int i = 0; i < tables.size(); i++) {

            if (rootTable != null && tables.get(i).size() > 0) {
                // find and save the root tag from the source node to the resultRoot List
                for (Map<String, String> map : tables.get(i)) {

                    boolean b_exit = map.get("COLUMN").equals(sourceNode) || (map.get("COLUMN").indexOf(":")>0 && map.get("COLUMN").substring(0, map.get("COLUMN").indexOf(":")).equals(sourceNode));
                    if (b_exit ) {
                        result.get(i).add(map);
                    }
                }
            }
        }

        return result;
        
    }
    
   	
    public boolean allOrderValid(List<Map<String, String>> rootTable, List<Map<String, String>> groupTable,
            List<Map<String, String>> loopTable) {
    	List<List<Map<String, String>>> tables = new ArrayList<List<Map<String, String>>>();
        tables.add(rootTable);
        tables.add(groupTable);
        tables.add(loopTable);
        
        for (List<Map<String, String>> table : tables) {
        	for (Map<String, String> row : table) {
        		if(row.get("ORDER")==null || "".equals(row.get("ORDER").trim())) {
        			return false;
        		}
        	}
        }
        
        return true;
    
    }
    
    // return [0] is root(XMLNode), [1] is groups(List<XMLNode>), [2] loop(XMLNode)
    public Object[] getTree(List<Map<String, String>> rootTable, List<Map<String, String>> groupTable,
            List<Map<String, String>> loopTable, List<IMetadataColumn> colList) {
        List<List<Map<String, String>>> tables = new ArrayList<List<Map<String, String>>>();
        tables.add(rootTable);
        tables.add(groupTable);
        tables.add(loopTable);

        XMLNode root = null;
        List<XMLNode> mains = new ArrayList<XMLNode>();
        List<XMLNode> groups = new ArrayList<XMLNode>();
        XMLNode loop = null;
        
        XMLNode tmpParent = null;
        XMLNode tmpMainNode = null;
        if (loopTable == null || loopTable.size() == 0) {
            return null;
        }
        String mainPath = loopTable.get(0).get("PATH");
        for (List<Map<String, String>> tmpTable : tables) {
            tmpParent = tmpMainNode;
            for (Map<String, String> tmpMap : tmpTable) {
                XMLNode tmpNew = null;
                
                int currOrder = 0;
                if(tmpMap.get("ORDER")!=null && !"".equals(tmpMap.get("ORDER").trim())){
            		currOrder = Integer.parseInt(tmpMap.get("ORDER"));
            	}
                
                if (tmpMap.get("ATTRIBUTE").equals("attri")) {
                    tmpNew = new XMLNode(tmpMap.get("PATH"), "ATTRIBUTE", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                    tmpParent.attributes.add(tmpNew);
                } else if (tmpMap.get("ATTRIBUTE").equals("ns")) {
                    tmpNew = new XMLNode(tmpMap.get("PATH"), "NAMESPACE", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                    tmpParent.namespaces.add(tmpNew);
                } else {
                    if (tmpParent == null) {
                        tmpNew = new XMLNode(tmpMap.get("PATH"), "ELEMENT", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                        //tmpNew.special |= 1;
                        root = tmpNew;
                        mains.add(root);
                    } else {
                        String tmpParentPath = tmpMap.get("PATH").substring(0, tmpMap.get("PATH").lastIndexOf("/"));
                        while (tmpParent != null && !tmpParentPath.equals(tmpParent.path)) {
                            tmpParent = tmpParent.parent;
                        }
                        tmpNew = new XMLNode(tmpMap.get("PATH"), "ELEMENT", tmpParent, tmpMap.get("COLUMN"), tmpMap.get("VALUE"),currOrder);
                        tmpParent.elements.add(tmpNew);
                        if (tmpMap.get("ATTRIBUTE").equals("main")) {
                            if (tmpTable == groupTable) {
                                tmpNew.special |= 1;
                                tmpParent.special |= 2;
                                groups.add(tmpNew);
                            } else if (tmpTable == loopTable) {
                                tmpNew.special |= 1;
                                tmpParent.special |= 2;
                                loop = tmpNew;
                            }else if (tmpTable == rootTable){
                                mains.add(tmpNew);
                            }
                        }
                    }
                    if (tmpMap.get("ATTRIBUTE").equals("main")) {
                        tmpMainNode = tmpNew;
                        tmpNew.special |= 4;
                    }
                    tmpParent = tmpNew;
                }
                setIMetadataColumn(tmpNew, colList);
                setDefaultValues(tmpNew);//add by wliu
            }
        }
        return new Object[] { mains, groups, loop };
    }
    
    private void setDefaultValues(XMLNode node){
    	if(node.defaultValue != null && !"".equals(node.defaultValue)){
    		XMLNode tmp = node;
    		while(tmp !=null){
    			tmp.hasDefaultValue = true;
    			if(tmp.isMainNode()){
    				break;
    			}
    			tmp = tmp.parent;
    		}
    	}
    }
    
    private void setIMetadataColumn(XMLNode node, List<IMetadataColumn> colList) {
        String value = null;
        JavaType javaType = null;
        if (node.column != null && node.column.length() > 0) {
            for (IMetadataColumn column : colList) {
                if (column.getLabel().equals(node.column)) {
                    node.relatedColumn = column;
                    XMLNode tmp = node;
                    while (tmp != null) {
                        if (!tmp.childrenColumnList.contains(column)) {
                            tmp.childrenColumnList.add(column);
                        }
                        if(tmp.isMainNode()){
                            break;
                        }
                        tmp = tmp.parent;
                    }
                }
            }
        }
    }

    public List<XMLNode> getGroupByNodeList(XMLNode group) {
        List<XMLNode> list = new ArrayList<XMLNode>();
        for (XMLNode attri : group.attributes) {
            if ((attri.column != null && attri.column.length() != 0) || 
            	(attri.defaultValue != null && !"".equals(attri.defaultValue)) ) {
                list.add(attri);
            }
        }
        if (group.relatedColumn != null || (group.defaultValue != null && !"".equals(group.defaultValue)) ) {
            list.add(group);
        } else {
            for (XMLNode element : group.elements) {
                if (!element.isMainNode()) {
                    list.addAll(getGroupByNodeList(element));
                }
            }
        }
        return list;
    }

    public XMLNode removeEmptyElement(XMLNode root) {
        List<XMLNode> removeNodes = new LinkedList<XMLNode>();
        for (XMLNode attri : root.attributes) {
            if ((attri.column == null || attri.column.length() == 0) && 
            		(attri.defaultValue == null || "".equals(attri.defaultValue)) ) {
                attri.parent = null;
                removeNodes.add(attri);
            }
        }
        root.attributes.removeAll(removeNodes);

        removeNodes.clear();
        for (XMLNode ns : root.namespaces) {
            if ( (ns.column == null || ns.column.length() == 0)
            		&& (ns.defaultValue == null || "".equals(ns.defaultValue)) ) {
                ns.parent = null;
                removeNodes.add(ns);
            }
        }
        root.namespaces.removeAll(removeNodes);

        removeNodes.clear();
        for (XMLNode child : root.elements) {
            removeNodes.add(removeEmptyElement(child));
        }
        root.elements.removeAll(removeNodes);

        if (root.attributes.size() == 0 && root.namespaces.size() == 0 && root.elements.size() == 0
                && (root.column == null || root.column.length() == 0)
                && (root.defaultValue == null || "".equals(root.defaultValue)) ) {
            return root;
        } else {
            return null;
        }
    }
    
    //support namespace helper
    //we need to set namespace or qname where there is select action
    class NamespaceHelper{
		
		int defaultPrefixCount = 0;
		
		XMLNode currentGroupNode = null;
		
		String currentFinalGroupXpath = null;
		
		Map<String,String> prefixToUriForNamespace = new HashMap<String,String>();
		
		Map<String,String> xpathToPrefixForDefaultNamespace = new HashMap<String,String>();
		
		Map<String,String> uriToPrefixForDefaultNamespace = new HashMap<String,String>();
		
		String prefix = null;
		
		String uri = null;
		
		String localname = null;
		
		public void lookupNamespace(XMLNode node) {
			String name = node.name;
			String xpath = node.path;
			int idx = name.indexOf(":");
			if(idx == -1) {
				String defualtPrefix = xpathToPrefixForDefaultNamespace.get(xpath);
				uri = prefixToUriForNamespace.get(defualtPrefix);
				prefix = "";
				localname = name;
			} else {
				prefix = name.substring(0,idx);
				uri = prefixToUriForNamespace.get(prefix);
				localname = (uri == null ? name : name.substring(idx + 1));
			}
		}
		
		public String getPrefix() {
			return prefix;
		}
		
		public String getUri() {
			return uri;
		}
		
		public String getLocalName() {
			return localname;
		}

		List<XMLNode> currentGroupDeclaredNamespaces = null;
		
		public NamespaceHelper(XMLNode rootNode){
			collectionNS(rootNode,null);
		}
		
		//init method for one group node in UI.
		public void setGroupNode(XMLNode currentGroup) {
			currentGroupNode = currentGroup;
			currentGroupDeclaredNamespaces = currentGroup.namespaces;
			currentFinalGroupXpath = buildXPathWithPrefix(currentGroup);
		}
		
		public String buildCurrentGroupDeclaredNamespacesMapping(String name) {
			StringBuilder sb = new StringBuilder();
			
			if(currentGroupDeclaredNamespaces.size() > 0) {
				sb.append(name + " = new java.util.HashMap<String,String>();");
			}
			
			for(XMLNode namespace : currentGroupDeclaredNamespaces) {
				if(namespace.name != null && !"".equals(namespace.name)){
					sb.append(name+".put(\""+namespace.name+"\",\""+namespace.defaultValue+"\");"); 
				}else{//default namespace
					sb.append(name+".put(\"\",\""+namespace.defaultValue+"\");"); 
				}
			}
			
			return sb.toString();
		}
		
		public void buildInfoForNamespace(XMLNode node, String[] arrNames ,List<String> prefixs, List<String> uris){
			String groupNodeXPath = currentGroupNode.path;
			String currentNodeXPath = node.path;
			int idx = 0;
			//cache current node prefix and uri of namespace
			idx = node.name.indexOf(":");
			if(idx!=-1) {//not default namespace
				String prefix = node.name.substring(0,idx);
				prefixs.add(prefix);
				uris.add(prefixToUriForNamespace.get(prefix));
			} else {//default namespace
				prefixs.add(null);
				String defaultPrefix = xpathToPrefixForDefaultNamespace.get(currentNodeXPath);
				uris.add(prefixToUriForNamespace.get(defaultPrefix));
			}
			
			//cache sub nodes prefix and uri of namespace
			String xpath = groupNodeXPath;
			for(int i=1; i<arrNames.length; i++){
				String arrName = arrNames[i];
				xpath = xpath + "/" + arrName;
				
				idx = arrName.indexOf(":");
				if(idx!=-1) {//not default namespace
					String prefix = node.name.substring(0,idx);
					prefixs.add(prefix);
					uris.add(prefixToUriForNamespace.get(prefix));
				} else {//default namespace
					prefixs.add(null);
					String defaultPrefix = xpathToPrefixForDefaultNamespace.get(xpath);
					uris.add(prefixToUriForNamespace.get(defaultPrefix));
				}
				
				//change to localname
				if(arrName!=null) {
					idx = arrName.indexOf(":");
					if(idx!=-1) {
						arrNames[i] = arrName.substring(idx + 1);
					}
				}
			}
					
		}
		
		private String buildXPathWithPrefix(XMLNode node){
			String xpath = node.path;
			StringBuilder finalXPath = new StringBuilder();
			return buildXPathWithPrefix(finalXPath, xpath);
		}
		
		private String buildXPathWithPrefix(StringBuilder finalXPath, String xpath){
			List<String> nodePaths = new ArrayList<String>();
			
			while(xpath.lastIndexOf("/") != -1){
				nodePaths.add(xpath);
				xpath = xpath.substring(0,xpath.lastIndexOf("/"));
			}
			
			for(int i=nodePaths.size()-1; i>=0; i--){
				String nodePath = nodePaths.get(i);
				String prefix = xpathToPrefixForDefaultNamespace.get(nodePath);
				String nodeName = nodePath.substring(nodePath.lastIndexOf("/")+1);
				
				finalXPath.append("/");
				if(prefix != null && !"".equals(prefix)){
					finalXPath.append(prefix);
					finalXPath.append(":");
					finalXPath.append(nodeName);
				}else{
					finalXPath.append(nodeName);
				}
			}
			
			return finalXPath.toString();
		}
		
		public String buildUriToPrefixForDefaultNamespaceMapping(String name){
			StringBuilder sb = new StringBuilder();
			for (Object key : uriToPrefixForDefaultNamespace.keySet()) { 
			    Object val = uriToPrefixForDefaultNamespace.get(key);
			    sb.append(name+".put(\""+key+"\",\""+val+"\");"); 
			} 
			return sb.toString();
		}
		
		public String buildPrefixToUriForNamespaceMapping(String name){
			StringBuilder sb = new StringBuilder();
			for (Object key : prefixToUriForNamespace.keySet()) { 
			    Object val = prefixToUriForNamespace.get(key);
			    sb.append(name+".put(\""+key+"\",\""+val+"\");"); 
			} 
			return sb.toString();
		}
		
		public String getCurrentFinalGroupXpath() {
			return currentFinalGroupXpath;
		}
		
		private void collectionNS(XMLNode currentNode, String parentDefaultPrefix){
			for(XMLNode namespace : currentNode.namespaces){
				if(namespace.name != null && !"".equals(namespace.name)){
					prefixToUriForNamespace.put(namespace.name,namespace.defaultValue);
				}else{//default namespace setting
					//when default namespace,for the same uri,we need to make sure that default prefix is the same
					String defaultPrefix = uriToPrefixForDefaultNamespace.get(namespace.defaultValue);
					if(defaultPrefix == null) {
						defaultPrefix = findVaildDefaultPrefix();
					}
					prefixToUriForNamespace.put(defaultPrefix,namespace.defaultValue);
					parentDefaultPrefix = defaultPrefix;
				}
			}
			
			if(!currentNode.name.contains(":")){
				if(parentDefaultPrefix != null && !"".equals(parentDefaultPrefix)){
					xpathToPrefixForDefaultNamespace.put(currentNode.path,parentDefaultPrefix);
					uriToPrefixForDefaultNamespace.put(prefixToUriForNamespace.get(parentDefaultPrefix),parentDefaultPrefix);
				}
			}
			
			for(XMLNode attribute : currentNode.attributes){
				collectionNS(attribute, parentDefaultPrefix);
			}
			
			for(XMLNode element : currentNode.elements){
				collectionNS(element, parentDefaultPrefix);
			}
			
		}
		
		private String findVaildDefaultPrefix(){
			String prefix = "TPrefix"+defaultPrefixCount;
			defaultPrefixCount++;
			if(prefixToUriForNamespace.get(prefix)==null || "".equals(prefixToUriForNamespace.get(prefix))){
				return prefix;
			}else{
				return findVaildDefaultPrefix();
			}
		}
		
	}

    public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
// ------------------- *** Common code start *** ------------------- //
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
final INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();

String incomingName = (String)codeGenArgument.getIncomingName();
List<IMetadataTable> metadatas = NodeUtil.getIncomingMetadataTable(node, IConnectionCategory.FLOW);
String encoding = ElementParameterParser.getValue(node, "__ENCODING__");

if ((metadatas!=null)&&(metadatas.size()>0)) {
    	final List< ? extends IConnection> incomingConns = node.getIncomingConnections();
    	
  		//Notice here: only for the code viewer, because when click the tUnite component, it doesn't know which is the right input connection. 
    	if (incomingName == null && incomingConns.size() > 0) 
    	{ 
    	   incomingName = incomingConns.get(0).getName(); 
    	}    	 	
    	if(incomingConns!=null && incomingConns.size()>0){
    	/**
    		//the first connection name
    		String firstConnName=incomingConns.get(0).getUniqueName();
    	
	    	IConnection incomingConn = null;
	    	INode preNode = null;
	    	List<IMetadataTable> preMetadatas = null;
	    	IMetadataTable preMetadata = null;
	    	String sourceName=null;
	    	for (IConnection conn : incomingConns) {
	    		if ( conn.getLineStyle().equals(EConnectionType.FLOW_MERGE) && conn.getName().equals(incomingName)) {
					
					incomingConn = conn;
					preNode = incomingConn.getSource();
					preMetadatas = preNode.getMetadataList();
					preMetadata = preMetadatas.get(0);
					sourceName = incomingConn.getUniqueName();
	    		    break;
	    		}
	    	}
	    	*/
//    		if(preMetadata!=null){

    stringBuffer.append(TEXT_1);
    
//XMLTool
class XMLTool{
	public boolean advancedSeparator = false;
	public String thousandsSeparator = null;
 	public String decimalSeparator =null;
	public String connName = null;
	public String cid = null;
	
	public void getValue(XMLNode node){

    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(node.relatedColumn.getLabel());
    stringBuffer.append(TEXT_4);
    
	}

	public void getValue(IMetadataColumn column){
		JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
		String defaultValue=column.getDefault();
		boolean isNotSetDefault = false;
		if(defaultValue!=null){
			isNotSetDefault = defaultValue.length()==0;
		}else{
			isNotSetDefault=true;
		}

    stringBuffer.append(TEXT_5);
    
		if(column.isNullable()){

    stringBuffer.append(TEXT_6);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_8);
    
		}
		
        if(advancedSeparator && JavaTypesManager.isNumberType(javaType, column.isNullable())) { 
        	if(javaType == JavaTypesManager.BIGDECIMAL) {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(column.getPrecision() == null? connName + "." + column.getLabel() : connName + "." + column.getLabel() + ".setScale(" + column.getPrecision() + ", java.math.RoundingMode.HALF_UP)" );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( thousandsSeparator);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(decimalSeparator );
    stringBuffer.append(TEXT_12);
    
    		} else {

    stringBuffer.append(TEXT_13);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_15);
    stringBuffer.append( thousandsSeparator );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(decimalSeparator );
    stringBuffer.append(TEXT_17);
    
	   		}
        } else if(JavaTypesManager.isJavaPrimitiveType( column.getTalendType(), column.isNullable())){

    stringBuffer.append(TEXT_18);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_20);
    
        }else if(javaType == JavaTypesManager.DATE){
            if( column.getPattern() != null && column.getPattern().trim().length() != 0 ){

    stringBuffer.append(TEXT_21);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(column.getPattern());
    stringBuffer.append(TEXT_24);
    
            }else{

    stringBuffer.append(TEXT_25);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(column.getLabel());
    
           }
        }else if (javaType == JavaTypesManager.BIGDECIMAL) {

    stringBuffer.append(TEXT_27);
    stringBuffer.append(column.getPrecision() == null? connName + "." + column.getLabel() : connName + "." + column.getLabel() + ".setScale(" + column.getPrecision() + ", java.math.RoundingMode.HALF_UP)" );
    stringBuffer.append(TEXT_28);
    
        }else{

    stringBuffer.append(TEXT_29);
    stringBuffer.append(connName);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_31);
    
		}
		if(column.isNullable()){
			
    stringBuffer.append(TEXT_32);
     
			if(isNotSetDefault == false){
				
    stringBuffer.append(column.getDefault());
    
			}else{
				
    stringBuffer.append(TEXT_33);
    
			}
		}

    stringBuffer.append(TEXT_34);
    
	}
}

abstract class TouchXMLNode {
	protected String cid = null;
	
	abstract void getXMLNode(String currEleName);
	
	abstract void getXMLElement(String currEleName);
	
	abstract void putCurrentElementByQName(String currEleName);
	
	abstract void putCurrentElementByNull(String currEleName);
	
	abstract void putCurrentElementByParentWithoutNamespacePrefix(String currEleName,String parentName,XMLNode node,int index);
	
	abstract void putCurrentElementByParent(String currEleName,String parentName,XMLNode node);
	
	abstract void putSubTreeRootParentByCurrentElement(String currEleName);
	
	abstract void putSubTreeRootParentByNull();
	
	abstract void putSubTreeRootParentBySourceRoot(String sourceName);
	
	abstract void putSourceRoot(String sourceName);
	
	abstract void putSubTreeRootParentByTempElem();
	
	abstract void putDocument();
}

//get mean reference
//put mean declare,assign action
class ReferenceTouchXMLNode extends TouchXMLNode {

	void getXMLNode(String currEleName) {

    stringBuffer.append(TEXT_35);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cid);
    
	}
	
	void getXMLElement(String currEleName) {
		getXMLNode(currEleName);
	}

	void putCurrentElementByQName(String currEleName) {

    stringBuffer.append(TEXT_37);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_41);
    
	}
	
	void putCurrentElementByNull(String currEleName) {

    stringBuffer.append(TEXT_42);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_44);
    
	}
	
	void putCurrentElementByParentWithoutNamespacePrefix(String currEleName,String parentName,XMLNode node,int index) {

    stringBuffer.append(TEXT_45);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(parentName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(node.name.substring(index+1));
    stringBuffer.append(TEXT_50);
    
	}
	
	void putCurrentElementByParent(String currEleName,String parentName,XMLNode node) {

    stringBuffer.append(TEXT_51);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(parentName);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(node.name);
    stringBuffer.append(TEXT_56);
    
	}
	
	void putSubTreeRootParentByCurrentElement(String currEleName) {

    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_60);
    
	}
	
	void putSubTreeRootParentByNull() {

    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_62);
    
	}
	
	void putSubTreeRootParentBySourceRoot(String sourceName) {

    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_64);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    
	}
	
	void putSourceRoot(String sourceName) {
		//do nothing
	}
	
	void putSubTreeRootParentByTempElem() {

    stringBuffer.append(TEXT_67);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_68);
    
	}
	
	void putDocument() {
		//do nothing
	}
}

class MappingTouchXMLNode extends TouchXMLNode {

	void getXMLNode(String currEleName) {

    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_71);
    
	}
	
	void getXMLElement(String currEleName) {

    stringBuffer.append(TEXT_72);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_74);
    
	}

	void putCurrentElementByQName(String currEleName) {

    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_79);
    
	}
	
	void putCurrentElementByNull(String currEleName) {
		//do nothing
	}
	
	void putCurrentElementByParentWithoutNamespacePrefix(String currEleName,String parentName,XMLNode node,int index) {

    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_82);
    getXMLNode(parentName);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(node.name.substring(index+1));
    stringBuffer.append(TEXT_84);
    
	}
	
	void putCurrentElementByParent(String currEleName,String parentName,XMLNode node) {

    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_87);
    getXMLNode(parentName);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(node.name);
    stringBuffer.append(TEXT_89);
    
	}
	
	void putSubTreeRootParentByCurrentElement(String currEleName) {

    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_91);
    getXMLNode(currEleName);
    stringBuffer.append(TEXT_92);
    
	}
	
	void putSubTreeRootParentByNull() {

    stringBuffer.append(TEXT_93);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_94);
    
	}
	
	void putSubTreeRootParentBySourceRoot(String sourceName) {

    stringBuffer.append(TEXT_95);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    
	}
	
	void putSourceRoot(String sourceName) {

    stringBuffer.append(TEXT_99);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_102);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_103);
    
	}
	
	void putSubTreeRootParentByTempElem() {

    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_105);
    
	}
	
	void putDocument() {

    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_108);
    
	}
}

    stringBuffer.append(TEXT_109);
    
//65535 limit
class BigMethodHelper {
	protected String cid = null;
	protected boolean isOptimizeCodeForXMLNode = false;
	protected int xmlNodeOptNum = 100;
	protected int index = -1;
	
	protected String generateId = "";
	
	public BigMethodHelper() {
		initIsOptimizeCodeForXMLNode();
	}
	
	public void setGenerateId(String generateId) {
		this.generateId = generateId; 
	}
	
	public void resetIndex() {
		index = -1;
	}
	
	public TouchXMLNode getTouchXMLNode() {
		if(isOptimizeCodeForXMLNode) {
			return new MappingTouchXMLNode();
		}
		return new ReferenceTouchXMLNode();
	}
	
	public void initIsOptimizeCodeForXMLNode(){
		String xmlNodeOptNumStr = ElementParameterParser.getValue(node, "__XMLNODE_OPT_NUM__");
		if(xmlNodeOptNumStr!=null && !"".equals(xmlNodeOptNumStr) && !"\"\"".equals(xmlNodeOptNumStr)){
			xmlNodeOptNum  = Integer.parseInt(xmlNodeOptNumStr);
		}
		
        List<Map<String, String>> rootTable =
        	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__ROOT__");
        List<Map<String, String>> groupTable =
        	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__GROUP__");
        List<Map<String, String>> loopTable =
        	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__LOOP__");
        
        int elementNumber = getElementNumber(rootTable) + getElementNumber(groupTable) + getElementNumber(loopTable);
        if(elementNumber > xmlNodeOptNum) {
			isOptimizeCodeForXMLNode = true;
        }
	}
	
	private int getElementNumber(List<Map<String, String>> nodeTable) {
		if(nodeTable == null) {
			return 0;
		}
		
		int result = 0;
		for(Map<String,String> node : nodeTable) {
			if(node == null) {
				continue;
			}
			
			if("attri".equals(node.get("ATTRIBUTE")) || "ns".equals(node.get("ATTRIBUTE"))) {
				continue;
			}
			
			result++;
		}
		
		return result;
	}
	
	public void generateClassNameWithRBlock() {
		if (this.isOptimizeCodeForXMLNode) {

    stringBuffer.append(TEXT_110);
    stringBuffer.append(generateId);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_112);
    
		}
	}
	
	public void generateLeftBlock() {
		if (this.isOptimizeCodeForXMLNode) {

    stringBuffer.append(TEXT_113);
    
		}
	}
	
	public void generateMethod() {
		if(isOptimizeCodeForXMLNode) {
			if(index == -1) {

    stringBuffer.append(TEXT_114);
    stringBuffer.append((index+1)/xmlNodeOptNum);
    stringBuffer.append(TEXT_115);
    
			} else if((index+1)%xmlNodeOptNum==0){

    stringBuffer.append(TEXT_116);
    stringBuffer.append((index+1)/xmlNodeOptNum);
    stringBuffer.append(TEXT_117);
    
			}
			index++;
		}
	}
	
	public void generateMethodCall() {
		if (this.isOptimizeCodeForXMLNode) {

    stringBuffer.append(TEXT_118);
    stringBuffer.append(generateId);
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(generateId);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_122);
    stringBuffer.append(generateId);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_124);
    
			int count = index + 1;
			for(int i = 0; i < count; i++) {
				if(i%xmlNodeOptNum==0){

    stringBuffer.append(TEXT_125);
    stringBuffer.append(generateId);
    stringBuffer.append(TEXT_126);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(i/xmlNodeOptNum);
    stringBuffer.append(TEXT_128);
    
				}
			}
		}
	}
	
}

    stringBuffer.append(TEXT_129);
    
// ------------------- *** Dom4j generation mode start *** ------------------- //
class GenerateToolByDom4j{
	String cid = null;
	boolean allowEmpty = false;
	boolean outputAsXSD = false;
	XMLTool tool = null;
	NamespaceHelper namespaceHelper = null;
	
	boolean allOrderValid = false;
	
	//opt for big xml config tree
	BigMethodHelper bigMethodHelper = null;
	TouchXMLNode touchXMLNode = null;
	
	public GenerateToolByDom4j() {
		bigMethodHelper = new BigMethodHelper();
		touchXMLNode = bigMethodHelper.getTouchXMLNode();
	}
	
	public void generateCode(XMLNode node, String currEleName, String parentName){
		if(!("ELEMENT").equals(node.type)){
			return;
		}
		
		bigMethodHelper.setGenerateId(currEleName);
		//start the class
		bigMethodHelper.generateClassNameWithRBlock();
		
		bigMethodHelper.resetIndex();
		
		generateMainCode(node,currEleName,parentName);
		
		//end the last method
		bigMethodHelper.generateLeftBlock();
		
		//end the class
		bigMethodHelper.generateLeftBlock();
		
		bigMethodHelper.generateMethodCall();
	}
	
	public void generateMainCode(XMLNode node, String currEleName, String parentName){
		if(("ELEMENT").equals(node.type)){
			bigMethodHelper.generateMethod();
			
			createElement(currEleName,node,parentName);
			setText(currEleName,node);
			for(XMLNode ns:node.namespaces){
				addNameSpace(currEleName,ns);
			}
			for(XMLNode attri:node.attributes){
				addAttribute(currEleName,attri);
			}
			int idx = node.name.indexOf(":");
			if(idx>0){
				String prefix = node.name.substring(0,idx);
				String localName = node.name.substring(idx + 1);

    stringBuffer.append(TEXT_130);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_131);
    stringBuffer.append(localName);
    stringBuffer.append(TEXT_132);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_134);
    
			}
			int index = 0;
			for(XMLNode child:node.elements){
				if(0==(child.special & 1)){
					generateMainCode(child,currEleName+"_"+index++,currEleName);
				}
			}
			if(node.relatedColumn != null && (node.special & 2)==0 && (node.special & 1)==0){
				if(!outputAsXSD && !allowEmpty){

    stringBuffer.append(TEXT_135);
    touchXMLNode.getXMLNode(currEleName);
    stringBuffer.append(TEXT_136);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_137);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_138);
    touchXMLNode.getXMLNode(parentName);
    stringBuffer.append(TEXT_139);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_140);
    
				}
			}
		}
	}
		
	private void createElement(String currEleName, XMLNode node, String parentName){
		int index = node.name.indexOf(":");
		
		if((5==(node.special & 5)) && allOrderValid){
			namespaceHelper.lookupNamespace(node);
			String uri = namespaceHelper.getUri();
			uri = uri == null ? "" : uri;
			String prefix = namespaceHelper.getPrefix();
			String localName = namespaceHelper.getLocalName();
		

    stringBuffer.append(TEXT_141);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_142);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(localName);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_146);
    touchXMLNode.putCurrentElementByQName(currEleName);
    stringBuffer.append(TEXT_147);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_149);
    touchXMLNode.getXMLElement(parentName);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_152);
    touchXMLNode.getXMLElement(parentName);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_157);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_159);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_160);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_161);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_162);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_163);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_164);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_166);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_167);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_170);
    
			List<XMLNode> nextSiblings = node.getNextSiblings();
			int size = nextSiblings.size();
			for(int i=0;i<size;i++) {//TD512
				XMLNode nextSibling = nextSiblings.get(i);
				namespaceHelper.lookupNamespace(nextSibling);
				uri = namespaceHelper.getUri();
				uri = uri == null ? "" : uri;
				prefix = namespaceHelper.getPrefix();
				localName = namespaceHelper.getLocalName();

    stringBuffer.append(TEXT_171);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_172);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_173);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(localName);
    stringBuffer.append(TEXT_175);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_177);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_178);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_179);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_180);
    touchXMLNode.getXMLElement(parentName);
    stringBuffer.append(TEXT_181);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_182);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_183);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_184);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_185);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_186);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_187);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_188);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_189);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_190);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_191);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_192);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_193);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_194);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_195);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_196);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_197);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_200);
    
			
			}//TD512
			
			while(size-- > 0) {

    stringBuffer.append(TEXT_201);
    
			}

    stringBuffer.append(TEXT_202);
    touchXMLNode.getXMLElement(parentName);
    stringBuffer.append(TEXT_203);
    stringBuffer.append(currEleName);
    stringBuffer.append(TEXT_204);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_205);
    touchXMLNode.getXMLNode(currEleName);
    stringBuffer.append(TEXT_206);
    
		}else{
			
			touchXMLNode.putCurrentElementByNull(currEleName);
			
			if(index>0 && node.parent!=null){

    stringBuffer.append(TEXT_207);
    touchXMLNode.getXMLElement(parentName);
    stringBuffer.append(TEXT_208);
    stringBuffer.append(node.name.substring(0,index));
    stringBuffer.append(TEXT_209);
    touchXMLNode.putCurrentElementByParentWithoutNamespacePrefix(currEleName,parentName,node,index);
    stringBuffer.append(TEXT_210);
    touchXMLNode.putCurrentElementByParent(currEleName,parentName,node);
    stringBuffer.append(TEXT_211);
    
			}else{

    stringBuffer.append(TEXT_212);
    touchXMLNode.putCurrentElementByParent(currEleName,parentName,node);
    
			}
		}
		
		if(0!=(node.special & 2)){

    stringBuffer.append(TEXT_213);
    touchXMLNode.putSubTreeRootParentByCurrentElement(currEleName);
    
		}
	}
	
	private void setText(String currEleName, XMLNode node){
		if(node.relatedColumn!=null){
			JavaType javaType = JavaTypesManager.getJavaTypeFromId(node.relatedColumn.getTalendType());
			if(javaType == JavaTypesManager.OBJECT){

    stringBuffer.append(TEXT_214);
    tool.getValue(node); 
    stringBuffer.append(TEXT_215);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_216);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_217);
    tool.getValue(node);
    stringBuffer.append(TEXT_218);
    
				if(outputAsXSD){

    stringBuffer.append(TEXT_219);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_220);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_221);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_222);
    
				}
			}else{

    stringBuffer.append(TEXT_223);
    tool.getValue(node);
    stringBuffer.append(TEXT_224);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_225);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_226);
    tool.getValue(node);
    stringBuffer.append(TEXT_227);
    
				if(outputAsXSD){

    stringBuffer.append(TEXT_228);
    touchXMLNode.getXMLNode(currEleName);
    stringBuffer.append(TEXT_229);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_230);
    
				}
			}
		}else if(node.defaultValue != null && !("").equals(node.defaultValue) ){

    stringBuffer.append(TEXT_231);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_232);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_233);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_234);
    
		}
	}
	private void addAttribute(String currEleName, XMLNode node){
		namespaceHelper.lookupNamespace(node);
		String uri = namespaceHelper.getUri();
		String prefix = namespaceHelper.getPrefix();
		String localName = namespaceHelper.getLocalName();
		
		if(node.relatedColumn!=null){

    stringBuffer.append(TEXT_235);
    tool.getValue(node);
    stringBuffer.append(TEXT_236);
    
			if(uri==null) {

    stringBuffer.append(TEXT_237);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_238);
    stringBuffer.append(node.name);
    stringBuffer.append(TEXT_239);
    tool.getValue(node);
    stringBuffer.append(TEXT_240);
    
			} else {

    stringBuffer.append(TEXT_241);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_242);
    stringBuffer.append(localName);
    stringBuffer.append(TEXT_243);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_244);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_245);
    tool.getValue(node);
    stringBuffer.append(TEXT_246);
    
			}

    stringBuffer.append(TEXT_247);
    
		}else if(node.defaultValue != null && !("").equals(node.defaultValue) ){
			if(uri==null) {

    stringBuffer.append(TEXT_248);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_249);
    stringBuffer.append(node.name);
    stringBuffer.append(TEXT_250);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_251);
    
			} else {

    stringBuffer.append(TEXT_252);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_253);
    stringBuffer.append(localName);
    stringBuffer.append(TEXT_254);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_256);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_257);
    
			}
		}
	}
	private void addNameSpace(String currEleName, XMLNode node){
		if(node.relatedColumn!=null){

    stringBuffer.append(TEXT_258);
    tool.getValue(node);
    stringBuffer.append(TEXT_259);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_260);
    stringBuffer.append(node.path);
    stringBuffer.append(TEXT_261);
    tool.getValue(node);
    stringBuffer.append(TEXT_262);
    
			if(node.path ==null || node.path.length()==0){

    stringBuffer.append(TEXT_263);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_264);
    touchXMLNode.getXMLNode(currEleName);
    stringBuffer.append(TEXT_265);
    tool.getValue(node);
    stringBuffer.append(TEXT_266);
    
			}

    stringBuffer.append(TEXT_267);
    
		}else if(node.defaultValue != null && !("").equals(node.defaultValue) ){

    stringBuffer.append(TEXT_268);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_269);
    stringBuffer.append(node.path );
    stringBuffer.append(TEXT_270);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_271);
    
			if(node.path ==null || node.path.length()==0){

    stringBuffer.append(TEXT_272);
    touchXMLNode.getXMLElement(currEleName);
    stringBuffer.append(TEXT_273);
    touchXMLNode.getXMLNode(currEleName);
    stringBuffer.append(TEXT_274);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_275);
    
			}
		}
	}
}

//----------** dom4j to genenrate comparison expression **-------//
class GenerateExprCmpByDom4j{
//	String cid = null;
	XMLTool tool = null;
	XMLNode groupNode = null;
	boolean needEmptyNode = true;
	NamespaceHelper namespaceHelper = null;
	//cache prefix and uris of namespace
	List<String> prefixs = null;
	List<String> uris = null;
	String lastParam=null;
	String[] lastArrNames =null;
	List<String> lastPrefixs = null;
	List<String> lastUris = null;
	public boolean collectionCompare(java.util.Collection<String> c1,java.util.Collection<String> c2 ){
		if(c1==null && c2==null){
			return true;
		}else if(c1!=null && c2!=null){
			Object [] firstArr=c1.toArray();
			Object [] secondArr=c2.toArray();
			return java.util.Arrays.equals(firstArr,secondArr);
		}else{
			return false;
		}
	}
	public void generateCode(XMLNode node, String parentName){
		String tmpPath = node.path.replaceFirst(groupNode.path,"");
		String[] arrNames = tmpPath.split("/");
		prefixs = new ArrayList<String>();
		uris = new ArrayList<String>();

		namespaceHelper.buildInfoForNamespace(node,arrNames,prefixs,uris);
		
		boolean printFlag=false;
		if(!java.util.Arrays.equals(arrNames,lastArrNames)){
			printFlag=true;
		}
		if(!printFlag){
			printFlag=!(collectionCompare(uris,lastUris)&&collectionCompare(prefixs,lastPrefixs));
		}
		if(node==groupNode){

    stringBuffer.append(TEXT_276);
    
		}
		
		if(node.relatedColumn != null){

    stringBuffer.append(TEXT_277);
    
			if(!needEmptyNode){

    stringBuffer.append(TEXT_278);
    tool.getValue(node); 
    stringBuffer.append(TEXT_279);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_280);
    			}
    stringBuffer.append(TEXT_281);
    if(printFlag){
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_282);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_283);
    
 	}
 
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_284);
    tool.getValue(node); 
    stringBuffer.append(TEXT_285);
    if(!needEmptyNode){
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    
		}else if(node.defaultValue!=null && !"".equals(node.defaultValue)){

    stringBuffer.append(TEXT_288);
    if(!java.util.Arrays.equals(arrNames,lastArrNames)){
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_289);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_290);
    
 	}
 
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_291);
    stringBuffer.append(node.defaultValue );
    stringBuffer.append(TEXT_292);
    
		}
		
		//first generate the attribute comparision	
		if(node.attributes!=null){
			for(XMLNode attri:node.attributes){
				
				namespaceHelper.lookupNamespace(attri);
				String prefix = namespaceHelper.getPrefix();
				String uri = namespaceHelper.getUri();
				String localName = namespaceHelper.getLocalName();
				String param =  "\"" + localName + "\"";
				if(uri!=null) {
					param = "org.dom4j.DocumentHelper.createQName(\"" + localName + "\",org.dom4j.DocumentHelper.createNamespace(\"" + prefix + "\",\"" + uri + "\"))";
				}
				
				if(attri.relatedColumn !=null){

    stringBuffer.append(TEXT_293);
    
					if(!needEmptyNode){

    stringBuffer.append(TEXT_294);
    tool.getValue(attri); 
    stringBuffer.append(TEXT_295);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_296);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_297);
    					}
    if(printFlag || !param.equals(lastParam)){
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_298);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_299);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_300);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_301);
    
	}
 
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_302);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_303);
    tool.getValue(attri); 
    stringBuffer.append(TEXT_304);
    
					if(!needEmptyNode){
    stringBuffer.append(TEXT_305);
    }

    stringBuffer.append(TEXT_306);
    
				}else if(attri.defaultValue!=null && !"".equals(attri.defaultValue)){

    stringBuffer.append(TEXT_307);
    if(printFlag || !param.equals(lastParam)){
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_308);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_309);
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_310);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_311);
    
	}
 
    generateCmnExpr(arrNames, parentName); 
    stringBuffer.append(TEXT_312);
    stringBuffer.append(param );
    stringBuffer.append(TEXT_313);
    stringBuffer.append(attri.defaultValue );
    stringBuffer.append(TEXT_314);
    
				}
			lastParam=param;
			}
		}	
		lastArrNames=arrNames;
		lastUris=uris;
		lastPrefixs=prefixs;
		if(node.elements!=null){
			for(XMLNode child:node.elements){
				if(!child.isMainNode()){
					generateCode(child,parentName);
				}
			}
		}		
	}
	
	private void generateCmnExpr(String[] arrNames, String parentName){

    stringBuffer.append(TEXT_315);
    stringBuffer.append(parentName );
    
		for(int i=1;arrNames != null && i<arrNames.length; i++){
			String uri = uris.get(i);
			String prefix = (prefixs.get(i) == null ? "" : prefixs.get(i));
		 	if(uri!=null) {

    stringBuffer.append(TEXT_316);
    stringBuffer.append(arrNames[i]);
    stringBuffer.append(TEXT_317);
    stringBuffer.append(prefix);
    stringBuffer.append(TEXT_318);
    stringBuffer.append(uri);
    stringBuffer.append(TEXT_319);
    			
			} else {

    stringBuffer.append(TEXT_320);
    stringBuffer.append(arrNames[i]);
    stringBuffer.append(TEXT_321);
    
			}
		}
	}
}
// ------------------- *** Dom4j generation mode end *** ------------------- //

// ------------------- *** Common code start *** ------------------- //
class OptimizeCodeGenerator {
	String cid;
	boolean isBeginPart = false;
	boolean isOptimizeCode = false;
	int schemaOptNum=100;
	
	String incomingName = "";
	
	public OptimizeCodeGenerator (String cid,int schemaOptNum) {
		this.cid = cid;
		this.schemaOptNum = schemaOptNum;
		initIsOptimizeCode();
	}
	public void setBeginPart (boolean isBegin) {
		this.isBeginPart = isBegin;
	}
	
	public boolean isBeginPart () {
		return this.isBeginPart;
	}
	
	public boolean isOptimizeCode() {
		return this.isOptimizeCode;
	}
	public void initIsOptimizeCode(){
		IConnection incomingConn = null;
    	INode preNode = null;
    	List<IMetadataTable> preMetadatas = null;
    	IMetadataTable preMetadata = null;
    	for (IConnection conn : incomingConns) {
    		if ( conn.getLineStyle().equals(EConnectionType.FLOW_MERGE)) {
    			incomingConn = conn;
				preNode = incomingConn.getSource();
				preMetadatas = preNode.getMetadataList();
				preMetadata = preMetadatas.get(0);
    			if(preMetadata!=null){
    				this.isOptimizeCode=this.isOptimizeCode || (this.schemaOptNum < preMetadata.getListColumns().size());
    			}
    		}
    		if(this.isOptimizeCode){
    			break;
    		}
    	}
	}
	public void generateCode(INode node) {
		generateClassNameWithRBlock();
		// generate the variable part for the begin part
		if (this.isBeginPart) {
			generateVarsPart();
		}
		generateMainCode(node);
		generateLeftBlock();
		if (this.isBeginPart && this.isOptimizeCode) {

    stringBuffer.append(TEXT_322);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_323);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_324);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_325);
    
		}
	}
	
	public void generateClassNameWithRBlock() {
		if (this.isBeginPart && this.isOptimizeCode) {

    stringBuffer.append(TEXT_326);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_327);
    
		}
	}
	
	public void generateLeftBlock() {
		if (this.isBeginPart && this.isOptimizeCode) {

    stringBuffer.append(TEXT_328);
    
		}
	}
	
	public void generateWrapMethod (IConnection conn ) {
		if(!this.isBeginPart) {

    stringBuffer.append(TEXT_329);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_330);
    
		}
		
		if (this.isOptimizeCode) {
			if (this.isBeginPart) {

    stringBuffer.append(TEXT_331);
    stringBuffer.append(conn.getUniqueName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(NodeUtil.getPrivateConnClassName(conn));
    stringBuffer.append(TEXT_333);
    stringBuffer.append(conn.getUniqueName());
    stringBuffer.append(TEXT_334);
    
			} else { // main part

    stringBuffer.append(TEXT_335);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_336);
    stringBuffer.append(conn.getUniqueName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(conn.getUniqueName());
    stringBuffer.append(TEXT_338);
    
			}
		}
	}

    
    public void generateVarsPart() {

    stringBuffer.append(TEXT_339);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_340);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_341);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_342);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_343);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_344);
    
		for(IConnection inComminConn : incomingConns){
			if(inComminConn.getLineStyle().hasConnectionCategory(IConnectionCategory.MERGE)){
				String sourceName=inComminConn.getUniqueName();

    stringBuffer.append(TEXT_345);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_346);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_347);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_348);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_349);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_350);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_351);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_352);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_353);
     
			}
		}
		
	} // generateVarsPart
	
	public void generateMainCode(INode node) {
		if (this.isBeginPart && !this.isOptimizeCode) {
			return;
		}

    
		//the first connection name
		String firstConnName=incomingConns.get(0).getUniqueName();
	
    	IConnection incomingConn = null;
    	INode preNode = null;
    	List<IMetadataTable> preMetadatas = null;
    	IMetadataTable preMetadata = null;
    	String sourceName=null;
    	for (IConnection conn : incomingConns) {
    		if ( conn.getLineStyle().equals(EConnectionType.FLOW_MERGE)) {
    			if (!this.isBeginPart && !conn.getName().equals(incomingName)) {
    				continue;
    			}
				incomingConn = conn;
				preNode = incomingConn.getSource();
				preMetadatas = preNode.getMetadataList();
				preMetadata = preMetadatas.get(0);
				sourceName = incomingConn.getUniqueName();
    			if(preMetadata!=null){
	    			String advancedSeparatorStr = ElementParameterParser.getValue(node, "__ADVANCED_SEPARATOR__");
	        		boolean advancedSeparator = (advancedSeparatorStr!=null&&!("").equals(advancedSeparatorStr))?("true").equals(advancedSeparatorStr):false;
	        		String thousandsSeparator = ElementParameterParser.getValueWithJavaType(node, "__THOUSANDS_SEPARATOR__", JavaTypesManager.CHARACTER);
	        		String decimalSeparator = ElementParameterParser.getValueWithJavaType(node, "__DECIMAL_SEPARATOR__", JavaTypesManager.CHARACTER); 
	        		
	        		// init tool
	                XMLTool tool = new XMLTool();
	                tool.connName = incomingConn.getName();
	                tool.advancedSeparator=advancedSeparator;
	                tool.thousandsSeparator=thousandsSeparator;
	                tool.decimalSeparator=decimalSeparator;
	                tool.cid=cid;
	                if (this.isBeginPart && this.isOptimizeCode) {
						int columnsCount=0;
						for(IMetadataColumn column :preMetadata.getListColumns()){
							if(columnsCount%this.schemaOptNum==0){

    stringBuffer.append(TEXT_354);
    stringBuffer.append(incomingConn.getUniqueName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(columnsCount/this.schemaOptNum);
    stringBuffer.append(TEXT_356);
    stringBuffer.append(NodeUtil.getPrivateConnClassName(incomingConn));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(incomingConn.getName() );
    stringBuffer.append(TEXT_358);
    
							}

    stringBuffer.append(TEXT_359);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_360);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_361);
    tool.getValue(column); 
    stringBuffer.append(TEXT_362);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_363);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_364);
    tool.getValue(column); 
    stringBuffer.append(TEXT_365);
    
							if((columnsCount+1)%this.schemaOptNum==0){

    stringBuffer.append(TEXT_366);
    
							}
							columnsCount++;
						}
						if(preMetadata.getListColumns().size()>0&&(preMetadata.getListColumns().size()%this.schemaOptNum)>0){

    stringBuffer.append(TEXT_367);
    
                 		}
                 	}

    
generateWrapMethod(incomingConn);
if(!this.isBeginPart && this.isOptimizeCode) {
	break;
}

    
            	List<Map<String, String>> rootTable =
                	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__ROOT__");
                List<Map<String, String>> groupTable =
                	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__GROUP__");
                List<Map<String, String>> loopTable =
                	(List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__LOOP__");
               
                String allowEmpty = ElementParameterParser.getValue(node, "__CREATE_EMPTY_ELEMENT__");
 //               String encoding = ElementParameterParser.getValue(node, "__ENCODING__");
                
                
                // change tables to a tree 
                List<List<Map<String, String>>> tables = getTables(rootTable, groupTable, loopTable, sourceName);
				Object[] treeObjs = getTree(tables.get(0), tables.get(1), tables.get(2), preMetadata.getListColumns());

				if(treeObjs == null || treeObjs.length == 0){
					return ;
				}

            	List<XMLNode> mainList = (ArrayList<XMLNode>)treeObjs[0];
                List<XMLNode> groupList = (ArrayList<XMLNode>)treeObjs[1];
                XMLNode root = mainList.get(0);                
            	XMLNode loop = (XMLNode)treeObjs[2];
            	
            	//only all the orders are valid,we will consider the order. 
            	Boolean allOrderValid = allOrderValid(rootTable,groupTable,loopTable);
            	
        		NamespaceHelper namespaceHelper = new NamespaceHelper(root);
    	        
                if(!("true").equals(allowEmpty)){
                	removeEmptyElement(root);
                }
                
                List<List<XMLNode>> groupbyNodeList = new ArrayList<List<XMLNode>>();
                for(XMLNode group:groupList){
                	groupbyNodeList.add(getGroupByNodeList(group));
                }

    stringBuffer.append(TEXT_368);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_369);
    stringBuffer.append(namespaceHelper.buildUriToPrefixForDefaultNamespaceMapping("uriToPrefixForDefaultNamespace_" + sourceName + "_" + cid));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(namespaceHelper.buildPrefixToUriForNamespaceMapping("prefixToUriForNamespace_" + sourceName + "_" + cid));
    
	if (this.isBeginPart && this.isOptimizeCode) {
		int count=0;
		for(IMetadataColumn column :preMetadata.getListColumns()){
			if(count%this.schemaOptNum==0){

    stringBuffer.append(TEXT_371);
    stringBuffer.append(incomingConn.getUniqueName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(count/this.schemaOptNum);
    stringBuffer.append(TEXT_373);
    stringBuffer.append(incomingConn.getName() );
    stringBuffer.append(TEXT_374);
    
			}
			count++;
		}
	}else{
		for(IMetadataColumn column :preMetadata.getListColumns()){

    stringBuffer.append(TEXT_375);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_376);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_377);
    tool.getValue(column); 
    stringBuffer.append(TEXT_378);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_379);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_380);
    tool.getValue(column); 
    stringBuffer.append(TEXT_381);
    
		}
	}
// ------------------- *** Common code end *** ------------------- //

// ------------------- *** Dom4j generation mode start *** ------------------- //
		//init the generate tool.
		GenerateToolByDom4j generateToolByDom4j = new GenerateToolByDom4j();
	
	    if(("true").equals(allowEmpty)){
	    	generateToolByDom4j.allowEmpty = true;
	    }
	    generateToolByDom4j.cid = cid;
	   	generateToolByDom4j.touchXMLNode.cid = cid;
	   	generateToolByDom4j.bigMethodHelper.cid = cid;
	    generateToolByDom4j.tool = tool;
	    generateToolByDom4j.namespaceHelper = namespaceHelper;
	    generateToolByDom4j.allOrderValid = allOrderValid;
	    
	    //start generate code

    stringBuffer.append(TEXT_382);
    generateToolByDom4j.touchXMLNode.putSubTreeRootParentByNull();
    stringBuffer.append(TEXT_383);
    		//the first input connection
		if(sourceName.equals(firstConnName)){

    stringBuffer.append(TEXT_384);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_385);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_386);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_387);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_388);
    	
		generateToolByDom4j.touchXMLNode.putDocument();
		generateToolByDom4j.generateCode(root,"root","doc");

    stringBuffer.append(TEXT_389);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_390);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_391);
    generateToolByDom4j.touchXMLNode.getXMLElement("subTreeRootParent");
    stringBuffer.append(TEXT_392);
    generateToolByDom4j.touchXMLNode.putSubTreeRootParentBySourceRoot(sourceName);
    stringBuffer.append(TEXT_393);
    
		}else{
			List<String> listConnNames = new ArrayList<String>();
			// get the input connections before the current connection
			for(IConnection conn1:incomingConns){
				// the last one is the current connection
				if(conn1.getName().equals(sourceName)){
					break;
				}
				listConnNames.add(conn1.getName());
			}
			
			XMLNode rootNode = getRootTree(rootTable);
			XMLNode branchNode = getInsertNode(rootNode, mainList, listConnNames);
			String finalXpath = namespaceHelper.buildXPathWithPrefix(branchNode);
			if(branchNode.path.equals(mainList.get(mainList.size()-1).path)==true){// the last main node

    stringBuffer.append(TEXT_394);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_395);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_396);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_397);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_398);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_399);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_400);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_401);
    stringBuffer.append(finalXpath);
    stringBuffer.append(TEXT_402);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_403);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_404);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_405);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_406);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_407);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_408);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_409);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_410);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_411);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_412);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_413);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_414);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_415);
    generateToolByDom4j.touchXMLNode.putDocument();
    stringBuffer.append(TEXT_416);
    generateToolByDom4j.generateCode(root,"root","doc");
    stringBuffer.append(TEXT_417);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_418);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_419);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_420);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_421);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_422);
    generateToolByDom4j.touchXMLNode.putSubTreeRootParentBySourceRoot(sourceName);
    
			}else{
				//find the father main node in the branch
				XMLNode tempNode=null;
				for(XMLNode tmpNode: mainList){
					if(tmpNode.path.equals(branchNode.path)){
						tempNode = mainList.get(mainList.indexOf(tmpNode)+1);
						break;
					}
				}

    stringBuffer.append(TEXT_423);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_424);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_425);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_426);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_427);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_428);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_429);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_430);
    stringBuffer.append(finalXpath);
    stringBuffer.append(TEXT_431);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_432);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_433);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_434);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_435);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_436);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_437);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_438);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_439);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_440);
    generateToolByDom4j.touchXMLNode.putSourceRoot(sourceName);
    stringBuffer.append(TEXT_441);
    generateToolByDom4j.generateCode(tempNode,"root", "root_"+sourceName); 
    stringBuffer.append(TEXT_442);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_444);
    generateToolByDom4j.touchXMLNode.getXMLElement("subTreeRootParent");
    stringBuffer.append(TEXT_445);
    generateToolByDom4j.touchXMLNode.putSubTreeRootParentBySourceRoot(sourceName);
    stringBuffer.append(TEXT_446);
    
			}
		}

    stringBuffer.append(TEXT_447);
     
		if(tables.get(1).size()>0){					//init the generate tool.
		    String firstGroupPath = groupList.get(0).path;

    stringBuffer.append(TEXT_448);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_449);
    
			for( int i=0; i<groupList.size();i++){
				XMLNode groupNode= groupList.get(i);
				namespaceHelper.setGroupNode(groupNode);
				String currentFinalGroupXpath = namespaceHelper.getCurrentFinalGroupXpath();
				GenerateExprCmpByDom4j generateExprCmpByDom4j = new GenerateExprCmpByDom4j();
				generateExprCmpByDom4j.tool = tool;
				generateExprCmpByDom4j.groupNode = groupNode;
				generateExprCmpByDom4j.namespaceHelper = namespaceHelper;
				generateExprCmpByDom4j.needEmptyNode = ("true").equals(allowEmpty);

    stringBuffer.append(TEXT_450);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_451);
    generateToolByDom4j.touchXMLNode.getXMLElement("subTreeRootParent");
    stringBuffer.append(TEXT_452);
    stringBuffer.append(namespaceHelper.buildCurrentGroupDeclaredNamespacesMapping("currentDeclaredNamespacesMapping"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(currentFinalGroupXpath );
    stringBuffer.append(TEXT_454);
    stringBuffer.append(sourceName );
    stringBuffer.append(TEXT_455);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_456);
    if(sourceName.equals(firstConnName)) {
    stringBuffer.append(TEXT_457);
    } else {
    stringBuffer.append(TEXT_458);
    }
    stringBuffer.append(TEXT_459);
    generateExprCmpByDom4j.generateCode(groupNode, "tempElem"); 
    stringBuffer.append(TEXT_460);
    generateToolByDom4j.touchXMLNode.putSubTreeRootParentByTempElem();
    stringBuffer.append(TEXT_461);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_462);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_463);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_464);
     
				generateToolByDom4j.generateCode(groupList.get(i),"group"+i+"_","subTreeRootParent");

    stringBuffer.append(TEXT_465);
    
	 		}//for
		}

    stringBuffer.append(TEXT_466);
    
				if(tables.get(2)!=null && tables.get(2).size()>0){
					generateToolByDom4j.generateCode(loop,"loop","subTreeRootParent");
				}
// ------------------- *** Dom4j generation mode end *** ------------------- //

// ------------------- *** Common code start *** ------------------- //

    generateLeftBlock();
    

//					if(!this.isBeginPart()) {
//						break;
//					}
				}
	    	}
	    }
// ------------------- *** Common code end *** ------------------- //
	} // generateMainCode()
} //class end

    
				int schemaOptNum=100;
				String schemaOptNumStr=ElementParameterParser.getValue(node, "__SCHEMA_OPT_NUM__");
				if(schemaOptNumStr!=null && !"".equals(schemaOptNumStr) && !"\"\"".equals(schemaOptNumStr)){
					schemaOptNum  = Integer.parseInt(schemaOptNumStr);
				}
    			OptimizeCodeGenerator optimizeGen = new OptimizeCodeGenerator(cid,schemaOptNum);
    			optimizeGen.incomingName = incomingName;
				optimizeGen.generateCode(node);
// ------------------- *** Common code start *** ------------------- //
//			}
		}
}
// ------------------- *** Common code end *** ------------------- //

    stringBuffer.append(TEXT_467);
    return stringBuffer.toString();
  }
}

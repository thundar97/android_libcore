
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:





Copyright (c) 2001 World Wide Web Consortium, 

(Massachusetts Institute of Technology, Institut National de

Recherche en Informatique et en Automatique, Keio University).  All 

Rights Reserved.  This program is distributed under the W3C's Software

Intellectual Property License.  This program is distributed in the 

hope that it will be useful, but WITHOUT ANY WARRANTY; without even

the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 

PURPOSE.  



See W3C License http://www.w3.org/Consortium/Legal/ for more details.




*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "setAttributeNS(namespaceURI,qualifiedName,value)" method raises a 
 *    NAMESPACE_ERR DOMException if the specified
 *    qualifiedName has a prefix and the namespaceURI is null.
 *    
 *    Attempt to add a new attribute on the first employee node.
 *    An exception should be raised since the "qualifiedName" has a
 *    prefix and the namespaceURI is null. 
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElSetAttrNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElSetAttrNS</a>
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-ElSetAttrNS')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NAMESPACE_ERR'])">http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-ElSetAttrNS')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NAMESPACE_ERR'])</a>
*/
public final class elementsetattributensurinull extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public elementsetattributensurinull(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      String namespaceURI = null;

      String qualifiedName = "emp:qualifiedName";
      Document doc;
      NodeList elementList;
      Node testAddr;
      doc = (Document) load("staff", true);
      elementList = doc.getElementsByTagName("employee");
      testAddr = elementList.item(0);
      
      {
         boolean success = false;
         try {
            ((Element) /*Node */testAddr).setAttributeNS(namespaceURI, qualifiedName, "newValue");
          } catch (DOMException ex) {
            success = (ex.code == DOMException.NAMESPACE_ERR);
         }
         assertTrue("throw_NAMESPACE_ERR", success);
      }
}
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/elementsetattributensurinull";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(elementsetattributensurinull.class, args);
   }
}


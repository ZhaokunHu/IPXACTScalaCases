// Generated by <a href="http://IPXACT2022scalaxb.org/">IPXACT2022scalaxb</a>.
package IPXACT2022ScalaCases

sealed trait SimpleFileType

object SimpleFileType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2022scalaxb.XMLFormat[IPXACT2022ScalaCases.SimpleFileType]): SimpleFileType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: SimpleFileType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[SimpleFileType] = Seq(Unknown, CSource, CppSource, AsmSource, VhdlSource, VhdlSourceu4587, VhdlSourceu4593, VhdlSourceu452002, VhdlSourceu452008, VerilogSource, VerilogSourceu4595, VerilogSourceu452001, VerilogSourceu452005, SwObject, SwObjectLibrary, VhdlBinaryLibrary, VerilogBinaryLibrary, UnelaboratedHdl, ExecutableHdl, SystemVerilogSource, SystemVerilogSourceu453u460, SystemVerilogSourceu453u461, SystemVerilogSourceu453u461a, SystemVerilogSourceu452009, SystemVerilogSourceu452012, SystemVerilogSourceu452017, SystemCSource, SystemCSourceu452u460, SystemCSourceu452u460u461, SystemCSourceu452u461, SystemCSourceu452u462, SystemCSourceu452u463, SystemCBinaryLibrary, VeraSource, ESource, PerlSource, TclSource, OVASource, SVASource, PslSource, SDC, VhdlAmsSource, VerilogAmsSource, SystemCAmsSource, LibertySource, SpiceSource, SystemRDL, SystemRDLu451u460, SystemRDLu452u460, User)
}

case object Unknown extends SimpleFileType { override def toString = "unknown" }
case object CSource extends SimpleFileType { override def toString = "cSource" }
case object CppSource extends SimpleFileType { override def toString = "cppSource" }
case object AsmSource extends SimpleFileType { override def toString = "asmSource" }
case object VhdlSource extends SimpleFileType { override def toString = "vhdlSource" }
case object VhdlSourceu4587 extends SimpleFileType { override def toString = "vhdlSource-87" }
case object VhdlSourceu4593 extends SimpleFileType { override def toString = "vhdlSource-93" }
case object VhdlSourceu452002 extends SimpleFileType { override def toString = "vhdlSource-2002" }
case object VhdlSourceu452008 extends SimpleFileType { override def toString = "vhdlSource-2008" }
case object VerilogSource extends SimpleFileType { override def toString = "verilogSource" }
case object VerilogSourceu4595 extends SimpleFileType { override def toString = "verilogSource-95" }
case object VerilogSourceu452001 extends SimpleFileType { override def toString = "verilogSource-2001" }
case object VerilogSourceu452005 extends SimpleFileType { override def toString = "verilogSource-2005" }
case object SwObject extends SimpleFileType { override def toString = "swObject" }
case object SwObjectLibrary extends SimpleFileType { override def toString = "swObjectLibrary" }
case object VhdlBinaryLibrary extends SimpleFileType { override def toString = "vhdlBinaryLibrary" }
case object VerilogBinaryLibrary extends SimpleFileType { override def toString = "verilogBinaryLibrary" }
case object UnelaboratedHdl extends SimpleFileType { override def toString = "unelaboratedHdl" }
case object ExecutableHdl extends SimpleFileType { override def toString = "executableHdl" }
case object SystemVerilogSource extends SimpleFileType { override def toString = "systemVerilogSource" }
case object SystemVerilogSourceu453u460 extends SimpleFileType { override def toString = "systemVerilogSource-3.0" }
case object SystemVerilogSourceu453u461 extends SimpleFileType { override def toString = "systemVerilogSource-3.1" }
case object SystemVerilogSourceu453u461a extends SimpleFileType { override def toString = "systemVerilogSource-3.1a" }
case object SystemVerilogSourceu452009 extends SimpleFileType { override def toString = "systemVerilogSource-2009" }
case object SystemVerilogSourceu452012 extends SimpleFileType { override def toString = "systemVerilogSource-2012" }
case object SystemVerilogSourceu452017 extends SimpleFileType { override def toString = "systemVerilogSource-2017" }
case object SystemCSource extends SimpleFileType { override def toString = "systemCSource" }
case object SystemCSourceu452u460 extends SimpleFileType { override def toString = "systemCSource-2.0" }
case object SystemCSourceu452u460u461 extends SimpleFileType { override def toString = "systemCSource-2.0.1" }
case object SystemCSourceu452u461 extends SimpleFileType { override def toString = "systemCSource-2.1" }
case object SystemCSourceu452u462 extends SimpleFileType { override def toString = "systemCSource-2.2" }
case object SystemCSourceu452u463 extends SimpleFileType { override def toString = "systemCSource-2.3" }
case object SystemCBinaryLibrary extends SimpleFileType { override def toString = "systemCBinaryLibrary" }
case object VeraSource extends SimpleFileType { override def toString = "veraSource" }
case object ESource extends SimpleFileType { override def toString = "eSource" }
case object PerlSource extends SimpleFileType { override def toString = "perlSource" }
case object TclSource extends SimpleFileType { override def toString = "tclSource" }
case object OVASource extends SimpleFileType { override def toString = "OVASource" }
case object SVASource extends SimpleFileType { override def toString = "SVASource" }
case object PslSource extends SimpleFileType { override def toString = "pslSource" }
case object SDC extends SimpleFileType { override def toString = "SDC" }
case object VhdlAmsSource extends SimpleFileType { override def toString = "vhdlAmsSource" }
case object VerilogAmsSource extends SimpleFileType { override def toString = "verilogAmsSource" }
case object SystemCAmsSource extends SimpleFileType { override def toString = "systemCAmsSource" }
case object LibertySource extends SimpleFileType { override def toString = "libertySource" }
case object SpiceSource extends SimpleFileType { override def toString = "spiceSource" }
case object SystemRDL extends SimpleFileType { override def toString = "systemRDL" }
case object SystemRDLu451u460 extends SimpleFileType { override def toString = "systemRDL-1.0" }
case object SystemRDLu452u460 extends SimpleFileType { override def toString = "systemRDL-2.0" }
case object User extends SimpleFileType { override def toString = "user" }


case class FileType(value: IPXACT2022ScalaCases.SimpleFileType,
  attributes: Map[String, IPXACT2022scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val user = attributes.get("@user") map { _.as[String]}
  lazy val libext = attributes.get("@libext") map { _.as[String]}
  lazy val xmlid = attributes.get("@{http://www.w3.org/XML/1998/namespace}id") map { _.as[String]}
}

      
      


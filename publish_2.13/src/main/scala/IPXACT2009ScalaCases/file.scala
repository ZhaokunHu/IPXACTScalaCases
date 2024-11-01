package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.


case class Name(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class IsIncludeFile(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val externalDeclarations = attributes("@externalDeclarations").as[Boolean]
}

      
      


case class LogicalName(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val default = attributes("@default").as[Boolean]
}

      
      


case class Command(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class Flags(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val append = attributes.get("@append") map { _.as[Boolean]}
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ReplaceDefaultFlags(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class TargetName(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class BuildCommand(command: Option[Command] = None,
  flags: Option[Flags] = None,
  replaceDefaultFlags: Option[ReplaceDefaultFlags] = None,
  targetName: Option[TargetName] = None)
      
      


case class File(name: Name,
  filesequence1: FileSequence1,
  isIncludeFile: Option[IsIncludeFile] = None,
  logicalName: Option[LogicalName] = None,
  exportedName: Seq[String] = Nil,
  buildCommand: Option[BuildCommand] = None,
  dependency: Seq[String] = Nil,
  define: Seq[NameValuePairTypable] = Nil,
  imageType: Seq[String] = Nil,
  description: Option[String] = None,
  vendorExtensions: Option[VendorExtensions] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val fileId = attributes.get("@fileId") map { _.as[String]}
}

      
      

case class FileSequence1(fileTypeOption1: IPXACT2009scalaxb.DataRecord[Any]*)
      

case class Name2(value: String)
      
      


case class Command2(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class Flags2(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ReplaceDefaultFlags2(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class FileBuilder(fileTypeOption1: IPXACT2009scalaxb.DataRecord[Any],
  command: Command2,
  flags: Option[Flags2] = None,
  replaceDefaultFlags: Option[ReplaceDefaultFlags2] = None,
  vendorExtensions: Option[VendorExtensions] = None)
      
      


case class Linker(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class LinkerFlags(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class Name3(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class CommandLineSwitch(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class Enable(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class LinkerCommandFile(name: Name3,
  commandLineSwitch: CommandLineSwitch,
  enable: Enable,
  generatorRef: Seq[String] = Nil,
  vendorExtensions: Option[VendorExtensions] = None)
      
      


case class LanguageTools(fileBuilder: Seq[FileBuilder] = Nil,
  linker: Option[Linker] = None,
  linkerFlags: Option[LinkerFlags] = None,
  linkerCommandFile: Option[LinkerCommandFile] = None)
      
      


case class FileSetRefGroup(fileSetRef: Seq[FileSetRef] = Nil)
      
      


case class ExecutableImage(name: Name2,
  description: Option[String] = None,
  parameters: Option[Parameters] = None,
  languageTools: Option[LanguageTools] = None,
  fileSetRefGroup: Option[FileSetRefGroup] = None,
  vendorExtensions: Option[VendorExtensions] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val id = attributes("@id").as[String]
  lazy val imageType = attributes.get("@imageType") map { _.as[String]}
}

      
      


case class FileSetRef(filesetrefoption: IPXACT2009scalaxb.DataRecord[String])
      
      

trait FileSetRefOption

case class FileSets(fileSet: Seq[FileSetType] = Nil)
      
      


case class Command3(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class Flags3(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType") map { _.as[RangeTypeType]}
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class ReplaceDefaultFlags3(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class FileBuilderType(fileTypeOption1: IPXACT2009scalaxb.DataRecord[Any],
  command: Option[Command3] = None,
  flags: Option[Flags3] = None,
  replaceDefaultFlags: Option[ReplaceDefaultFlags3] = None)
      
      

sealed trait ReturnType

object ReturnType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[ReturnType]): ReturnType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: ReturnType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[ReturnType] = Seq(Void, IntTypeValue2)
}

case object Void extends ReturnType { override def toString = "void" }
case object IntTypeValue2 extends ReturnType { override def toString = "int" }


case class Argument(nameGroupStringSequence1: NameGroupStringSequence,
  value: Value,
  vendorExtensions: Option[VendorExtensions] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends NameValuePairTypable {
  lazy val dataType = attributes("@dataType").as[DataTypeType]
}

      
      


case class Disabled(value: Boolean,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val spiritformat = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}format").as[FormatType]
  lazy val spiritresolve = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}resolve") map { _.as[ResolveType]}
  lazy val spiritid = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}id") map { _.as[String]}
  lazy val spiritdependency = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}dependency") map { _.as[String]}
  lazy val spiritchoiceRef = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}choiceRef") map { _.as[String]}
  lazy val spiritorder = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}order") map { _.as[Float]}
  lazy val spiritconfigGroups = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}configGroups") map { _.as[Seq[String]]}
  lazy val spiritbitStringLength = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}bitStringLength") map { _.as[BigInt]}
  lazy val spiritminimum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}minimum") map { _.as[String]}
  lazy val spiritmaximum = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}maximum") map { _.as[String]}
  lazy val spiritrangeType = attributes("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}rangeType").as[RangeTypeType]
  lazy val spiritprompt = attributes.get("@{http://www.spiritconsortium.org/XMLSchema/SPIRIT/1685-2009}prompt") map { _.as[String]}
}

      
      


case class SourceName(value: String)
      
      


case class SourceFile(sourceName: SourceName,
  fileTypeOption2: IPXACT2009scalaxb.DataRecord[Any])
      
      


case class FunctionType(entryPoint: Option[String] = None,
  fileRef: String,
  returnType: Option[ReturnType] = None,
  argument: Seq[Argument] = Nil,
  disabled: Option[Disabled] = None,
  sourceFile: Seq[SourceFile] = Nil,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val replicate = attributes("@replicate").as[Boolean]
}

      
      


case class FileSetType(nameGroupSequence1: NameGroupSequence,
  group: Seq[String] = Nil,
  file: Seq[File] = Nil,
  defaultFileBuilder: Seq[FileBuilderType] = Nil,
  dependency: Seq[String] = Nil,
  function: Seq[FunctionType] = Nil,
  vendorExtensions: Option[VendorExtensions] = None)
      
      

sealed trait DataTypeType

object DataTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[DataTypeType]): DataTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: DataTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[DataTypeType] = Seq(IntType, Unsignedint, LongType, Unsignedlong, FloatType, DoubleType, Charu42, Voidu42)
}

case object IntType extends DataTypeType { override def toString = "int" }
case object Unsignedint extends DataTypeType { override def toString = "unsigned int" }
case object LongType extends DataTypeType { override def toString = "long" }
case object Unsignedlong extends DataTypeType { override def toString = "unsigned long" }
case object FloatType extends DataTypeType { override def toString = "float" }
case object DoubleType extends DataTypeType { override def toString = "double" }
case object Charu42 extends DataTypeType { override def toString = "char *" }
case object Voidu42 extends DataTypeType { override def toString = "void *" }


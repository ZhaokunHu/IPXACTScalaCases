package IPXACT2009ScalaCases

// Generated by <a href="http://IPXACT2009scalaxb.org/">IPXACT2009scalaxb</a>.

sealed trait ComponentPortDirectionType

object ComponentPortDirectionType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[ComponentPortDirectionType]): ComponentPortDirectionType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: ComponentPortDirectionType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[ComponentPortDirectionType] = Seq(In, Out, Inout, Phantom)
}

case object In extends ComponentPortDirectionType { override def toString = "in" }
case object Out extends ComponentPortDirectionType { override def toString = "out" }
case object Inout extends ComponentPortDirectionType { override def toString = "inout" }
case object Phantom extends ComponentPortDirectionType { override def toString = "phantom" }


case class LeftType4(value: BigInt,
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

      
      


case class RightType4(value: BigInt,
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

      
      


case class Vector4(left: LeftType4,
  right: RightType4)
      
      


/** Basic port declarations.
*/
trait PortDeclarationTypable {
  def nameGroupPortSequence1: NameGroupPortSequence
  def portdeclarationtypableoption: IPXACT2009scalaxb.DataRecord[PortDeclarationTypableOption]
  def portdeclarationtypablesequence1: PortDeclarationTypableSequence1
}


/** Basic port declarations.
*/
case class PortDeclarationType(nameGroupPortSequence1: NameGroupPortSequence,
  portdeclarationtypableoption: IPXACT2009scalaxb.DataRecord[PortDeclarationTypableOption],
  portdeclarationtypablesequence1: PortDeclarationTypableSequence1) extends PortDeclarationTypable
      
      

case class PortDeclarationTypableSequence1(access: Option[PortAccessType] = None)
      
trait PortDeclarationTypableOption

/** A port description, giving a name and an access type for high level ports. 
*/
trait PortTypable extends PortDeclarationTypable {
  def nameGroupPortSequence1: NameGroupPortSequence
  def portdeclarationtypableoption: IPXACT2009scalaxb.DataRecord[PortDeclarationTypableOption]
  def portdeclarationtypablesequence1: PortDeclarationTypableSequence1
  def vendorExtensions: Option[VendorExtensions]
}


/** A port description, giving a name and an access type for high level ports. 
*/
case class PortType(nameGroupPortSequence1: NameGroupPortSequence,
  portdeclarationtypableoption: IPXACT2009scalaxb.DataRecord[PortDeclarationTypableOption],
  portdeclarationtypablesequence1: PortDeclarationTypableSequence1,
  vendorExtensions: Option[VendorExtensions] = None) extends PortTypable
      
      


/** A port description, giving a name and an access type for high level ports. 
*/
case class AbstractorPortType(nameGroupPortSequence1: NameGroupPortSequence,
  portdeclarationtypableoption: IPXACT2009scalaxb.DataRecord[PortDeclarationTypableOption],
  portdeclarationtypablesequence1: PortDeclarationTypableSequence1,
  vendorExtensions: Option[VendorExtensions] = None) extends PortTypable
      
      

case class AbstractorPortTypeSequence3(vendorExtensions: Option[VendorExtensions] = None)
      
case class AbstractorPortTypeSequence1(nameGroupPortSequence1: NameGroupPortSequence,
  abstractorporttypeoption: IPXACT2009scalaxb.DataRecord[AbstractorPortTypeOption],
  abstractorporttypesequence2: AbstractorPortTypeSequence2)
      

case class AbstractorPortTypeSequence2(access: Option[PortAccessType] = None)
      
trait AbstractorPortTypeOption
sealed trait InitiativeType

object InitiativeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[InitiativeType]): InitiativeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: InitiativeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[InitiativeType] = Seq(RequiresValue, ProvidesValue, BothValue, PhantomValue)
}

case object RequiresValue extends InitiativeType { override def toString = "requires" }
case object ProvidesValue extends InitiativeType { override def toString = "provides" }
case object BothValue extends InitiativeType { override def toString = "both" }
case object PhantomValue extends InitiativeType { override def toString = "phantom" }

sealed trait PortAccessTypeType

object PortAccessTypeType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: IPXACT2009scalaxb.XMLFormat[PortAccessTypeType]): PortAccessTypeType = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: PortAccessTypeType) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[PortAccessTypeType] = Seq(Ref, Ptr)
}

case object Ref extends PortAccessTypeType { override def toString = "ref" }
case object Ptr extends PortAccessTypeType { override def toString = "ptr" }


case class TypeName2(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val constrained = attributes("@constrained").as[Boolean]
}

      
      


case class TransTypeDef(typeName: TypeName2,
  typeDefinition: Seq[String] = Nil)
      
      


case class TypeName3(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val constrained = attributes("@constrained").as[Boolean]
  lazy val implicitValue = attributes("@implicit").as[Boolean]
}

      
      


case class Parameters2(parameter: Seq[NameValuePairTypable] = Nil)
      
      


case class ServiceTypeDef(typeName: TypeName3,
  typeDefinition: Seq[String] = Nil,
  parameters: Option[Parameters2] = None)
      
      


case class TypeName4(value: String,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) {
  lazy val constrained = attributes("@constrained").as[Boolean]
}

      
      


case class WireTypeDef(typeName: TypeName4,
  typeDefinition: Seq[String] = Nil,
  viewNameRef: Seq[String] = Nil)
      
      


case class ServiceTypeDefs(serviceTypeDef: Seq[ServiceTypeDef] = Nil)
      
      


case class WireTypeDefs(wireTypeDef: Seq[WireTypeDef] = Nil)
      
      


/** Wire port type for a component.
*/
trait PortWireTypable extends PortDeclarationTypableOption {
  def direction: ComponentPortDirectionType
  def vector: Option[Vector4]
  def wireTypeDefs: Option[WireTypeDefs]
  def driver: Option[DriverType]
  def constraintSets: Option[ConstraintSets]
  def allLogicalDirectionsAllowed: Boolean
}


/** Wire port type for a component.
*/
case class PortWireType(direction: ComponentPortDirectionType,
  vector: Option[Vector4] = None,
  wireTypeDefs: Option[WireTypeDefs] = None,
  driver: Option[DriverType] = None,
  constraintSets: Option[ConstraintSets] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends PortWireTypable {
  lazy val allLogicalDirectionsAllowed = attributes("@allLogicalDirectionsAllowed").as[Boolean]
}

      
      


case class Service(initiative: InitiativeType,
  serviceTypeDefs: Option[ServiceTypeDefs] = None,
  vendorExtensions: Option[VendorExtensions] = None)
      
      


case class Connection(maxConnections: Option[BigInt] = None,
  minConnections: Option[BigInt] = None)
      
      


/** Transactional port type.
*/
case class PortTransactionalType(transTypeDef: Option[TransTypeDef] = None,
  service: Service,
  connection: Option[Connection] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends PortDeclarationTypableOption with AbstractorPortTypeOption {
  lazy val allLogicalInitiativesAllowed = attributes("@allLogicalInitiativesAllowed").as[Boolean]
}

      
      


/** Wire port type for an abstractor.
*/
case class AbstractorPortWireType(direction: ComponentPortDirectionType,
  vector: Option[Vector4] = None,
  wireTypeDefs: Option[WireTypeDefs] = None,
  driver: Option[DriverType] = None,
  constraintSets: Option[ConstraintSets] = None,
  attributes: Map[String, IPXACT2009scalaxb.DataRecord[Any]] = Map.empty) extends PortWireTypable with AbstractorPortTypeOption {
  lazy val allLogicalDirectionsAllowed = attributes("@allLogicalDirectionsAllowed").as[Boolean]
}

      
      


case class PortAccessType(portAccessType: Option[PortAccessTypeType] = None,
  portAccessHandle: Option[String] = None)
      
      

package dev.accioly.mambo.no5.scala3.enums

// Source: https://docs.scala-lang.org/scala3/reference/enums/enums.html with small modifications
enum Scala3PlanetEnum(val mass: Double, val radius: Double):

  private final val G = 6.67300E-11
  def surfaceGravity = G * mass / (radius * radius)
  def surfaceWeight(otherMass: Double) = otherMass * surfaceGravity

  case Mercury extends Scala3PlanetEnum(3.303e+23, 2.4397e6)
  case Venus   extends Scala3PlanetEnum(4.869e+24, 6.0518e6)
  case Earth   extends Scala3PlanetEnum(5.976e+24, 6.37814e6)
  case Mars    extends Scala3PlanetEnum(6.421e+23, 3.3972e6)
  case Jupiter extends Scala3PlanetEnum(1.9e+27, 7.1492e7)
  case Saturn  extends Scala3PlanetEnum(5.688e+26, 6.0268e7)
  case Uranus  extends Scala3PlanetEnum(8.686e+25, 2.5559e7)
  case Neptune extends Scala3PlanetEnum(1.024e+26, 2.4746e7)

end Scala3PlanetEnum

@main def weight(earthWeight: Double) =
  val mass = earthWeight / Scala3PlanetEnum.Earth.surfaceGravity
  for p <- Scala3PlanetEnum.values do
    println(s"Your weight on $p is ${p.surfaceWeight(mass)}")




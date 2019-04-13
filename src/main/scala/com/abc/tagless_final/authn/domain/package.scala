package com.abc.tagless_final.authn

package object domain {

  final case class RegistrationError(msg: String)

  final case class AuthnError(msg: String)

}

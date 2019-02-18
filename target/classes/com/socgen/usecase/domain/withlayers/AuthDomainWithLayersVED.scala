package com.socgen.usecase.domain.withlayers

import com.socgen.usecase.domain.AuthDomain
import com.socgen.usecase.auth.layertraits.{AuthValidation,AuthEnrichment,AuthDataProcess}

case class AuthDomainWithLayersVED(override val path:Option[String]) extends AuthDomain with AuthDataProcess with AuthEnrichment with AuthValidation 
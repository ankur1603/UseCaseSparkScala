package com.socgen.usecase.domain.withlayers

import com.socgen.usecase.domain.AuthRddDomain
import com.socgen.usecase.authrdd.layertraits.{AuthRddDataProcess,AuthRddValidation,AuthRddEnrichment}

case class AuthRddDomainWithLayersVED(override val path:Option[String]) extends AuthRddDomain with AuthRddValidation with AuthRddEnrichment with AuthRddDataProcess
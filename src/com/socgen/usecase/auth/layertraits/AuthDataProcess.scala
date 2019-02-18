package com.socgen.usecase.auth.layertraits

import org.apache.spark.sql.Dataset

import com.socgen.usecase.abstractdomain.AbstractAuthDomain
import com.socgen.usecase.model.Auth

trait AuthDataProcess extends AbstractAuthDomain{
  abstract override def getResult():Dataset[Auth]={
    val authDs=super.getResult();
    authDs.filter(authDs("aua")<=>authDs("sa"))
  }
}
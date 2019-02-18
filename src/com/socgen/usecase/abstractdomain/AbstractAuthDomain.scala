package com.socgen.usecase.abstractdomain

import org.apache.spark.sql.Dataset
import com.socgen.usecase.model.Auth

abstract class AbstractAuthDomain extends AbstractDomain[Dataset,Auth] {
  def getResult():Dataset[Auth]
}
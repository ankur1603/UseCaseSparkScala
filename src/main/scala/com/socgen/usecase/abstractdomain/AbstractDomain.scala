package com.socgen.usecase.abstractdomain

import com.socgen.usecase.modeltrait.ModelTrait

trait AbstractDomain[U[A <: ModelTrait],A <: ModelTrait] {
  def getResult():U[A]
}
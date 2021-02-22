package io.github.aksharp.tc

import cats.Applicative

trait Processor[F[_], FF, I, O] {

  def process(
               featureFlags: FF,
               validatedRequest: I
             )
             (implicit A: Applicative[F]): F[O]
}

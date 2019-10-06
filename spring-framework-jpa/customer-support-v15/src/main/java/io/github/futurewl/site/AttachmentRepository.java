package io.github.futurewl.site;

import io.github.futurewl.site.entities.Attachment;

public interface AttachmentRepository extends GenericRepository<Long, Attachment> {
    Iterable<Attachment> getByTicketId(long ticketId);
}
